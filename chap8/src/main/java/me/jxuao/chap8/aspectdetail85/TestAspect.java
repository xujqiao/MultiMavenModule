package me.jxuao.chap8.aspectdetail85;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {

    @AfterReturning("@annotation(me.jxuao.chap8.anno.NeedTest)")
    public void needTestFun() {
        System.out.println("needTestFun() executed!");
    }
}
