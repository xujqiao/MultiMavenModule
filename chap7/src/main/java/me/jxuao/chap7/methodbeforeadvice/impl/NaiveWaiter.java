package me.jxuao.chap7.methodbeforeadvice.impl;

import me.jxuao.chap7.methodbeforeadvice.Waiter;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-15 16:40
 **/
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serving " + name + "...");
    }
}
