package com.goudyea.springbootnotifylab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class SpringbootnotifylabApplication {

    public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(SpringbootnotifylabApplication.class, args);
         var myNotificationManager = context.getBean(NotificationManager.class);
        myNotificationManager.notifyUser("Hello, this is a test notification!");
    }

}
