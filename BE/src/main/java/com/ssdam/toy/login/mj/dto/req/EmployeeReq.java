package com.ssdam.toy.login.mj.dto.req;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EmployeeReq {
    private String employeeId;
    private String employeeName;
    private String employeePassword;
}
