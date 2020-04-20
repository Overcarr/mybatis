package com.logan.mybatis6.service;

import com.logan.mybatis6.bean.Student;
import com.logan.mybatis6.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
    @Autowired
    public StudentMapper studentMapper;

    public Integer findStudent(Student student){
        int i = studentMapper.updateByPrimaryKey(student);
        return i;
    }
}
