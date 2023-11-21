package java_4_11_6;

import org.springframework.scheduling.annotation.Scheduled;

public class Sheduled {

    @Scheduled(cron = "15 * * * * * *")
    void a() {
        System.out.println("HELLO WORLD!");
    }

}
