package com.mybatis01.pojo;

import java.io.Serializable;
/**
 * 实体类/封装类/pojo/javaBean
 * @author Administrator
 *
 */
public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer deptno;
	private String dname;
	private String loc;
	
	public Dept() {
		
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
}
