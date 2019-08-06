package cn.lcdiao.springboot.cloud.web.admin.feign.service.hystrix;

import cn.lcdiao.springboot.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author diao
 * @date 2019/7/31
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is : %s ,but request bad",message);
    }
}
