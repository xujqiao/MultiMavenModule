package me.jxuao.chap5.pojo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: MultiMavenModule
 * @description:
 * @author: camxu
 * @create: 2019-09-14 20:06
 **/
@Component("mybean")
public class AnnotationBean {
    private String name;

    public AnnotationBean() {
        this.name = "hello";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
