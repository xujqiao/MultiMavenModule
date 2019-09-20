package me.jxuao.springbootdemo.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @program: MultiMavenModule
 * @description: zhihu api
 * @author: camxu
 * @create: 2019-08-11 16:51
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Zhihu {
    private ZhihuError error;

    public Zhihu() {}

    public ZhihuError getError() {
        return error;
    }

    public void setError(ZhihuError error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Zhihu{" +
                "error='" + error + '\'' +
                '}';
    }
}
