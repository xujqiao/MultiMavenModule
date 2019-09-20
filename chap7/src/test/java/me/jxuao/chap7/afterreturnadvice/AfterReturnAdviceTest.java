package me.jxuao.chap7.afterreturnadvice;

import me.jxuao.chap7.methodbeforeadvice.Waiter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-15 17:29
 **/
public class AfterReturnAdviceTest {

    @Test
    public void testAfterXML() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");

        Waiter waiter = (Waiter)ctx.getBean("waiterAfter");
        waiter.serveTo("hello");
        waiter.serveTo("world");
    }
}
