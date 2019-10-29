package me.jxuao.chap8.aspectdeail85;

import me.jxuao.chap8.aspectdetail85.Waiter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointcutFunTest {

    @Test
    public void testPointcut() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtWaiter = (Waiter) ctx.getBean("naughtWaiter");

        naiveWaiter.greetTo("John");
        naughtWaiter.greetTo("Tom");

    }
}
