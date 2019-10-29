package me.jxuao.chap7;

import me.jxuao.chap7.methodbeforeadvice.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Component
public class Chap7Application {

    @Autowired
    @Qualifier(value = "target")
    private Waiter waiter;

    public static void main(String[] args) {
//        SpringApplication.run(Chap7Application.class, args);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
//        Waiter waiter = (Waiter)ctx.getBean("waiter");
//        waiter.greetTo("hello");
//        waiter.serveTo("world");

        Chap7Application m = (Chap7Application)ctx.getBean(Chap7Application.class);
        m.waiter.serveTo("hello");
        m.waiter.serveTo("world");
    }

}
