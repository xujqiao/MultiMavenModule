package me.jxuao.springbootdemo.context;

import me.jxuao.springbootdemo.pojo.Car;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.validation.constraints.NotNull;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * @program: MultiMavenModule
 * @description: 注解方式生成bean测试
 * @author: camxu
 * @create: 2019-08-25 16:26
 **/
public class ApplicationContextBeansTest {

    @Test
    public void testBuildCar() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextBeans.class);
        Car car = applicationContext.getBean("car1", Car.class);
        assertNotNull(car);
    }
}
