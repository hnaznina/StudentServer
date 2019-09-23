package com.test.testserver.repository;

import com.test.testserver.vo.StudentVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentVO, Integer> {

}
