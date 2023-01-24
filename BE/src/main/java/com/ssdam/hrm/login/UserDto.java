package com.ssdam.hrm.login;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // JPA가 관리하는 Class임을 명명 한다 = @Entity, DB Table 이름과 연결
@Table(name = "user")
public class UserDto {

    @Id // Primary Key
    @Column
    private String id;
    @Column
    private String password;

}
