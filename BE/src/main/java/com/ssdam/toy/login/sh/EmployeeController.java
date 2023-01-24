package com.ssdam.toy.login.sh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class EmployeeController {

    EmployeeService employeeService;

//    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Employee input){
        HttpStatus status = HttpStatus.UNAUTHORIZED;
        Boolean isLogin = employeeService.login(input);
        if(isLogin)
            status = HttpStatus.OK;
        return new ResponseEntity<Boolean>(isLogin, status);
        // 로그인 성공 실패 여부
    }
}
