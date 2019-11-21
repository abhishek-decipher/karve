package com.eccocar.karve.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KarvePropertiesConfig {

    @Value("${karve.auth.user}")
    private String userName;

    @Value("${karve.auth.user.value}")
    private String userValue;

    @Value("${karve.credential.prefix}")
    private String prefix;

    @Value("${karve.password.key}")
    private String password;

    @Value("${karve.password.value}")
    private String passwordValue;

    @Value("${karve.api.host}")
    private String karveApiUrl;

    @Value("${karve.api.uri}")
    private String baseUrl;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKarveApiUrl() {
        return karveApiUrl;
    }

    public void setKarveApiUrl(String karveApiUrl) {
        this.karveApiUrl = karveApiUrl;
    }

    public String getUserValue() {
        return userValue;
    }

    public void setUserValue(String userValue) {
        this.userValue = userValue;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPasswordValue() {
        return passwordValue;
    }

    public void setPasswordValue(String passwordValue) {
        this.passwordValue = passwordValue;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
