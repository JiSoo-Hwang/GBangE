package com.kh.training.model.service;

import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.training.model.vo.Attachment;
import com.kh.training.model.vo.Reply;
import com.kh.training.model.vo.Shoes;
import com.kh.training.model.vo.Training;
import com.kh.training.model.vo.TrainingCategory;

public interface TrainingService {
	public ArrayList<TrainingCategory> selectCategoryList();

	public int insertTraining(Training t, Attachment at, int memberNo);

	public int increaseCount(int tno);

	public int listCount();

	public ArrayList<Training> selectList(PageInfo pi);

	public Training selectTraining(int tno);

	public Attachment selectAttachment(int tno);

	public int updateTraining(Training t, Attachment at);

	public int deleteTraining(int tno);

	public int insertReply(Reply r);

	public ArrayList<Reply> selectReplyList(int refTno);

	public int deleteReply(Reply r);

	public int updateReply(String originReply, String changeReply, String replyWriter, int refTno);

	public int updateLikes(int tno);

	public int selectLikes(int tno);

	public ArrayList<Shoes> selectShoesList();

	public Shoes selectShoes(int tno);

	public ArrayList<Training> searchByTitle(PageInfo pi, String keyword);

	public ArrayList<Training> searchByCategory(PageInfo pi, String keyword);

	public ArrayList<Training> searchByContent(PageInfo pi, String keyword);

}
