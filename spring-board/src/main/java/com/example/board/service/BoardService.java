package com.example.board.service;

import java.util.List;

import com.example.board.dto.Board;



public interface BoardService {
	public int maxNum() throws Exception;
	
	public void insertData(Board board) throws Exception;
	
	public int getDataCount(String searchKey, String searchValue) throws Exception;
	
	public List<Board> getLists(int start,int end,
			String searchKey, String searchValue) throws Exception;
	
	public Board getReadData(int num) throws Exception;
	
	public void updateHitCount(int num) throws Exception;
	
	public void updateData(Board board) throws Exception;
	
	public void deleteData(int num) throws Exception;
}
