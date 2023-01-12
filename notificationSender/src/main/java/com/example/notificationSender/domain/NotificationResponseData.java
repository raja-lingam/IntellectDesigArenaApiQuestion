package com.example.notificationSender.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Setter
@Getter
public class NotificationResponseData {

    private List<String> recepients;

    private String flag;

    private String message;
}
