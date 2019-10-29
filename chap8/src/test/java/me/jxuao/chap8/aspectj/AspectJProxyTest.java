package me.jxuao.chap8.aspectj;

import me.jxuao.chap7.methodbeforeadvice.Waiter;
import me.jxuao.chap8.NaiveWaiter;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class AspectJProxyTest {

    @Test
    public void proxyTest() {
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory factor = new AspectJProxyFactory();
        factor.setTarget(target);
        factor.addAspect(PreGreetingAspect.class);

        Waiter proxy = factor.getProxy();
        proxy.serveTo("John");
        proxy.greetTo("John");
    }
}
