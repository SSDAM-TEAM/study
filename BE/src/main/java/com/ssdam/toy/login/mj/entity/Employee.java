package com.ssdam.toy.login.mj.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Employee {
    @Id //primary key 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String employeeId;

    @Column(nullable = false, length = 45)
    private String employeeName;

    @Column(nullable = false, length = 20)
    private String employeePassword;

}
