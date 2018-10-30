package com.sqp.spring.cloud.demo.controller;

import com.sqp.spring.cloud.demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户接口", tags = { "用户接口" })
@RequestMapping("user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "根据用户ID获取用户信息")
    @RequestMapping(value = "/id", method = { RequestMethod.POST })
    public User searchAlarmsForShow(String userId) {
        User user = new User("12345322","John",26);
        return user;
    }
}
