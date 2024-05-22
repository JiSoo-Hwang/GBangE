package com.kh.member.model.service;

import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;

public class MemberServiceImpl implements MemberService{
	
	//memberDao 만들어두기
	private MemberDao dao = new MemberDao();
	
	//회원가입 메소드
	@Override
	public Member loginMember(String userId, String userPwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMember(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkId(String inputId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findId(String userName, String userPno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findPwd(String userId, String userName, String userPno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int changePwd(String userId, String userPwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member updateMember(Member m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateProfile(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkPno(String pno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int mileagePlus(int mileage, String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
