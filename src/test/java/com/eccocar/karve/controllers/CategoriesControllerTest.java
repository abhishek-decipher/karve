package com.eccocar.karve.controllers;

import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.impl.CategoriesServiceImpl;
import com.eccocar.karve.util.JSONUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CategoriesControllerTest {

    private CategoriesController categoriesController;
    private CategoriesServiceImpl categoriesService;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        categoriesService = mock(CategoriesServiceImpl.class);
        categoriesController = spy(new CategoriesController(categoriesService));
        this.mockMvc = MockMvcBuilders.standaloneSetup(categoriesController).build();
    }

    @Test
    public void getCountriesCodes() throws Exception {
        RetrieveCountriesRequest retrieveCountriesRequest = new RetrieveCountriesRequest();
        retrieveCountriesRequest.setCountryCode("ADA1234");
        retrieveCountriesRequest.setLanguageCode("ASDQW");

        RetrieveCountriesResponse retrieveCountriesResponse = new RetrieveCountriesResponse();
        retrieveCountriesResponse.setResponseCode(0);
        retrieveCountriesResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveCountriesResponse.setResponseMessage("Correct Petition");
        retrieveCountriesResponse.setResponseServerName("BDS");
        retrieveCountriesResponse.setResponseRunTime((long) 100);
        retrieveCountriesResponse.setResponseVersion(5);
        List<Country> countries = new ArrayList<>();
        Country country =  new Country();
        country.setCode("1234");
        country.setCurrencyCode("ASD1234");
        country.setName("DEVOITE DEVO");
        country.setLanguageCode("AS121221");
        countries.add(country);
        retrieveCountriesResponse.setResponseData(countries);

        when(categoriesService.getCountriesCodes(retrieveCountriesRequest)).thenReturn(retrieveCountriesResponse);
        this.mockMvc.perform(post("/categories/getCountriesCodes/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveCountriesRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void retrieveCarTypes() throws Exception {
        RetrieveCarTypesRequest retrieveCarTypesRequest = new RetrieveCarTypesRequest();
        retrieveCarTypesRequest.setCarTypeId("Car Type Id");
        retrieveCarTypesRequest.setLanguageCode("123QWQWQ");
        retrieveCarTypesRequest.setOfficeId("officeId");
        retrieveCarTypesRequest.setRetrieveImages(true);
        retrieveCarTypesRequest.setShowAllCarTypes(false);

        RetrieveCarTypesResponse retrieveCarTypesResponse = new RetrieveCarTypesResponse();
        retrieveCarTypesResponse.setResponseCode(0);
        retrieveCarTypesResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveCarTypesResponse.setResponseMessage("Correct Petition");
        retrieveCarTypesResponse.setResponseServerName("BDS");
        retrieveCarTypesResponse.setResponseRunTime((long) 100);
        retrieveCarTypesResponse.setResponseVersion(5);

        List<CarType> carTypes = new ArrayList<>();
        CarType carType = new CarType();
        carType.setAllowOneway(true);
        carType.setDefaultAirportsOnRequest(false);
        carType.setDefaultDeposit(1245);
        carType.setDefaultDowntownsOnRequest(true);
        carType.setDefaultFranchise(121);
        CarTypeFeatures carTypeFeatures = new CarTypeFeatures();
        carTypeFeatures.setAirConditioning(true);
        carTypeFeatures.setBaggagesNumber(121);
        carTypeFeatures.setCategoryId("categoryId");
        carTypeFeatures.setCategoryName("categories Name");
        carTypeFeatures.setDoorsNumber(1245);
        carTypeFeatures.setFuelType(324561);
        carTypeFeatures.setFuelTypeName("fuel Type Name");
        carTypeFeatures.setGPS(121);
        carTypeFeatures.setBaggagesNumber(1221);
        carTypeFeatures.setIsGuaranteed(true);
        carTypeFeatures.setIsOutstanding(true);
        carTypeFeatures.setMinimumAge(17);
        carTypeFeatures.setOccupantsNumber(1221);
        carTypeFeatures.setMinimumCardsNumber(4561);
        carType.setFeatures(carTypeFeatures);
        carTypes.add(carType);
        retrieveCarTypesResponse.setResponseData(carTypes);
        when(categoriesService.retrieveCarTypes(retrieveCarTypesRequest)).thenReturn(retrieveCarTypesResponse);
        this.mockMvc.perform(post("/categories/retrieveCarTypes/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveCarTypesRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void retrieveCategories() throws Exception {
        RetrieveCategoriesRequest retrieveCategoriesRequest = new RetrieveCategoriesRequest();

        RetrieveCategoriesResponse retrieveCategoriesResponse = new RetrieveCategoriesResponse();
        retrieveCategoriesResponse.setResponseCode(0);
        retrieveCategoriesResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveCategoriesResponse.setResponseMessage("Correct Petition");
        retrieveCategoriesResponse.setResponseServerName("BDS");
        retrieveCategoriesResponse.setResponseRunTime((long) 100);
        retrieveCategoriesResponse.setResponseVersion(5);
        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setId("789");
        category.setName("name");
        categories.add(category);
        retrieveCategoriesResponse.setResponseData(categories);
        when(categoriesService.retrieveCategories(retrieveCategoriesRequest)).thenReturn(retrieveCategoriesResponse);
        this.mockMvc.perform(post("/categories/retrieveCategories/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveCategoriesRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void retrieveConcepts() throws Exception {
        RetrieveConceptsRequest retrieveConceptsRequest = new RetrieveConceptsRequest();
        retrieveConceptsRequest.setConceptId(12345);
        retrieveConceptsRequest.setLanguageCode("languageId");
        retrieveConceptsRequest.setOfficeId("officeId");
        RetrieveConceptsResponse retrieveConceptsResponse = new RetrieveConceptsResponse();
        retrieveConceptsResponse.setResponseCode(0);
        retrieveConceptsResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveConceptsResponse.setResponseMessage("Correct Petition");
        retrieveConceptsResponse.setResponseServerName("BDS");
        retrieveConceptsResponse.setResponseRunTime((long) 100);
        retrieveConceptsResponse.setResponseVersion(5);
        List<Concept> conceptList = new ArrayList<>();
        Concept concept = new Concept();
        concept.setAllowRepeat(false);
        concept.setBillingDays(12345);
        concept.setDescription("Description");
        concept.setBillingDays(123);
        concept.setDiscount(123.12);
        concept.setExcluding(true);
        concept.setId(124);
        concept.setExtraOrInsurance(true);
        concept.setTaxablePriceInRequestedCurrency(456.12);
        concept.setRequired(true);
        concept.setPrice(123.45);
        concept.setName("name");
        conceptList.add(concept);
        retrieveConceptsResponse.setResponseData(conceptList);
        when(categoriesService.retrieveConcepts(retrieveConceptsRequest)).thenReturn(retrieveConceptsResponse);
        this.mockMvc.perform(post("/categories/retrieveConcepts/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveConceptsRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void retrievePlaces() throws Exception {

        RetrievePlacesRequest retrievePlacesRequest = new RetrievePlacesRequest();
        retrievePlacesRequest.setOfficeCode("office code");

        RetrievePlacesResponse retrievePlacesResponse = new RetrievePlacesResponse();
        retrievePlacesResponse.setResponseCode(0);
        retrievePlacesResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrievePlacesResponse.setResponseMessage("Correct Petition");
        retrievePlacesResponse.setResponseServerName("BDS");
        retrievePlacesResponse.setResponseRunTime((long) 100);
        retrievePlacesResponse.setResponseVersion(5);
        List<Place> places = new ArrayList<>();
        Place place = new Place();
        place.setAddress("Address");
        place.setCode(121);
        Coordinates coordinates = new Coordinates();
        coordinates.setLatitude(121.0145);
        coordinates.setLongitude(45612.3012);
        place.setCoordinates(coordinates);
        place.setOfficeName("office Name");
        place.setCoordinates(coordinates);
        retrievePlacesResponse.setResponseData(places);
        when(categoriesService.retrievePlaces(retrievePlacesRequest)).thenReturn(retrievePlacesResponse);
        this.mockMvc.perform(post("/categories/retrievePlaces/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrievePlacesRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void retrieveWidgetFilters() throws Exception {
        RetrieveWidgetFiltersRequest retrieveWidgetFiltersRequest = new RetrieveWidgetFiltersRequest();

        RetrieveWidgetFiltersResponse retrieveWidgetFiltersResponse = new RetrieveWidgetFiltersResponse();
        retrieveWidgetFiltersResponse.setResponseCode(0);
        retrieveWidgetFiltersResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveWidgetFiltersResponse.setResponseMessage("Correct Petition");
        retrieveWidgetFiltersResponse.setResponseServerName("BDS");
        retrieveWidgetFiltersResponse.setResponseRunTime((long) 100);
        retrieveWidgetFiltersResponse.setResponseVersion(5);

        WidgetFilters widgetFilters = new WidgetFilters();
        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setId("789");
        category.setName("name");
        categories.add(category);
        widgetFilters.setCategories(categories);

        List<Integer> doorsNumbers = new ArrayList<>();
        doorsNumbers.add(1);
        doorsNumbers.add(2);
        widgetFilters.setDoorsNumbers(doorsNumbers);

        List<Fuel> fuels = new ArrayList<>();
        Fuel fuel = new Fuel();
        fuel.setId("id");
        fuel.setName("name");
        widgetFilters.setFuels(fuels);

        List<Integer> occupantsNumbers = new ArrayList<>();
        occupantsNumbers.add(1);
        occupantsNumbers.add(2);
        widgetFilters.setOccupantsNumbers(occupantsNumbers);

        retrieveWidgetFiltersResponse.setResponseData(widgetFilters);

        when(categoriesService.retrieveWidgetFilters(retrieveWidgetFiltersRequest)).thenReturn(retrieveWidgetFiltersResponse);
        this.mockMvc.perform(post("/categories/retrieveWidgetFilters/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveWidgetFiltersRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}