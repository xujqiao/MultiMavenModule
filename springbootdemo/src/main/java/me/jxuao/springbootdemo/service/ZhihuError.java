package me.jxuao.springbootdemo.service;

/**
 * @program: MultiMavenModule
 * @description: zhihu error api
 * @author: camxu
 * @create: 2019-08-11 16:53
 **/
public class ZhihuError {
    private String message;
    private Integer code;
    private String name;

    public ZhihuError() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                ",code=" + code +
                ",name='" + name + '\'' +
                '}';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
