package com.ssdam.toy.login.sh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Boolean login(Employee employee){
        Employee result = employeeRepository.findByIdAndPassword(employee.getId(), employee.getPassword());
        return result != null;
    }
}
