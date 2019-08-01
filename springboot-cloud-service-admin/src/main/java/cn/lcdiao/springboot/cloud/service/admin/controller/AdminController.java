package cn.lcdiao.springboot.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author diao
 * @date 2019/7/30
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "hi")
    public String sayHi(String message) {
        return String.format("Hi your message is : %s ,port : %s",message,port);
    }
}
