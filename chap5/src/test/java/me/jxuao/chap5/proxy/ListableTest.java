package me.jxuao.chap5.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-14 22:19
 **/
public class ListableTest {
    @Test
    public void testListableProxy() {
        Listable target = new ListableImpl();

        Listable proxy = (Listable)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new ListableImplProxy(target)
        );

        proxy.next();

        proxy.prev();

        System.out.println(target.getClass().getClassLoader());
        System.out.println(target.getClass().getClassLoader().getParent());
        System.out.println(target.getClass().getClassLoader().getParent().getParent());

    }
}
