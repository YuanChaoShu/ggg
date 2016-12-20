package com.mybatis01.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis01.pojo.Dept;

public class DeptDao {
	private static SqlSessionFactory factory;
	static{
		
		try {
			String resource = "mybatis-config.xml";
			InputStream in;
			in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public int add(Dept dept){
		SqlSession session = factory.openSession();
		int count = 0;
		try{
			count = session.insert("addDept",dept);
			session.commit();
		}catch(Exception e){
			//回滚事务
			session.rollback();
		}
		finally{
			session.close();
		}
		return count;
	}
	
	public List<Dept> findAll(){
		SqlSession session = factory.openSession();
		List<Dept> depts = null;
		try{
			depts = session.selectList("findAll");
		}
		finally{
			session.close();
		}
		return depts;
	}
	
	
	public Dept findById(Integer id){
		SqlSession session = factory.openSession();
		Dept dept = null;
		try{
		dept = session.selectOne("findById",id);
		}
		finally{
		session.close();
		}
		return dept;
}
}
