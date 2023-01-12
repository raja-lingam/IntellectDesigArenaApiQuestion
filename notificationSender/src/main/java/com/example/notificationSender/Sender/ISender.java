package com.example.notificationSender.Sender;

import com.example.notificationSender.domain.NotificationDetailsData;
import com.example.notificationSender.domain.NotificationResponseData;

public interface ISender {

    NotificationResponseData sendData(NotificationDetailsData data);
}
