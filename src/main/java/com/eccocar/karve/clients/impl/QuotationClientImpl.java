package com.eccocar.karve.clients.impl;

import com.eccocar.karve.clients.QuotationClient;
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
public class QuotationClientImpl extends WebServiceGatewaySupport implements QuotationClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    @Autowired
    private KarvePropertiesConfig karvePropertiesConfig;


    @Override
    public RetrieveQuotationCarTypeResponse getQuotationCarTypes(RetrieveQuotationCarTypeRequest retrieveQuotationCarTypeRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveQuotationCarTypeResponse> response = (JAXBElement<RetrieveQuotationCarTypeResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveQuotationCarTypeRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveQuotationResponse getQuotation(RetrieveQuotationRequest retrieveQuotationRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveQuotationResponse> response = (JAXBElement<RetrieveQuotationResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveQuotationRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }
}
