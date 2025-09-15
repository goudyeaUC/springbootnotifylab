package com.goudyea.springbootnotifylab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootnotifylabApplication {

    public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(SpringbootnotifylabApplication.class, args);
        var notificationManager = context.getBean(NotificationManager.class);
        notificationManager.notifyUser("Hello, this is a test notification!");
    }

}
