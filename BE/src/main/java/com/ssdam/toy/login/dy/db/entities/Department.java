package com.ssdam.toy.login.dy.db.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "department")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@Getter
public class Department {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
}
