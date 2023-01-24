package com.ssdam.toy.login.dy.db.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EmployeeRes {
    String id;
    String name;
    String dep_name;
}
