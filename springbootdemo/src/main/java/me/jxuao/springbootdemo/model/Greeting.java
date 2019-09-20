package me.jxuao.springbootdemo.model;

/**
 * @program: MultiMavenModule
 * @description: 打招呼模型
 * @author: camxu
 * @create: 2019-08-04 16:20
 **/
public class Greeting {
    private final long id;
    private final String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
