package me.jxuao.springbootdemo.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @program: MultiMavenModule
 * @description: Consumer restful service?
 * @author: camxu
 * @create: 2019-08-04 17:55
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
