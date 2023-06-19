package com.Example.springquiz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.Example.springquiz.dto.Student;

@Mapper
public interface StudentDao {
	public List<Student> selectList();
}
