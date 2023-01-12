package com.example.notificationSender.config;

import com.example.notificationSender.domain.ConfigData;
import com.example.notificationSender.domain.Template;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;

@Service
public class ConfigUtils {

    @Value("${resource_path}")
    private String resourcePath;

    public static final ObjectMapper objectMapper = new ObjectMapper().enable(JsonParser.Feature.ALLOW_COMMENTS);

    public Template readConfigFile(){
        Path path= Path.of(resourcePath).resolve("configSettings").resolve("config"+".json");
        try{
            return objectMapper.readValue(path.toFile(), Template.class);
        } catch(IOException e){
            throw new RuntimeException();
        }
    }
}
