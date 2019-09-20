package me.jxuao.chap5.cglibproxy;

import me.jxuao.chap5.proxy.ListableImpl;
import org.junit.Test;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-14 23:36
 **/
public class CglibProxyTest {
    @Test
    public void testCglibProxy() {
        CglibProxy proxy = new CglibProxy();
        ListableImpl cglibproxy = (ListableImpl)proxy.getProxy(ListableImpl.class);

        cglibproxy.next();
        cglibproxy.prev();
    }
}
