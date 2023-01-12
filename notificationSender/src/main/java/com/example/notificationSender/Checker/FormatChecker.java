package com.example.notificationSender.Checker;

import com.example.notificationSender.domain.NotificationDetailsData;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Service
public class FormatChecker implements  IChecker{


    private Pattern pattern;

    @Override
    public Map<String,String> check(NotificationDetailsData data, Map<String,String> conf) {
        pattern=Pattern.compile(conf.get("regex"),Pattern.CASE_INSENSITIVE);
        Map<String,String> invalidData=new HashMap<>();
        for(String dataCheck : data.getReceipients()){
            Matcher matcher = pattern.matcher(dataCheck);
            if(!matcher.matches())
                invalidData.put(dataCheck,"Invalid");
        }
        return invalidData;
    }
}
