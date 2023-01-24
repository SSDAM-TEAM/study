package com.ssdam.toy.login.dy.init;

import com.ssdam.toy.login.dy.service.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initalize implements CommandLineRunner {
    private static final Logger LOG =
            LoggerFactory.getLogger(Initalize.class);
    @Autowired
    private CommonService commonService;
    @Override
    public void run(String...args) throws Exception {
        commonService.makeDepartment();
    }
}

