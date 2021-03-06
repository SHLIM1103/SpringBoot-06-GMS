package com.example.demo.cmm.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.utl.Box;
import com.example.demo.cmm.utl.Vector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommonService {
    @Autowired Box<String> bx;
    @Autowired Vector<String> vc;

    @Transactional
    public int generateDB() {
        var map = new HashMap<String,String>();
        List<String> l1 = Arrays.asList(
                Sql.DROP_TABLE.toString()+"replies",
                Sql.DROP_TABLE.toString()+"articles",
                Sql.DROP_TABLE.toString()+"grades",
                Sql.DROP_TABLE.toString()+"teachers",
                Sql.DROP_TABLE.toString()+"students",
                Sql.DROP_TABLE.toString()+"subjects",
                Sql.DROP_TABLE.toString()+"managers");
        List<String> l2 = Arrays.asList(
                Sql.CREATE_MANAGERS.toString(),
                Sql.CREATE_SUBJECTS.toString(),
                Sql.CREATE_STUDENTS.toString(),
                Sql.CREATE_TEACHERS.toString(),
                Sql.CREATE_GRADES.toString(),
                Sql.CREATE_ARTICLES.toString(),
                Sql.CREATE_REPLIES.toString());
        for(int i = 0; i < l1.size(); i++) {
            map.put("DROP_TABLE", l1.get(i));
            map.clear();
        }
        for(int i = 0; i < l2.size(); i++) {
            map.put("CREATE_TABLE", l2.get(i));
            map.clear();
        }
        bx.put("TABLE_COUNT", Sql.TABLE_COUNT.toString());

        return 0;
    }

    public int totalCount() {
        return 0;
    }

    public int dropTable() {
        return 0;
    }

}