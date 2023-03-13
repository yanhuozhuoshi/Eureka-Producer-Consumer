package com.yanhuo.controller;

import com.yanhuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2023/3/13 23:07
 * @Description TODO
 * @Author 卡卡罗特
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 用户远程调用下单的接口
     *
     * @return
     */
    @GetMapping("userDoOrder")
    public String userDoOrder() {
        String result = userService.doOrder();
        System.out.println(result);
        return result;
    }

}
