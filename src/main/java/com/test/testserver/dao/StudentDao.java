package com.test.testserver.dao;

import com.test.testserver.vo.StudentVO;

public interface StudentDao {
    StudentVO getStudent(Integer id);

    void addStudent(StudentVO newStudent);

    void deleteStudent(Integer id);

    void updateStudent(StudentVO newStudent);
}
