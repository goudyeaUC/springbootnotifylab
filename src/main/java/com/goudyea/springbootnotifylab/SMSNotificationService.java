package com.goudyea.springbootnotifylab;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
