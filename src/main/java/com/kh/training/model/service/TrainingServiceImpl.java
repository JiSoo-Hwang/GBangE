package com.kh.training.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.common.Template;
import com.kh.common.model.vo.PageInfo;
import com.kh.training.model.dao.TrainingDao;
import com.kh.training.model.vo.Attachment;
import com.kh.training.model.vo.Reply;
import com.kh.training.model.vo.Shoes;
import com.kh.training.model.vo.Training;
import com.kh.training.model.vo.TrainingCategory;

public class TrainingServiceImpl {

	public ArrayList<TrainingCategory> selectCategoryList() {
		SqlSession sqlSession = Template.getsqlSession();
		ArrayList<TrainingCategory> tCList = new TrainingDao().selectCategoryList(sqlSession);
		sqlSession.close();
		return tCList;
	}

	public int insertTraining(Training t, Attachment at, int memberNo) {
		SqlSession sqlSession = Template.getsqlSession();

		int trainingNo = new TrainingDao().selectTrainingNo(sqlSession);
		t.setTrainingNo(trainingNo);
		
		int resultTr = new TrainingDao().insertTraining(sqlSession, t, memberNo);
		int resultAt = new TrainingDao().insertAttachment(sqlSession, at, trainingNo);
		if (resultTr * resultAt > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();

		return resultTr * resultAt;
	}

	public int increaseCount(int tno) {
		SqlSession sqlSession = Template.getsqlSession();
		int result = new TrainingDao().increaseCount(sqlSession, tno);
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		return result;
	}

	public int listCount() {
		SqlSession sqlSession = Template.getsqlSession();

		int listCount = new TrainingDao().listCount(sqlSession);

		sqlSession.close();

		return listCount;
	}

	public ArrayList<Training> selectList(PageInfo pi) {
		SqlSession sqlSession = Template.getsqlSession();
		ArrayList<Training> list = new TrainingDao().selectList(sqlSession, pi);

		sqlSession.close();

		return list;
	}

	public Training selectTraining(int tno) {
		SqlSession sqlSession = Template.getsqlSession();
		Training t = new TrainingDao().selectTraining(sqlSession, tno);
		sqlSession.close();
		return t;
	}

	public Attachment selectAttachment(int tno) {
		SqlSession sqlSession = Template.getsqlSession();
		Attachment at = new TrainingDao().selectAttachment(sqlSession, tno);
		sqlSession.close();
		return at;
	}

	public int updateTraining(Training t, Attachment at) {
		SqlSession sqlSession = Template.getsqlSession();
		int resultTr = new TrainingDao().updateTraining(sqlSession, t);

		int resultAt = 1;

		if (at != null) {
			if (at.getFileNo() != 0) {
				resultAt = new TrainingDao().updateAttachment(sqlSession, at);
			} else {
				resultAt = new TrainingDao().insertAttachment(sqlSession, at, at.getRefBno());
			}
		}

		if (resultTr * resultAt > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();

		return resultTr * resultAt;
	}

	public int deleteTraining(int tno) {
		SqlSession sqlSession = Template.getsqlSession();
		int result = new TrainingDao().deleteTraining(sqlSession, tno);
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int insertReply(Reply r) {
		SqlSession sqlSession = Template.getsqlSession();
		int result = new TrainingDao().insertReply(sqlSession, r);
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public ArrayList<Reply> selectReplyList(int refTno) {
		SqlSession sqlSession = Template.getsqlSession();
		ArrayList<Reply> list = new TrainingDao().selectReplyList(sqlSession, refTno);
		sqlSession.close();
		return list;
	}

	public int deleteReply(Reply r) {
		SqlSession sqlSession = Template.getsqlSession();
		int result = new TrainingDao().deleteReply(sqlSession, r);
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int updateReply(String originReply, String changeReply, String replyWriter, int refTno) {
		SqlSession sqlSession = Template.getsqlSession();
		int result = new TrainingDao().updateReply(sqlSession, originReply, changeReply, refTno, replyWriter);
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int updateLikes(int tno) {
		SqlSession sqlSession = Template.getsqlSession();
		int result = new TrainingDao().updateLikes(sqlSession, tno);
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int selectLikes(int tno) {
		SqlSession sqlSession = Template.getsqlSession();
		int likes = new TrainingDao().selectLikes(sqlSession, tno);
		sqlSession.close();
		return likes;
	}

	public ArrayList<Shoes> selectShoesList() {
		SqlSession sqlSession = Template.getsqlSession();
		ArrayList<Shoes> sList = new TrainingDao().selectShoesList(sqlSession);
		sqlSession.close();
		return sList;
	}

	public Shoes selectShoes(int tno) {
		SqlSession sqlSession = Template.getsqlSession();
		Shoes s = new TrainingDao().selectShoes(sqlSession, tno);
		sqlSession.close();
		return s;
	}

	public ArrayList<Training> searchByTitle(PageInfo pi, String keyword) {
		SqlSession sqlSession = Template.getsqlSession();
		ArrayList<Training> searchList = new TrainingDao().searchByTitle(sqlSession, pi, keyword);
		sqlSession.close();
		return searchList;
	}

	public ArrayList<Training> searchByCategory(PageInfo pi, String keyword) {
		SqlSession sqlSession = Template.getsqlSession();
		ArrayList<Training> searchList = new TrainingDao().searchByCategory(sqlSession, pi, keyword);
		sqlSession.close();
		return searchList;
	}

	public ArrayList<Training> searchByContent(PageInfo pi, String keyword) {
		SqlSession sqlSession = Template.getsqlSession();
		ArrayList<Training> searchList = new TrainingDao().searchByContent(sqlSession, pi, keyword);
		sqlSession.close();
		return searchList;
	}

}
