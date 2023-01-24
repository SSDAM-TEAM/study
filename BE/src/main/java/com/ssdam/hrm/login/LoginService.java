package com.ssdam.hrm.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRepo loginRepo;

    @GetMapping
    public List<UserDto> getAllMembers() {
        List<UserDto> memberList = new ArrayList<>();
        loginRepo.findAll().forEach(e -> memberList.add(e));
        return memberList;
    }


    public UserDto regist(UserDto userInfo) {
        UserDto userReturn = loginRepo.save(userInfo);
        return userReturn;
    }
}
