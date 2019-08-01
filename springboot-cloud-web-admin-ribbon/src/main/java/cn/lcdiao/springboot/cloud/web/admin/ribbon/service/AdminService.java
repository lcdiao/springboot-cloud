package cn.lcdiao.springboot.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author diao
 * @date 2019/7/31
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://springboot-cloud-service-admin/hi?message=" + message,String.class);
    }

    //熔断机制触发时（服务提供者宕机）执行该方法
    public String hiError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
