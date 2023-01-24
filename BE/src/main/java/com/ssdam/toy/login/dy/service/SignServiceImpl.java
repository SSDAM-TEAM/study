package com.ssdam.toy.login.dy.service;

import com.ssdam.toy.login.dy.db.entities.Employee;
import com.ssdam.toy.login.dy.db.request.EmploeeReq;
import com.ssdam.toy.login.dy.db.response.EmployeeRes;
import com.ssdam.toy.login.dy.repository.DepatmentRepository;
import com.ssdam.toy.login.dy.repository.SignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SignServiceImpl implements SignService{

    @Autowired
    private SignRepository signRepository;

//    @Autowired
//    private DepatmentRepository depatmentRepository;

    @Autowired
    private  CommonService commonService;

    @Override
    public EmployeeRes SignIn(@RequestBody EmploeeReq emploeeReq) {

        Employee employee = Employee.builder()
                .id(emploeeReq.getId())
                .name(emploeeReq.getName())
                .password(emploeeReq.getPassword())
                .department(commonService.findDepartment(emploeeReq.getDepartmentId()))
                .phoneNum(emploeeReq.getPhoneNum())
                .build();

//        System.out.println(employee);

        try {
            Employee employee2 = signRepository.save(employee);
            EmployeeRes employeeRes = EmployeeRes.builder()
                    .id(employee2.getId())
                    .name(employee2.getName())
                    .dep_name((employee2.getDepartment().getName()))
                    .build();

            return employeeRes;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

//        EmployeeRes employeeRes = EmployeeRes.builder()
//                .id(employee2.getId())
//                .name(employee2.getName())
//                .build();
//
//        return employeeRes;
    }
}
