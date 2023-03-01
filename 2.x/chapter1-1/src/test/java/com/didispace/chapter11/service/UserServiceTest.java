package com.didispace.chapter11.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;//引入这个服务

    @Test
    @Rollback
    void insertTest() {
        // 执行完该方法进行回滚操作
    }
}