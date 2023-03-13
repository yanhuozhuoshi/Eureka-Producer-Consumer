package com.yanhuo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2023/3/13 22:49
 * @Description TODO
 * @Author 卡卡罗特
 */
@RestController
public class TestController {
    /**
     * 测试服务访问接口
     *
     * @return
     */
    @GetMapping("/doTest")
    public String doTest() {
        System.out.println("有用户调用服务了");
        return "调用成功";
    }
}
