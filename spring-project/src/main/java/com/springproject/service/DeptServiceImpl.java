package com.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dao.DeptDao;
import com.springproject.dto.Dept;

//1. service의 역할을 하는 클래스, 2. 자동으로 bean이 되어 스프링 컨테이너에 등록된다.
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired //스프링 컨테이너가 의존성을 만들어준다.
	DeptDao deptDao;
	
	//의존성 만드는 법 첫번째
	/*
	DeptDao deptDao;
	public DeptServiceImpl(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	*/
	
	//의존성 만드는 법 두번째
	/*
	DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	*/
	
	//의존성 만드는 법 세번째
	@Override
	public List<Dept> selectList() {
		return deptDao.selectList();
	}
}
