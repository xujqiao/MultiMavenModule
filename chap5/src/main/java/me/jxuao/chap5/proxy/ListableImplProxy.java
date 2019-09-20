package me.jxuao.chap5.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-14 22:14
 **/
public class ListableImplProxy implements InvocationHandler {
    private Object target;

    public ListableImplProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy start");
        Object obj = method.invoke(target, args);
        System.out.println("proxy end");
        return obj;
    }
}
