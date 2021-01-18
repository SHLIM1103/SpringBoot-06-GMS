package com.example.demo.sts.web;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.cmm.service.CommonMapper;
import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.Pagination;
import com.example.demo.sts.service.GradeMapper;
import com.example.demo.sts.service.GradeService;
import com.example.demo.sts.service.Subject;
import com.example.demo.sts.service.SubjectMapper;
import com.example.demo.sts.service.SubjectService;
import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.uss.service.StudentMapper;
import com.example.demo.uss.service.StudentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/subjects")
@RestController
public class SubjectController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired StudentService studentService;
    @Autowired GradeService gradeService;
    @Autowired StudentMapper studentMapper;
    @Autowired GradeMapper gradeMapper;
    @Autowired TeacherMapper teacherMapper;
    @Autowired SubjectMapper subjectMapper;
    @Autowired SubjectService subjectService;
    @Autowired TeacherService teacherService;
    @Autowired ManagerService managerService;
    @Autowired CommonMapper commonMapper;
    @Autowired Pagination page;
    @Autowired Box<String> bx;
    
    @PostMapping("")
    public Messenger register(@RequestBody Subject s){
    	
    	// Get the List 
        List<String> g 
            = Arrays.asList("geeks", "for", "geeks"); 
  
        // Collect the list as map 
        // by groupingBy() method 
       subjectService.groupBySubject(bx);
        return subjectMapper.insert(s)==1?Messenger.SUCCESS:Messenger.FAILURE;
    }
   
    @GetMapping("/groupBy/{examDate}/{subNum}")
    public Map<?,?> totalScoreGroupBySubject(
    		@PathVariable String examDate,
    		@PathVariable String subNum){
    	bx.put("examDate", examDate);
    	bx.put("subNum", subNum);
    	subjectService.groupBySubject(bx);
    	return null;
    }
    @GetMapping("/groupByGrade/{examDate}/{subNum}")
    public Map<?,?> groupByGrade(
    		@PathVariable String examDate,
    		@PathVariable String subNum){
    	bx.put("examDate", examDate);
    	bx.put("subNum", subNum);
    	subjectService.groupBySubject(bx);
    	return null;
    }
    
    
    

}









