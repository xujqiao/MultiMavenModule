package me.jxuao.chap7.introduce;

import me.jxuao.chap7.methodbeforeadvice.Waiter;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-20 00:37
 **/
public class IntroduceTest {
    @Test
    public void testIntroduce() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                Waiter waiter = (Waiter)applicationContext.getBean("waiterIntroduce");
                waiter.greetTo("r1");
                Monitor monitor = (Monitor)waiter;
                monitor.setMonitorActive(true);
                waiter.greetTo("r1");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                Waiter waiter = (Waiter)applicationContext.getBean("waiterIntroduce");
                waiter.greetTo("r2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                waiter.greetTo("r2");
            }
        };


        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
