package com.eccocar.karve.services.impl;

import com.eccocar.karve.clients.CategoriesClient;
import com.eccocar.karve.dtos.RetrieveCarTypesRequest;
import com.eccocar.karve.dtos.RetrieveCarTypesResponse;
import com.eccocar.karve.dtos.RetrieveCategoriesRequest;
import com.eccocar.karve.dtos.RetrieveCategoriesResponse;
import com.eccocar.karve.dtos.RetrieveConceptsRequest;
import com.eccocar.karve.dtos.RetrieveConceptsResponse;
import com.eccocar.karve.dtos.RetrieveCountriesResponse;
import com.eccocar.karve.dtos.RetrievePlacesRequest;
import com.eccocar.karve.dtos.RetrievePlacesResponse;
import com.eccocar.karve.dtos.RetrieveWidgetFiltersRequest;
import com.eccocar.karve.dtos.RetrieveWidgetFiltersResponse;
import com.eccocar.karve.services.CategoriesService;
import com.eccocar.karve.dtos.RetrieveCountriesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    private CategoriesClient categoriesClient;

    @Autowired
    CategoriesServiceImpl(CategoriesClient categoriesClient) {
        this.categoriesClient = categoriesClient;
    }


    @Override
    public RetrieveCountriesResponse getCountriesCodes(RetrieveCountriesRequest retrieveCountriesRequest) {
        return categoriesClient.getCountryCodes(retrieveCountriesRequest);
    }

    @Override
    public RetrieveCarTypesResponse retrieveCarTypes(RetrieveCarTypesRequest retrieveCarTypesRequest){
        return categoriesClient.retrieveCarTypes(retrieveCarTypesRequest);
    }

    @Override
    public RetrieveCategoriesResponse retrieveCategories(RetrieveCategoriesRequest retrieveCategoriesRequest){
        return categoriesClient.retrieveCategories(retrieveCategoriesRequest);
    }

    @Override
    public RetrieveConceptsResponse retrieveConcepts(RetrieveConceptsRequest retrieveConceptsRequest){
        return categoriesClient.retrieveConcepts(retrieveConceptsRequest);
    }

    @Override
    public RetrievePlacesResponse retrievePlaces(RetrievePlacesRequest retrievePlacesRequest){
        return categoriesClient.retrievePlaces(retrievePlacesRequest);
    }

    @Override
    public RetrieveWidgetFiltersResponse retrieveWidgetFilters(RetrieveWidgetFiltersRequest retrieveWidgetFiltersRequest){
        return categoriesClient.retrieveWidgetFilters(retrieveWidgetFiltersRequest);
    }
}
