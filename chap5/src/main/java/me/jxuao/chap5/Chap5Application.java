package me.jxuao.chap5;

import me.jxuao.chap5.pojo.AnnotationBean;
import me.jxuao.chap5.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Chap5Application {

    @Autowired
    private AnnotationBean myBean;

    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");

//        Chap5Application my = ctx.getBean(Chap5Application.class);
//        System.out.println(my.person.getName());

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Chap5Application.class);
//        ((AnnotationConfigApplicationContext) ctx).register(Chap5Application.class);
//        ((AnnotationConfigApplicationContext) ctx).refresh();
        Chap5Application m = ctx.getBean(Chap5Application.class);
        System.out.println(m.myBean.getName());
    }

}
