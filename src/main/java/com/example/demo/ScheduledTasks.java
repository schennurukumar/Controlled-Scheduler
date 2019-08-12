package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Component

public class ScheduledTasks {

  private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

  @Scheduled(fixedRate = 1000)
     public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));

     }
}


     // @Scheduled(cron = "${scheduling.job.cron}")
      //@Qualifier
      //public void scheduleTaskWithCronExpression() {

       //logger.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    //}
//}



