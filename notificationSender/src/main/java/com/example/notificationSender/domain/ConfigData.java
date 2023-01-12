package com.example.notificationSender.domain;

import lombok.*;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfigData {

    private String bean;

    private Map<String,String> conf;
}
