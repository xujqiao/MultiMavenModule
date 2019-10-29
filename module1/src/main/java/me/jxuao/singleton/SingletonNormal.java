package me.jxuao.singleton;

public class SingletonNormal {
    private static SingletonNormal instance = new SingletonNormal();

    private SingletonNormal() {

    }

    public static SingletonNormal getInstance() {
        return instance;
    }
}
