package com.example.notificationSender.bussiness;

import com.example.notificationSender.Checker.IChecker;
import com.example.notificationSender.Sender.ISender;
import com.example.notificationSender.config.ConfigUtils;
import com.example.notificationSender.domain.ConfigData;
import com.example.notificationSender.domain.NotificationDetailsData;
import com.example.notificationSender.domain.NotificationResponseData;
import com.example.notificationSender.domain.Template;
import com.example.notificationSender.exception.APIWrongParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;

import java.util.Locale;
import java.util.Map;

@Service
public class SendService {
    @Autowired
    ConfigUtils configUtils;
    @Autowired
    ApplicationContext applicationContext;

    public NotificationResponseData sendDataBasedOnType (NotificationDetailsData data) {
        Template template= configUtils.readConfigFile();
        IChecker iChecker=(IChecker) applicationContext.getBean(template.getSender().get(data.getTypeOfChannel().toUpperCase(Locale.ROOT)).getConf().get("vaildationBean"));
       Map<String,String> InvalidData= iChecker.check(data,template.getSender().get(data.getTypeOfChannel().toUpperCase(Locale.ROOT)).getConf());
       if(!InvalidData.isEmpty())
           throw new APIWrongParamException("Invalid data for Recepiants is found for " + data.getTypeOfChannel());

        ISender iSender=(ISender) applicationContext.getBean(template.getSender().get(data.getTypeOfChannel().toUpperCase(Locale.ROOT)).getBean());
        return iSender.sendData(data);
    }
}
