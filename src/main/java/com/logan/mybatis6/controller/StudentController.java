package com.logan.mybatis6.controller;

import com.logan.mybatis6.Exception.StudentException;
import com.logan.mybatis6.bean.Student;
import com.logan.mybatis6.common.bean.Result;
import com.logan.mybatis6.eums.StudentErrorCodeAndMsg;
import com.logan.mybatis6.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PutMapping("updateStudent")
    public Result updateStudent(@RequestBody Student student){
        if(student.getsId() ==null){
            throw new StudentException(StudentErrorCodeAndMsg.Student_number_does_not_exit);
        }
        Integer i = studentService.findStudent(student);
        return new Result(i);
    }
}
