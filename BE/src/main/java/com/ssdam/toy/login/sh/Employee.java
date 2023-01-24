package com.ssdam.toy.login.sh;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Employee {

    @Id
    @Column(length = 15)
    private String id;

    @Column(length = 45)
    private String name;

    @Column(length = 20)
    private String password;

    @Builder
    public Employee(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
