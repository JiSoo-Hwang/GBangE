package com.kh.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.model.vo.Member;

public class MemberDao {

	public int insertMember(SqlSession sqlSession, Member m) {
		return sqlSession.insert("memberMapper.insertMemeber",m);
	}

	public Member loginMember(SqlSession sqlSession, String userId, String userPwd) {
		return null;
	}

	public boolean checkId(SqlSession sqlSession, String inputId) {

		return false;

	}

	public String findId(SqlSession sqlSession, String userName, String userPno) {

		return null;
	}

	public boolean findPwd(SqlSession sqlSession, String userId, String userName, String userPno) {

		return false;

	}

	public int changePwd(SqlSession sqlSession, String userId, String userPwd) {

		return 0;
	}

	public int updateMember(SqlSession sqlSession, Member m) {

		return 0;
	}

	public Member selectMember(SqlSession sqlSession, String memberId) {

		return null;
	}

	public int updateProfile(SqlSession sqlSession, Member m) {

		int result = 0;

		return result;
	}

	public boolean checkPno(SqlSession sqlSession, String pno) {

		boolean flag = false;

		return flag;

	}

	public int mileagePlus(SqlSession sqlSession, int mileage, String userId) {

		int result = 0;

		return result;
	}

}
