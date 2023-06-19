package com.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.dao.DeptDao;
import com.springproject.dto.Dept;
import com.springproject.service.DeptService;

@RestController
public class DeptController {
    @Autowired
    DeptService deptservice;
    
    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = deptservice.selectList();
        return list;
    }
}
