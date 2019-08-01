package cn.lcdiao.springboot.cloud.web.admin.feign.service;

import cn.lcdiao.springboot.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author diao
 * @date 2019/7/31
 */
@FeignClient(value = "springboot-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam(value = "message") String message);
}
