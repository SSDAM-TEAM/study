package com.ssdam.toy.login.dy.db.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Employee {
    @Id
    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String password;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "dep_id")
//    @Column
    private Department department;

    @Column(name = "phone_num")
    private String phoneNum;
}
