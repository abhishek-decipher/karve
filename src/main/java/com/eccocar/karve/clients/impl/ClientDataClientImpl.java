package com.eccocar.karve.clients.impl;

import com.eccocar.karve.clients.ClientDataClient;
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
public class ClientDataClientImpl extends WebServiceGatewaySupport implements ClientDataClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private KarvePropertiesConfig karvePropertiesConfig;

    private WebServiceTemplate webServiceTemplate;


    public CreateClientResponse createClient(CreateClientRequest createClientRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<CreateClientResponse> response = (JAXBElement<CreateClientResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), createClientRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    public ModifyClientResponse updateClient(ModifyClientRequest modifyClientRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ModifyClientResponse> response = (JAXBElement<ModifyClientResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), modifyClientRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveClientResponse getClientByClientCode(RetrieveClientRequest retrieveClientRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveClientResponse> response = (JAXBElement<RetrieveClientResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveClientRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveClientsResponse getAllClients(RetrieveClientsRequest retrieveClientsRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveClientsResponse> response = (JAXBElement<RetrieveClientsResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveClientsRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveClientByLicenseResponse getClientByLicense(RetrieveClientByLicenseRequest retrieveClientByLicenseRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveClientByLicenseResponse> response = (JAXBElement<RetrieveClientByLicenseResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveClientByLicenseRequest, new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }


}