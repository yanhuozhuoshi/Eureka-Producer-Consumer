package com.yanhuo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 卡卡罗特
 * @FeignClient 声明是 feign 的调用
 * value = "EurekaProducer" value 后面的值必须和提供者的服务名一致
 */
@FeignClient(value = "EurekaProducer")
public interface UserService {
    /**这里实现了远程注入服务
     * 描述: 下单的方法 这里的路径必须和提供者的路径一致*
     * @param :
     * @return java.lang.String
     */
    @GetMapping("doTest")
    String doOrder();
}
