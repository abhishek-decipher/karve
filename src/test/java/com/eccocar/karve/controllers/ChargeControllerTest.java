package com.eccocar.karve.controllers;

import com.eccocar.karve.dtos.CreateChargeRequest;
import com.eccocar.karve.dtos.CreateChargeResponse;
import com.eccocar.karve.dtos.RetrieveDiscountsRequest;
import com.eccocar.karve.dtos.RetrieveDiscountsResponse;
import com.eccocar.karve.dtos.RetrieveRatesRequest;
import com.eccocar.karve.dtos.RetrieveRatesResponse;
import com.eccocar.karve.services.impl.ChargeServiceImpl;
import com.eccocar.karve.util.JSONUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ChargeControllerTest {

    private ChargeController chargeController;
    private ChargeServiceImpl chargeService;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        chargeService = mock(ChargeServiceImpl.class);
        chargeController = spy(new ChargeController(chargeService));
        this.mockMvc = MockMvcBuilders.standaloneSetup(chargeController).build();
    }

    @Test
    public void createCharge() throws Exception {
        CreateChargeRequest createChargeRequest = new CreateChargeRequest();
        createChargeRequest.setReserveId("qwerty123");
        createChargeRequest.setPaymentMethod(123);
        createChargeRequest.setChargedAmount(2345.00);
        createChargeRequest.setGatewayPaymentOrderId("asdf123");

        CreateChargeResponse createChargeResponse = new CreateChargeResponse();
        createChargeResponse.setResponseCode(5);
        createChargeResponse.setResponseVersion(5);
        createChargeResponse.setResponseServerName("BDS");
        createChargeResponse.setResponseRunTime(0l);
        createChargeResponse.setResponseMessage("Reserve Not Exist");
        createChargeResponse.setResponseDatetime("Tue Nov 19 09:35:33 CET 2019");

        when(chargeService.createCharge(createChargeRequest)).thenReturn(createChargeResponse);
        this.mockMvc.perform(post("/charge/createCharge/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(createChargeRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void retrieveDiscount() throws Exception {
        RetrieveDiscountsRequest retrieveDiscountsRequest = new RetrieveDiscountsRequest();
        retrieveDiscountsRequest.setOfficeId("IND321");
        retrieveDiscountsRequest.setCarTypeId("asdf1234");
        RetrieveDiscountsResponse retrieveDiscountsResponse = new RetrieveDiscountsResponse();
        retrieveDiscountsResponse.setResponseVersion(5);
        retrieveDiscountsResponse.setResponseServerName("BDS");
        retrieveDiscountsResponse.setResponseRunTime(110l);
        retrieveDiscountsResponse.setResponseMessage("Correct Petition");
        retrieveDiscountsResponse.setResponseDatetime("Tue Nov 19 09:19:24 CET 2019");
        retrieveDiscountsResponse.setResponseCode(0);
        when(chargeService.retrieveDiscount(retrieveDiscountsRequest)).thenReturn(retrieveDiscountsResponse);
        this.mockMvc.perform(post("/charge/retrieveDiscount/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveDiscountsRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    public void retrieveRates() throws Exception {
        RetrieveRatesRequest retrieveRatesRequest = new RetrieveRatesRequest();
        retrieveRatesRequest.setRateId("IND321");
        retrieveRatesRequest.setOnlyRateHeader(true);
        retrieveRatesRequest.setClientId("IND3221");
        RetrieveRatesResponse retrieveRatesResponse = new RetrieveRatesResponse();
        retrieveRatesResponse.setResponseVersion(5);
        retrieveRatesResponse.setResponseServerName("BDS");
        retrieveRatesResponse.setResponseRunTime(null);
        retrieveRatesResponse.setResponseMessage("Rate Not Assigned To Broker");
        retrieveRatesResponse.setResponseDatetime("Tue Nov 19 09:20:53 CET 2019");
        retrieveRatesResponse.setResponseCode(6);
        when(chargeService.retrieveRates(retrieveRatesRequest)).thenReturn(retrieveRatesResponse);
        this.mockMvc.perform(post("/charge/retrieveRates/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveRatesRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}