package com.kh.member.model.service;

import com.kh.member.model.vo.Member;

public interface MemberService {
	Member loginMember(String userId, String userPwd);

	int insertMember(Member m);

	boolean checkId(String inputId);

	String findId(String userName, String userPno);

	boolean findPwd(String userId, String userName, String userPno);

	int changePwd(String userId, String userPwd);

	Member updateMember(Member m);

	int updateProfile(Member m);

	boolean checkPno(String pno);

	int mileagePlus(int mileage, String userId);

}
