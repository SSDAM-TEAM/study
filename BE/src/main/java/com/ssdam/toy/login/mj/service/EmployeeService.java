package com.ssdam.toy.login.mj.service;

import com.ssdam.toy.login.mj.dto.req.EmployeeReq;
import com.ssdam.toy.login.mj.dto.res.EmployeeRes;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    ResponseEntity<EmployeeRes> login(EmployeeReq employeeReq);
}
