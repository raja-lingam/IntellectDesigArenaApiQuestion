package com.example.notificationSender.Sender;

import com.example.notificationSender.Checker.IChecker;
import com.example.notificationSender.domain.NotificationDetailsData;
import com.example.notificationSender.domain.NotificationResponseData;
import org.springframework.stereotype.Service;

@Service
public class EmailSender implements ISender{


    @Override
    public NotificationResponseData sendData(NotificationDetailsData data) {
        NotificationResponseData responseData=new NotificationResponseData();
        responseData.setFlag("Success");
        responseData.setRecepients(data.getReceipients());
        responseData.setMessage("Message  is send to all Receipients via Mail");
        return responseData;
    }
}
