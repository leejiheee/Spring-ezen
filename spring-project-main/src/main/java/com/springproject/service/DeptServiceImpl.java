package com.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dao.DeptDao;
import com.springproject.dto.Dept;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
    DeptDao deptDao;

	@Override
	public List<Dept> selectList() {
		return deptDao.selectList();
	}

}
