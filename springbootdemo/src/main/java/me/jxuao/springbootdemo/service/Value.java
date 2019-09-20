package me.jxuao.springbootdemo.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @program: MultiMavenModule
 * @description: Consumer restful service?
 * @author: camxu
 * @create: 2019-08-04 17:59
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private Long id;
    private String quote;

    public Value() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
