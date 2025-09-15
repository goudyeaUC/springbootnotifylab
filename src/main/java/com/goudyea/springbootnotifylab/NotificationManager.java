package com.goudyea.springbootnotifylab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private NotificationService notificationService;

    @Autowired
    public NotificationManager(@Qualifier("sms") NotificationService notificationService) {
        this.notificationService = notificationService;}

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}
