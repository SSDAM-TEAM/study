package com.ssdam.toy.login.dy.service;

import com.ssdam.toy.login.dy.db.request.EmploeeReq;
import com.ssdam.toy.login.dy.db.response.EmployeeRes;

public interface SignService {
    EmployeeRes SignIn(EmploeeReq emploeeReq);
}
