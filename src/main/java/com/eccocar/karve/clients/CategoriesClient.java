package com.eccocar.karve.clients;

import com.eccocar.karve.dtos.RetrieveCarTypesRequest;
import com.eccocar.karve.dtos.RetrieveCarTypesResponse;
import com.eccocar.karve.dtos.RetrieveCategoriesRequest;
import com.eccocar.karve.dtos.RetrieveCategoriesResponse;
import com.eccocar.karve.dtos.RetrieveConceptsRequest;
import com.eccocar.karve.dtos.RetrieveConceptsResponse;
import com.eccocar.karve.dtos.RetrieveCountriesResponse;
import com.eccocar.karve.dtos.RetrieveCountriesRequest;
import com.eccocar.karve.dtos.RetrievePlacesRequest;
import com.eccocar.karve.dtos.RetrievePlacesResponse;
import com.eccocar.karve.dtos.RetrieveWidgetFiltersRequest;
import com.eccocar.karve.dtos.RetrieveWidgetFiltersResponse;

public interface CategoriesClient {

    RetrieveCountriesResponse getCountryCodes(RetrieveCountriesRequest retrieveCountriesRequest);
    RetrieveCarTypesResponse retrieveCarTypes(RetrieveCarTypesRequest retrieveCarTypesRequest);
    RetrieveCategoriesResponse retrieveCategories(RetrieveCategoriesRequest retrieveCategoriesRequest);
    RetrieveConceptsResponse retrieveConcepts(RetrieveConceptsRequest retrieveConceptsRequest);
    RetrievePlacesResponse retrievePlaces(RetrievePlacesRequest retrievePlacesRequest);
    RetrieveWidgetFiltersResponse retrieveWidgetFilters(RetrieveWidgetFiltersRequest retrieveWidgetFiltersRequest);
}
