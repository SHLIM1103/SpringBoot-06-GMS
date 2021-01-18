package com.example.demo.sts.web;

import com.amazonaws.services.dynamodbv2.xspec.M;
import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.enm.Table;
import org.springframework.web.bind.annotation.*;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeRepository;
import com.example.demo.sts.service.GradeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

@RequestMapping("/grades")
@RestController
public class GradeController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired GradeService gradeService;
    @Autowired GradeRepository gradeRepository;

    @PostMapping("")
    public Messenger register(@RequestBody Grade g){
        gradeRepository.save(g);
        return Messenger.SUCCESS;
    }
   
    @GetMapping("/register")
    public Messenger registerMany(){
    	var map = new HashMap<String, String>();
    	logger.info("Grade List Register ...");
    	gradeService.insertMany();
    	map.put("TOTAL_COUNT", Sql.TOTAL_COUNT.toString() + Table.GRADES);
        return gradeRepository.count() != 0 ? Messenger.SUCCESS : Messenger.FAILURE;
    }
    
}