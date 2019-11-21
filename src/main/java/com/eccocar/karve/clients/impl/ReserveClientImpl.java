package com.eccocar.karve.clients.impl;

import com.eccocar.karve.clients.ReserveClient;
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
public class ReserveClientImpl extends WebServiceGatewaySupport implements ReserveClient {


    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;
    @Autowired
    private KarvePropertiesConfig karvePropertiesConfig;

    private WebServiceTemplate webServiceTemplate;


    @Override
    public CreateReserveResponse createReserve(CreateReserveRequest createReserveRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<CreateReserveResponse> response =  (JAXBElement<CreateReserveResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), createReserveRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public ListReservesResponse getAllListReserves(ListReservesRequest listReservesRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ListReservesResponse> response =  (JAXBElement<ListReservesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), listReservesRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public ModifyReserveResponse updateReserve(ModifyReserveRequest modifyReserveRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ModifyReserveResponse> response =  (JAXBElement<ModifyReserveResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), modifyReserveRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public ModifyReserveClientsByCodeResponse updateReserveClientByCode(ModifyReserveClientsByCodeRequest modifyReserveClientsByCodeRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ModifyReserveClientsByCodeResponse> response =  (JAXBElement<ModifyReserveClientsByCodeResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), modifyReserveClientsByCodeRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public ModifyReserveConceptsResponse updateReserveConcept(ModifyReserveConceptsRequest modifyReserveConceptsRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ModifyReserveConceptsResponse> response =  (JAXBElement<ModifyReserveConceptsResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), modifyReserveConceptsRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public ModifyReserveConceptsByCodeResponse updateReserveConceptsByCode(ModifyReserveConceptsByCodeRequest modifyReserveConceptsByCodeRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ModifyReserveConceptsByCodeResponse> response =  (JAXBElement<ModifyReserveConceptsByCodeResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), modifyReserveConceptsByCodeRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public ModifyReserveInformationResponse updateReserveInformation(ModifyReserveInformationRequest modifyReserveInformationRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ModifyReserveInformationResponse> response =  (JAXBElement<ModifyReserveInformationResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), modifyReserveInformationRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveReserveResponse getAllReserve(RetrieveReserveRequest retrieveReserveRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveReserveResponse> response =  (JAXBElement<RetrieveReserveResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveReserveRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveReserveByCodeResponse getAllReserveByCode(RetrieveReserveByCodeRequest retrieveReserveByCodeRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveReserveByCodeResponse> response =  (JAXBElement<RetrieveReserveByCodeResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveReserveByCodeRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public SimulateReserveResponse simulateReserve(SimulateReserveRequest simulateReserveRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<SimulateReserveResponse> response =  (JAXBElement<SimulateReserveResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), simulateReserveRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public ModifyReserveInformationByCodeResponse updateReserveInformationByCode(ModifyReserveInformationByCodeRequest modifyReserveInformationByCodeRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<ModifyReserveInformationByCodeResponse> response =  (JAXBElement<ModifyReserveInformationByCodeResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), modifyReserveInformationByCodeRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }
}
