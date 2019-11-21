package com.eccocar.karve.clients.impl;

import com.eccocar.karve.clients.CategoriesClient;
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
public class CategoriesClientImpl extends WebServiceGatewaySupport implements CategoriesClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private KarvePropertiesConfig karvePropertiesConfig;

    private WebServiceTemplate webServiceTemplate;



    @Override
    public RetrieveCountriesResponse getCountryCodes(RetrieveCountriesRequest retrieveCountriesRequest ) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveCountriesResponse> response =  (JAXBElement<RetrieveCountriesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveCountriesRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();

    }

    @Override
    public RetrieveCarTypesResponse retrieveCarTypes(RetrieveCarTypesRequest retrieveCarTypesRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveCarTypesResponse> response =  (JAXBElement<RetrieveCarTypesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveCarTypesRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveCategoriesResponse retrieveCategories(RetrieveCategoriesRequest retrieveCategoriesRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveCategoriesResponse> response =  (JAXBElement<RetrieveCategoriesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveCategoriesRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveConceptsResponse retrieveConcepts(RetrieveConceptsRequest retrieveConceptsRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveConceptsResponse> response =  (JAXBElement<RetrieveConceptsResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveConceptsRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrievePlacesResponse retrievePlaces(RetrievePlacesRequest retrievePlacesRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrievePlacesResponse> response =  (JAXBElement<RetrievePlacesResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrievePlacesRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }

    @Override
    public RetrieveWidgetFiltersResponse retrieveWidgetFilters(RetrieveWidgetFiltersRequest retrieveWidgetFiltersRequest){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        JAXBElement<RetrieveWidgetFiltersResponse> response =  (JAXBElement<RetrieveWidgetFiltersResponse>)
                webServiceTemplate.marshalSendAndReceive(karvePropertiesConfig.getBaseUrl(), retrieveWidgetFiltersRequest  , new AuthHeaderUtil(karvePropertiesConfig));
        return response.getValue();
    }
}
