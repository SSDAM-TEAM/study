package com.ssdam.toy.login.mj.service;

import com.ssdam.toy.login.mj.dto.req.EmployeeReq;
import com.ssdam.toy.login.mj.dto.res.EmployeeRes;
import com.ssdam.toy.login.mj.entity.Employee;
import com.ssdam.toy.login.mj.repository.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepo employeeRepo;
    @Override
    public ResponseEntity<EmployeeRes> login(EmployeeReq employeeReq) {
//        if(employeeRepo.findByEmployeeId(employeeReq.getEmployeeId()).orElse(null)!=null){
//
//        }
//        Employee employee = Employee.builder(){
//
//        }
        return null;
    }
}
