package me.jxuao.chap7.introduce;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-20 00:27
 **/
public class ControllableMonitor
        extends DelegatingIntroductionInterceptor
        implements Monitor {
    private ThreadLocal<Boolean> MonitorStatusMap = new ThreadLocal<>();
    private boolean status = false;

    public ControllableMonitor() {
        MonitorStatusMap.set(false);
    }


    @Override
    public void setMonitorActive(boolean active) {
        MonitorStatusMap.set(active);
//        status = active;
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj;
        if (MonitorStatusMap.get() != null && MonitorStatusMap.get()) {
//        if (status) {
            System.out.println("before: " + mi.getClass().getName() + "." + mi.getMethod().getName());
            System.out.println("thread: " + Thread.currentThread().getName());
            obj = super.invoke(mi);
            System.out.println("after");
        } else {
            obj = super.invoke(mi);
        }
        return obj;
    }
}
