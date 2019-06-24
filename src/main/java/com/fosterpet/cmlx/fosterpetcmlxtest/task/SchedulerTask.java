package com.fosterpet.cmlx.fosterpetcmlxtest.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author cmlx
 * @Date 2019-6-24 0024 11:12
 * @Version 1.0
 */
@Component
public class SchedulerTask {

    private int count=0;

//    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }


}
