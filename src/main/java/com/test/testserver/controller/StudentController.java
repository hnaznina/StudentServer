package com.test.testserver.controller;



import com.test.testserver.service.StudentService;
import com.test.testserver.vo.StudentVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/{id}")
    public StudentVO getStudent(@PathVariable Integer id){


        return studentService.getStudent(id);
    }

    @PostMapping(value = "/addstudent")
    public void addStudent(@RequestBody StudentVO newStudent){

        log.info(newStudent);

        studentService.addStudent(newStudent);

    }

    @DeleteMapping(value = "/deletestudent/{id}")
    public void deleteStudent(@PathVariable Integer id){

        studentService.deleteStudent(id);
    }

    @PutMapping(value = "/updatestudent")
    public void updateStudent(@RequestBody StudentVO student){

        studentService.updateStudent(student);

    }

}
