package me.jxuao;

import org.junit.Test;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-19 10:56
 **/
public class MyTest {
    @Test
    public void testThreadLocal() {
        MyRunner runner1 = new MyRunner();
        MyRunner runner2 = new MyRunner();
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);

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
