package me.jxuao.singleton;

public class SingletonThreadSafe {
    private SingletonThreadSafe() {}

    private static SingletonThreadSafe instance = null;

    public static SingletonThreadSafe getInstance() {
        if ( null == instance) {
            synchronized (SingletonThreadSafe.class) {
                if (null == instance) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
