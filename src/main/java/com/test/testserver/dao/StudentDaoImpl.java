package com.test.testserver.dao;


import com.test.testserver.vo.StudentVO;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {

    private Map<Integer, StudentVO> studentDb;


    @PostConstruct
    public void init(){
        studentDb = new HashMap();
    }

    @Override
    public StudentVO getStudent(Integer id){

        return studentDb.get(id);
    }

    @Override
    public void addStudent(StudentVO newStudent){

        studentDb.put(newStudent.getId(), newStudent);

    }

    @Override
    public void deleteStudent(Integer id){

        studentDb.remove(id);

    }

    @Override
    public void updateStudent(StudentVO newStudent){

        studentDb.put(newStudent.getId(), newStudent);

    }




}
