package me.jxuao.chap8;

import me.jxuao.chap7.methodbeforeadvice.Waiter;

public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println("NaiveWaiter: greet to " + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("NaiveWaiter: serving " + name + "...");
    }
}
