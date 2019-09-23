package com.test.testserver.service;

import com.test.testserver.vo.StudentVO;

import java.util.Optional;

public interface StudentService {
    StudentVO getStudent(Integer id);

    void addStudent(StudentVO newStudent);

    void deleteStudent(Integer id);

    void updateStudent(StudentVO student);
}
