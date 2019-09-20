package me.jxuao;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-19 10:58
 **/
public class MyRunner implements Runnable{
    private static ThreadLocal<Double> threadLocal = new ThreadLocal<Double>();
    public void run() {
        System.out.println(Thread.currentThread().getName());
        threadLocal.set(Math.random()*100);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        System.out.println(threadLocal.hashCode());

        System.out.println(threadLocal.get());
    }
}
