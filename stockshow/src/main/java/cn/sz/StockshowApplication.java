package cn.sz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StockshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockshowApplication.class, args);
    }

}
