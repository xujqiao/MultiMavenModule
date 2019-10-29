package me.jxuao.chap8.aspectdetail85;

public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String clientName) {
        System.out.println("greet to " + clientName);
    }

    @Override
    public void serveTo(String clientName) {
        System.out.println("serve to " + clientName);
    }

    public void smile(String clientName, int times) {
        System.out.println("smile " + times + " times to " + clientName);
    }
}
