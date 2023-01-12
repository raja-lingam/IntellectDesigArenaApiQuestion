package com.example.notificationSender.controller;

import com.example.notificationSender.bussiness.SendService;
import com.example.notificationSender.domain.NotificationDetailsData;
import com.example.notificationSender.domain.NotificationResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationSenderController {
    @Autowired
    private SendService sendService;
    @PostMapping(value="/sendNotification")
    public ResponseEntity<NotificationResponseData> sender(@RequestBody NotificationDetailsData details){

        NotificationResponseData responseData=sendService.sendDataBasedOnType(details);
        return new ResponseEntity<NotificationResponseData>(responseData, HttpStatus.OK);

    }
}
