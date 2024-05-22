package com.kh.member.model.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.common.Template;
import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;

public class MemberServiceImpl implements MemberService{
	
	//memberDao 만들어두기
	private MemberDao dao = new MemberDao();
	
	//회원가입 메소드
	@Override
	public int insertMember(Member m) {
		
		//Connection 객체의 역할을 하는 sqlSession 객체 얻어오기
		SqlSession sqlSession = Template.getSession();
		
		int result = dao.insertMember(sqlSession, m);
		
		if(result>0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		return result;
	}

	//로그인 메소드
	@Override
	public Member loginMember(String userId, String userPwd) {
		return null;
	}

	@Override
	public boolean checkId(String inputId) {
		return false;
	}

	@Override
	public String findId(String userName, String userPno) {
		return null;
	}

	@Override
	public boolean findPwd(String userId, String userName, String userPno) {
		return false;
	}

	@Override
	public int changePwd(String userId, String userPwd) {
		return 0;
	}

	@Override
	public Member updateMember(Member m) {
		return null;
	}

	@Override
	public int updateProfile(Member m) {
		return 0;
	}

	@Override
	public boolean checkPno(String pno) {
		return false;
	}

	@Override
	public int mileagePlus(int mileage, String userId) {
		return 0;
	}

}
