package com.ssdam.toy.login.dy.db.request;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
public class EmploeeReq {
    String id;
    String name;
    String password;
    int departmentId;
    String phoneNum;
}
