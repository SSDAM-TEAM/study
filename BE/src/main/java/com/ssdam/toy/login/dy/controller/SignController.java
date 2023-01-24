package com.ssdam.toy.login.dy.controller;

import com.ssdam.toy.login.dy.db.entities.Employee;
import com.ssdam.toy.login.dy.db.request.EmploeeReq;
import com.ssdam.toy.login.dy.db.response.EmployeeRes;
import com.ssdam.toy.login.dy.repository.SignRepository;
import com.ssdam.toy.login.dy.service.SignService;
import com.ssdam.toy.login.dy.service.SignServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sign")
public class SignController {
    private static final Logger logger = LoggerFactory.getLogger(SignController.class);

    @Autowired
    private SignServiceImpl signServiceimpl;

    @PostMapping("/in")
    public ResponseEntity<?> signIn(@RequestBody EmploeeReq emploeeReq){

        EmployeeRes employeeRes = signServiceimpl.SignIn(emploeeReq);

        logger.info(employeeRes.toString());

        if(employeeRes != null){
            return new ResponseEntity<EmployeeRes>(employeeRes, HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }
}
