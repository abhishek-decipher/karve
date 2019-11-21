package com.eccocar.karve.controllers;

import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.OfficeService;
import com.eccocar.karve.services.impl.OfficeServiceImpl;
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

public class OfficeControllerTest {

    private OfficeController officeController;
    private OfficeServiceImpl officeService;
    private MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        officeService = mock(OfficeServiceImpl.class);
        officeController = spy(new OfficeController(officeService));
        this.mockMvc = MockMvcBuilders.standaloneSetup(officeController).build();
    }

    @Test
    public void getAllOffices() throws Exception {
        RetrieveOfficesRequest retrieveOfficesRequest = new RetrieveOfficesRequest();
        retrieveOfficesRequest.setLanguageCode("78945");
        retrieveOfficesRequest.setPickUpOfficeId("pickupofficeId");

        RetrieveOfficesResponse retrieveOfficesResponse = new RetrieveOfficesResponse();
        retrieveOfficesResponse.setResponseCode(0);
        retrieveOfficesResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveOfficesResponse.setResponseMessage("Correct Petition");
        retrieveOfficesResponse.setResponseServerName("BDS");
        retrieveOfficesResponse.setResponseRunTime((long) 100);
        retrieveOfficesResponse.setResponseVersion(5);

        List<Office> offices = new ArrayList<>();

        Office office = new Office();
        office.setAddress("address");
        office.setAddress2("address2");
        office.setAllowCollectionAfterHours(false);
        office.setAllowCollectionOutsideOffice(false);

        Coordinates coordinates = new Coordinates();
        coordinates.setLongitude(789.12);
        coordinates.setLatitude(784.22);
        office.setCoordinates(coordinates);

        office.setId("id");
        office.setTimetableDescription("timetableDescription");
        office.setRemarks("remarks");
        office.setPostCode("post code");
        office.setAllowDeliveryAfterHours(false);
        office.setProvince("province");
        office.setTown("town");
        office.setOfficeZoneName("OfficeZoneName");
        retrieveOfficesResponse.setResponseData(offices);
        when(officeService.getAllOffices(retrieveOfficesRequest)).thenReturn(retrieveOfficesResponse);
        this.mockMvc.perform(post("/office/getAllOffices/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveOfficesResponse))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getAllOfficeZones() throws Exception {
        RetrieveOfficeZonesRequest retrieveOfficeZonesRequest = new RetrieveOfficeZonesRequest();
        retrieveOfficeZonesRequest.setLanguageCode("45645");

        RetrieveOfficeZonesResponse retrieveOfficeZonesResponse = new RetrieveOfficeZonesResponse();
        retrieveOfficeZonesResponse.setResponseCode(0);
        retrieveOfficeZonesResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveOfficeZonesResponse.setResponseMessage("Correct Petition");
        retrieveOfficeZonesResponse.setResponseServerName("BDS");
        retrieveOfficeZonesResponse.setResponseRunTime((long) 100);
        retrieveOfficeZonesResponse.setResponseVersion(5);

        List<OfficeZone> officeZones = new ArrayList<>();

        OfficeZone officeZone = new OfficeZone();
        officeZone.setId("id");
        officeZone.setName("name");
        retrieveOfficeZonesResponse.setResponseData(officeZones);

        when(officeService.getAllOfficeZones(retrieveOfficeZonesRequest)).thenReturn(retrieveOfficeZonesResponse);
        this.mockMvc.perform(post("/office/getAllOfficeZones/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveOfficeZonesResponse))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }
}