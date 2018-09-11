package com.lc.mapper;

import com.lc.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    List<Student> select(Map map);
}
