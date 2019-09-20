package me.jxuao.springbootdemo.controller;

import me.jxuao.springbootdemo.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: MultiMavenModule
 * @description: 打招呼控制器
 * @author: camxu
 * @create: 2019-08-04 16:22
 **/
@RestController
public class GreetController {

    private static final String template = "Hello, %s, %d!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World") String name,
            @RequestParam(value = "time") Long time) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name, time));
    }
}
