package me.jxuao.chap5.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-14 23:33
 **/
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib start");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib end");
        return obj;
    }
}
