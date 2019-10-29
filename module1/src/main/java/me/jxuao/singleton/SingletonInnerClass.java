package me.jxuao.singleton;

public class SingletonInnerClass {
    private SingletonInnerClass() {

    }

    private static class InnerClass {
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return  InnerClass.instance;
    }
}
