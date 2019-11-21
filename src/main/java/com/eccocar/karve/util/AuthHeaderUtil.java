package com.eccocar.karve.util;

import com.eccocar.karve.config.KarvePropertiesConfig;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.namespace.QName;

@Component
public class AuthHeaderUtil implements WebServiceMessageCallback {

    private KarvePropertiesConfig karvePropertiesConfig;

    public AuthHeaderUtil(KarvePropertiesConfig karvePropertiesConfig) {
        this.karvePropertiesConfig = karvePropertiesConfig;
    }

    @Override
    public void doWithMessage(WebServiceMessage message) {
        try {
            SoapMessage soapMessage = (SoapMessage) message;
            SoapHeader soapHeader = soapMessage.getSoapHeader();
            SoapHeaderElement password = soapHeader
                    .addHeaderElement(new QName(this.karvePropertiesConfig.getKarveApiUrl(), this.karvePropertiesConfig.getPassword(), this.karvePropertiesConfig.getPrefix()));
            password.setText(this.karvePropertiesConfig.getPasswordValue());
            SoapHeaderElement username = soapHeader
                    .addHeaderElement(new QName(this.karvePropertiesConfig.getKarveApiUrl(), this.karvePropertiesConfig.getUserName(), this.karvePropertiesConfig.getPrefix()));
            username.setText(this.karvePropertiesConfig.getUserValue());
        } catch (Exception e) {
            LoggerFactory.getLogger(AuthHeaderUtil.class).error(e.getMessage(), e);
        }
    }
}
