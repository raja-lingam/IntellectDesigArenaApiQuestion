package com.example.notificationSender.domain;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Template {

   Map<String,ConfigData>  sender;
}
