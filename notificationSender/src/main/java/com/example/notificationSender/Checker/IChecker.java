package com.example.notificationSender.Checker;

import com.example.notificationSender.domain.NotificationDetailsData;
import com.example.notificationSender.domain.NotificationResponseData;

import java.util.Map;

public interface IChecker {

    Map<String,String> check(NotificationDetailsData data, Map<String,String> conf);
}
