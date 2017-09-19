package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/*
 * 1. @OneToOne
 * 2. @OneToMany
 * 3. @ManyToOne
 * 4. @ManyToMany
 */
@Entity
@Table(name="tbl_dept")
@Data
@ToString(exclude={"emps"})
public class MyDept {
	
	@Id
	Integer deptno;
	String dname;
	String loc;
	
	@OneToMany(mappedBy="dept", fetch=FetchType.LAZY)
	List<MyEmp> emps;
}
