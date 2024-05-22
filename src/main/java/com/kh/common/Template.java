package com.kh.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	
	//마이바티스 sqlSession 얻어오기
	public static SqlSession getSession() {
		
		//mybatis-config 파일을 읽어서 해당 설정대로 sqlSession 객체를 반환받기
		SqlSession sqlSession = null;
		
		String resource = "/mybatis-config.xml";
		
		try {
			//입력한 config파일 경로로 연결하는 inputStream을 얻어오기
			InputStream inputStream = Resources.getResourceAsStream(resource);
			//얻어온 inputStream을 이용하여 SqlSessionFactory 얻어오기
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//SqlSessioFactory로부터 mybatis 구문을 사용하기 위한 sqlSession 객체 얻어오기
			//openSession(true/false) : 이때 true / false를 통해 autoCommit : false 자동커밋하지 않음
			sqlSession = sqlSessionFactory.openSession(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSession; //얻어낸 sqlSession 객체 반환하기
	}
}
