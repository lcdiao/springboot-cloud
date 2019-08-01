package cn.lcdiao.springboot.cloud.web.admin.ribbon.service;

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

    public String sayHi(String message) {
        return restTemplate.getForObject("http://springboot-cloud-service-admin/hi?message=" + message,String.class);
    }

}
