package com.didispace.chapter11.controller;

import com.didispace.chapter11.utils.LocaleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.didispace.chapter11.service.HelloService;
import lombok.extern.slf4j.Slf4j;

@RestController
public class HelloController {
    @Autowired
    private LocaleUtil localeUtil;

    @RequestMapping("/hello")
    public String index() {
        String message = localeUtil.getMessage("welcome");
        return message;
    }

}