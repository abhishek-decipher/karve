package com.eccocar.karve.clients.impl;

import com.eccocar.karve.clients.OfficeClient;
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
public class OfficeClientImpl extends WebServiceGatewaySupport implements OfficeClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    @Autowired
    private KarvePropertiesConfig karvePropertiesConfig;


    @Override
    public RetrieveOfficesResponse getAllOffices(RetrieveOfficesRequest retrieveOfficesRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveOfficesResponse> response = (JAXBElement<RetrieveOfficesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveOfficesRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveOfficeZonesResponse getAllOfficeZones(RetrieveOfficeZonesRequest retrieveOfficeZonesRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveOfficeZonesResponse> response = (JAXBElement<RetrieveOfficeZonesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveOfficeZonesRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }
}
