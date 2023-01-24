package com.ssdam.toy;

import com.ssdam.toy.login.sh.Employee;
import com.ssdam.toy.login.sh.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EmployeeTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @BeforeEach
    @Test
    void join(){
        Employee join = Employee.builder()
                .id("testId")
                .name("testName")
                .password("testPassword")
                .build();

        employeeRepository.save(join);

        Employee result = employeeRepository.findById(join.getId()).get();
        // 그냥 객체 자체를 비교하면 객체 주소가 달라서 false -> equals, hashcode
//        Assertions.assertThat(result).isEqualTo(join);
        Assertions.assertThat(result.getId()).isEqualTo(join.getId());
    }

    @Test
    void login(){
        Employee loginSuccess = Employee.builder().id("testId").password("testPassword").build();
        Employee loginFail = Employee.builder().id("testId").password("testFail").build();

        Employee result = employeeRepository.findByIdAndPassword(loginSuccess.getId(), loginSuccess.getPassword());
        //        Assertions.assertThat(result).isEqualTo(loginSuccess);
        Assertions.assertThat(result.getId()).isEqualTo(loginSuccess.getId());

        Employee result2 = employeeRepository.findByIdAndPassword(loginFail.getId(), loginFail.getPassword());
        Assertions.assertThat(result2).isNull();
    }
}
