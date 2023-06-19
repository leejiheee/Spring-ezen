package com.Example.springquiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Example.springquiz.dao.StudentDao;
import com.Example.springquiz.dto.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<Student> selectList() {
		return studentDao.selectList();
	}
}
