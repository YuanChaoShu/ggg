package com.mybatis01.test;

import org.junit.Before;

import com.mybatis01.dao.DeptDao;
import com.mybatis01.pojo.Dept;

public class Test {
private DeptDao dao;
	@Before
	public void init() {
	dao = new DeptDao();
	}
@org.junit.Test
public void test(){
	//System.out.println(dao.findById(10));
	System.out.println(dao.findAll());
}

@org.junit.Test
public void add(){
	Dept dept = new Dept();
	dept.setDeptno(50);
	dept.setDname("销售部");
	dept.setLoc("长沙");
}
}
