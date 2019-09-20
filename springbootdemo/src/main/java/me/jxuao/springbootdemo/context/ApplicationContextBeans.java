package me.jxuao.springbootdemo.context;

import me.jxuao.springbootdemo.pojo.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: MultiMavenModule
 * @description: 注解方式生成bean
 * @author: camxu
 * @create: 2019-08-25 16:22
 **/
@Configuration
public class ApplicationContextBeans {

    @Bean(name="car1")
    public Car buildCar() {
        Car car = new Car();
        car.setBrand("奔驰C260L");
        car.setColor("灰色");
        car.setMaxSpeed(260);
        return car;
    }
}
