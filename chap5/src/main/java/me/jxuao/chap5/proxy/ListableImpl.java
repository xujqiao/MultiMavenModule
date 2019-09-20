package me.jxuao.chap5.proxy;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-14 22:08
 **/
public class ListableImpl implements Listable {
    @Override
    public void prev() {
        System.out.println("prev");
    }

    @Override
    public void next() {
        System.out.println("next");
    }
}
