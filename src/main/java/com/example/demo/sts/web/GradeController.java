package com.example.demo.sts.web;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.service.CommonMapper;
import com.example.demo.cmm.utl.Pagination;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeMapper;
import com.example.demo.sts.service.GradeService;
import com.example.demo.sts.service.SubjectService;
import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.uss.service.StudentMapper;
import com.example.demo.uss.service.StudentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/grades")
@RestController
public class GradeController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired StudentService studentService;
    @Autowired GradeService gradeService;
    @Autowired StudentMapper studentMapper;
    @Autowired GradeMapper gradeMapper;
    @Autowired SubjectService subjectService;
    @Autowired TeacherService teacherService;
    @Autowired ManagerService managerService;
    @Autowired CommonMapper commonMapper;
    @Autowired Pagination page;
    
    @PostMapping("")
    public Messenger register(@RequestBody Grade g){
        return gradeMapper.insert(g)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
   
//    @GetMapping("/register")
//    public Messenger registerMany(){
//    	var map = new HashMap<String, String>();
//    	logger.info("Grade List Register ...");
//    	gradeService.insertMany();
//    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.GRADES);
//        return commonMapper.totalCount(map)!=0?Messenger.SUCCESS:Messenger.FAILURE;
//    }
    
    
	
}
