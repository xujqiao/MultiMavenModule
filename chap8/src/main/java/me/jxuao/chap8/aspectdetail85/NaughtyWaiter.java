package me.jxuao.chap8.aspectdetail85;

import me.jxuao.chap8.anno.NeedTest;

public class NaughtyWaiter implements Waiter{
    @Override
    @NeedTest
    public void greetTo(String clientName) {
        System.out.println("naught greet to " + clientName);
    }

    @Override
    public void serveTo(String clientName) {
        System.out.println("naught serve to " + clientName);
    }

    public void joke(String clientName, int times) {
        System.out.println("joke " + times + " times to " + clientName);
    }
}
