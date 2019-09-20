package me.jxuao.springbootdemo.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: MultiMavenModule
 * @description: 计划任务
 * @author: camxu
 * @create: 2019-08-04 17:20
 **/
@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 5000)
    @Scheduled(cron = "*/2 0/2 * * * ?")
    public void reportCurrentTime() {
        log.info("The time is not {}", dateFormat.format(new Date()));
    }


}
