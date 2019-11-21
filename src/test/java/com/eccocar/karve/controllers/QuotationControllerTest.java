package com.eccocar.karve.controllers;

import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.impl.QuotationServiceImpl;
import com.eccocar.karve.util.JSONUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class QuotationControllerTest {


    private QuotationController quotationController;
    private QuotationServiceImpl quotationService;
    private MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        quotationService = mock(QuotationServiceImpl.class);
        quotationController = spy(new QuotationController(quotationService));
        this.mockMvc = MockMvcBuilders.standaloneSetup(quotationController).build();
    }

    @Test
    public void getQuotationCarTypes() throws Exception {
        RetrieveQuotationCarTypeRequest retrieveQuotationCarTypeRequest = new RetrieveQuotationCarTypeRequest();
        retrieveQuotationCarTypeRequest.setCarTypeId("carTypeId");
        retrieveQuotationCarTypeRequest.setCountryCode("countryId");
        retrieveQuotationCarTypeRequest.setCurrencyCode("currencyId");
        retrieveQuotationCarTypeRequest.setDriverAge(44);
        retrieveQuotationCarTypeRequest.setDropOffCollectionPlaceCode(456);
        retrieveQuotationCarTypeRequest.setDropOffTime("HH:MM");
        retrieveQuotationCarTypeRequest.setDropOffOfficeId("DropOffOfficeId");
        retrieveQuotationCarTypeRequest.setPromotionCode("promotioncode");
        retrieveQuotationCarTypeRequest.setPickUpTime("HH:MM");
        retrieveQuotationCarTypeRequest.setKilometers(10);
        retrieveQuotationCarTypeRequest.setDropOffDate("YYYY-MM_dd");
        retrieveQuotationCarTypeRequest.setPickUpOfficeId("pickUpOfficeId");

        RetrieveQuotationCarTypeResponse retrieveQuotationCarTypeResponse = new RetrieveQuotationCarTypeResponse();
        retrieveQuotationCarTypeResponse.setResponseCode(0);
        retrieveQuotationCarTypeResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveQuotationCarTypeResponse.setResponseMessage("Correct Petition");
        retrieveQuotationCarTypeResponse.setResponseServerName("BDS");
        retrieveQuotationCarTypeResponse.setResponseRunTime((long) 100);
        retrieveQuotationCarTypeResponse.setResponseVersion(5);

        Quotation quotation = new Quotation();
        quotation.setAdditionalDriverConcept(12);
        quotation.setBillingDays(112);
        quotation.setDestinationCurrencyCode("DestinationCurrencyCode");
        quotation.setDropOffDate("DropOffDate");
        quotation.setDropOffOfficeId("DropOffOfficeId");
        quotation.setPickUpDate("YYYY-MM-dd");
        quotation.setBillingDays(10);
        quotation.setPickUpOfficeId("pickUpOfficeId");
        quotation.setPickUpOfficeName("PickUpOfficeName");
        quotation.setQuotationNote("QuotationNote");
        quotation.setDropOffDate("DropOffDate");
        retrieveQuotationCarTypeResponse.setResponseData(quotation);
        when(quotationService.getQuotationCarTypes(retrieveQuotationCarTypeRequest)).thenReturn(retrieveQuotationCarTypeResponse);
        this.mockMvc.perform(post("/quotation/getQuotationCarTypes/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveQuotationCarTypeRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getQuotation() throws Exception {
        RetrieveQuotationRequest quotationRequest = new RetrieveQuotationRequest();
        quotationRequest.setCategoryId("CategoryId");
        quotationRequest.setCountryCode("CountryCode");
        quotationRequest.setCurrencyCode("CurrencyCode");
        quotationRequest.setDriverAge(44);
        quotationRequest.setDropOffCollectionPlaceCode(456);
        quotationRequest.setDropOffTime("HH:MM");
        quotationRequest.setDropOffOfficeId("DropOffOfficeId");
        quotationRequest.setPromotionCode("promotioncode");
        quotationRequest.setPickUpTime("HH:MM");
        quotationRequest.setKilometers(10);
        quotationRequest.setDropOffDate("YYYY-MM_dd");
        quotationRequest.setPickUpOfficeId("pickUpOfficeId");

        RetrieveQuotationResponse quotationCarTypeResponse = new RetrieveQuotationResponse();
        quotationCarTypeResponse.setResponseCode(0);
        quotationCarTypeResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        quotationCarTypeResponse.setResponseMessage("Correct Petition");
        quotationCarTypeResponse.setResponseServerName("BDS");
        quotationCarTypeResponse.setResponseRunTime((long) 100);
        quotationCarTypeResponse.setResponseVersion(5);

        Quotation quotation = new Quotation();
        quotation.setAdditionalDriverConcept(12);
        quotation.setBillingDays(112);
        quotation.setDestinationCurrencyCode("DestinationCurrencyCode");
        quotation.setDropOffDate("DropOffDate");
        quotation.setDropOffOfficeId("DropOffOfficeId");
        quotation.setPickUpDate("YYYY-MM-dd");
        quotation.setBillingDays(10);
        quotation.setPickUpOfficeId("pickUpOfficeId");
        quotation.setPickUpOfficeName("PickUpOfficeName");
        quotation.setQuotationNote("QuotationNote");
        quotation.setDropOffDate("DropOffDate");
        quotationCarTypeResponse.setResponseData(quotation);

        when(quotationService.getQuotation(quotationRequest)).thenReturn(quotationCarTypeResponse);
        this.mockMvc.perform(post("/quotation/getQuotation/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(quotationRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}