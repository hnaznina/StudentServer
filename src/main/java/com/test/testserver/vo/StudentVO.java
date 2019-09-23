package com.test.testserver.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Student")
public class StudentVO {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;

}
