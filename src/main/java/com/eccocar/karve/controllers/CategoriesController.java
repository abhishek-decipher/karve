package com.eccocar.karve.controllers;

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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Categories", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("categories")
public class CategoriesController {

    private CategoriesService categoriesService;

    @Autowired
    CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @PostMapping(value = "/getCountriesCodes/")
    @ApiOperation(value = "Get All Country Codes")
    public RetrieveCountriesResponse getCountriesCodes(@RequestBody RetrieveCountriesRequest retrieveCountriesRequest) {
        return this.categoriesService.getCountriesCodes(retrieveCountriesRequest);
    }





    @PostMapping(value = "/retrieveCarTypes/")
    @ApiOperation(value = "Retrieve Car Types")
    public RetrieveCarTypesResponse retrieveCarTypes(@RequestBody RetrieveCarTypesRequest retrieveCarTypesRequest) {
        return this.categoriesService.retrieveCarTypes(retrieveCarTypesRequest);
    }

    @PostMapping(value = "/retrieveCategories/")
    @ApiOperation(value = "Retrieve Categories")
    public RetrieveCategoriesResponse retrieveCategories(@RequestBody RetrieveCategoriesRequest retrieveCategoriesRequest) {
        return this.categoriesService.retrieveCategories(retrieveCategoriesRequest);
    }

    @PostMapping(value = "/retrieveConcepts/")
    @ApiOperation(value = "Retrieve Concepts")
    public RetrieveConceptsResponse retrieveConcepts(@RequestBody RetrieveConceptsRequest retrieveConceptsRequest) {
        return this.categoriesService.retrieveConcepts(retrieveConceptsRequest);
    }

    @PostMapping(value = "/retrievePlaces/")
    @ApiOperation(value = "Retrieve Places")
    public RetrievePlacesResponse retrievePlaces(@RequestBody RetrievePlacesRequest retrievePlacesRequest) {
        return this.categoriesService.retrievePlaces(retrievePlacesRequest);
    }

    @PostMapping(value = "/retrieveWidgetFilters/")
    @ApiOperation(value = "Retrieve Widget Filters")
    public RetrieveWidgetFiltersResponse retrieveWidgetFilters(@RequestBody RetrieveWidgetFiltersRequest retrieveWidgetFiltersRequest) {
        return this.categoriesService.retrieveWidgetFilters(retrieveWidgetFiltersRequest);
    }

}
