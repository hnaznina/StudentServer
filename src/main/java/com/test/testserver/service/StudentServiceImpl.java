package com.test.testserver.service;

import com.test.testserver.dao.StudentDao;
import com.test.testserver.repository.StudentRepository;
import com.test.testserver.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentVO getStudent(Integer id){
        //return studentDao.getStudent(id);
        return studentRepository.findById(id).get();

    }

    @Override
    public void addStudent(StudentVO newStudent){
       //studentDao.addStudent(newStudent);
        studentRepository.save(newStudent);
    }

    @Override
    public void deleteStudent(Integer id){

//        studentDao.deleteStudent(id);
        studentRepository.deleteById(id);

    }

    @Override
    public void updateStudent(StudentVO student){

//        studentDao.updateStudent(student);
        studentRepository.save(student);
    }

}
