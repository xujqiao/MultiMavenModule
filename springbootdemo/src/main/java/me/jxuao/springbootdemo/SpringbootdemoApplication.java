package me.jxuao.springbootdemo;

import me.jxuao.springbootdemo.pojo.Car;
import me.jxuao.springbootdemo.service.Quote;
import me.jxuao.springbootdemo.service.Zhihu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class SpringbootdemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootdemoApplication.class, args);
        SpringApplication app = new SpringApplication(SpringbootdemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }

//    public static void main(String[] args) {
//        RestTemplate restTemplate= new RestTemplate();
//        Zhihu zhihu = restTemplate.getForObject(
//                "http://localhost:8080/learn/test",
//                Zhihu.class
//        );
//        System.out.println(zhihu);
//    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Zhihu zhihu = restTemplate.getForObject(
                    "http://localhost:8080/learn/test",
                    Zhihu.class
            );
            System.out.println(zhihu);
        };
    }

}
