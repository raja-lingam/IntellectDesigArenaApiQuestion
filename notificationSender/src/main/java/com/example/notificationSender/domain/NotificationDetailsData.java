package com.example.notificationSender.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
public class NotificationDetailsData {
    /**
     *
     */
    private String notificationMessage;

    /**
     *
     */
    private List<String> receipients;

    /**
     *
     */
    private String typeOfChannel;

}
