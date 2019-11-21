package com.eccocar.karve.clients.impl;

import com.eccocar.karve.clients.ChargeClient;
import com.eccocar.karve.config.KarvePropertiesConfig;
import com.eccocar.karve.dtos.*;
import com.eccocar.karve.util.AuthHeaderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

@SuppressWarnings("unchecked")
@Component
public class ChargeClientImpl extends WebServiceGatewaySupport implements ChargeClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private KarvePropertiesConfig karvePropertiesConfig;

    private WebServiceTemplate webServiceTemplate;


    @Override
    public CreateChargeResponse createCharge(CreateChargeRequest createChargeRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<CreateChargeResponse> response =  (JAXBElement<CreateChargeResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), createChargeRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveDiscountsResponse getDiscount(RetrieveDiscountsRequest retrieveDiscountsRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveDiscountsResponse> response =  (JAXBElement<RetrieveDiscountsResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveDiscountsRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveRatesResponse getRates(RetrieveRatesRequest retrieveRatesRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveRatesResponse> response =  (JAXBElement<RetrieveRatesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveRatesRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }
}
