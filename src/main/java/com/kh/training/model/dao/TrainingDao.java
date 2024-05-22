package com.kh.training.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.common.model.vo.PageInfo;
import com.kh.training.model.vo.Attachment;
import com.kh.training.model.vo.Reply;
import com.kh.training.model.vo.Shoes;
import com.kh.training.model.vo.Training;
import com.kh.training.model.vo.TrainingCategory;

public class TrainingDao {

	public ArrayList<TrainingCategory> selectCategoryList(SqlSession sqlSession) {
		ArrayList<TrainingCategory> tCList = (ArrayList)sqlSession.selectList("trainingMapper.selectCategoryList");
		return tCList;
	}
	
	public int selectTrainingNo(SqlSession sqlSession) {
		return sqlSession.selectOne("trainingMapper.selectTrainingNo");
	}

	public int insertTraining(SqlSession sqlSession, Training t, int memberNo) {
		return sqlSession.insert("trainingMapper.insertTraining");
	}

	public int increaseCount(SqlSession sqlSession, int tno) {
		int result = 0;
		return result;
	}

	public int listCount(SqlSession sqlSession) {

		int listCount = 0;

		return listCount;
	}

	public ArrayList<Training> selectList(SqlSession sqlSession, PageInfo pi) {

		ArrayList<Training> list = new ArrayList<>();
		return list;
	}

	public int insertAttachment(SqlSession sqlSession, Attachment at, int trainingNo) {

		int result = 0;
		return result;
	}

	public Training selectTraining(SqlSession sqlSession, int tno) {
		Training t = new Training();
		return t;
	}

	public Attachment selectAttachment(SqlSession sqlSession, int tno) {
		Attachment at = null;
		return at;
	}

	public int updateTraining(SqlSession sqlSession, Training t) {
		int result = 0;
		return result;
	}

	public int updateAttachment(SqlSession sqlSession, Attachment at) {
		int result = 0;
		return result;
	}

	public int deleteTraining(SqlSession sqlSession, int tno) {
		int result = 0;
		return result;
	}

	public int insertReply(SqlSession sqlSession, Reply r) {
		int result = 0;
		return result;
	}

	public ArrayList<Reply> selectReplyList(SqlSession sqlSession, int refTno) {
		ArrayList<Reply> list = new ArrayList<>();
		return list;
	}

	public int deleteReply(SqlSession sqlSession, Reply r) {
		int result = 0;
		return result;
	}

	public int updateReply(SqlSession sqlSession, String originReply, String changeReply, int refTno, String replyWriter) {
		int result = 0;
		return result;
	}

	public int updateLikes(SqlSession sqlSession, int tno) {
		int result = 0;
		return result;
	}

	public int selectLikes(SqlSession sqlSession, int tno) {
		int likes = 0;
		return likes;
	}

	public ArrayList<Shoes> selectShoesList(SqlSession sqlSession) {
		ArrayList<Shoes> sList = new ArrayList<>();
		return sList;
	}

	public Shoes selectShoes(SqlSession sqlSession, int tno) {
		Shoes s = null;
		return s;
	}

	public ArrayList<Training> searchByTitle(SqlSession sqlSession, PageInfo pi, String keyword) {
		ArrayList<Training> searchList = new ArrayList<>();
		return searchList;
	}

	public ArrayList<Training> searchByCategory(SqlSession sqlSession, PageInfo pi, String keyword) {
		ArrayList<Training> searchList = new ArrayList<>();
		return searchList;
	}

	public ArrayList<Training> searchByContent(SqlSession sqlSession, PageInfo pi, String keyword) {
		ArrayList<Training> searchList = new ArrayList<>();
		return searchList;
	}

}
