package com.ssdam.hrm.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LoginService loginService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllMembers() {
        List<UserDto> userDtoList = loginService.getAllMembers();
        return new ResponseEntity<List<UserDto>>(userDtoList, HttpStatus.OK);
    }

    @PostMapping(value = "/regist")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto) {
        logger.info("Inform : {}", userDto);
        UserDto userInfo = loginService.regist(userDto);

        return new ResponseEntity<UserDto>(userInfo, HttpStatus.OK);
    }

}
