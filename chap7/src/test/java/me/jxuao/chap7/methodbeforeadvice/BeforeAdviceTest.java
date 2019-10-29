package me.jxuao.chap7.methodbeforeadvice;

import me.jxuao.chap7.methodbeforeadvice.impl.NaiveWaiter;
import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-15 16:43
 **/
public class BeforeAdviceTest {

    @Test
    public void testBeforeXML() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Waiter waiter = (Waiter)ctx.getBean("waiterBefore");
        waiter.serveTo("hello");
        waiter.serveTo("world");
    }

    @Test
    public void testBefore() {
        Waiter waiter = new NaiveWaiter();
        BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.setInterfaces(waiter.getClass().getInterfaces());

        proxyFactory.setTarget(waiter);

        proxyFactory.addAdvice(beforeAdvice);
        proxyFactory.addAdvice(beforeAdvice);

        Waiter proxyWaiter = (Waiter)proxyFactory.getProxy();
        proxyWaiter.greetTo("John");
        proxyWaiter.serveTo("Tom");
    }
}
