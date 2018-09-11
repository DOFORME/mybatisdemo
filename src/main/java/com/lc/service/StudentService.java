package com.lc.service;

import com.lc.mapper.StudentMapper;
import com.lc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> select(Map<String, String> map) {
        map = new HashMap<>();
        map.put("id", "20180001");
        return studentMapper.select(map);
    }
}
