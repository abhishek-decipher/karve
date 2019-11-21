package com.eccocar.karve.controllers;


import com.eccocar.karve.dtos.CreateReserveRequest;
import com.eccocar.karve.dtos.CreateReserveResponse;
import com.eccocar.karve.dtos.CreditCardInformation;
import com.eccocar.karve.dtos.ListReservesRequest;
import com.eccocar.karve.dtos.ListReservesResponse;
import com.eccocar.karve.dtos.ModifyReserveClientsByCodeRequest;
import com.eccocar.karve.dtos.ModifyReserveClientsByCodeResponse;
import com.eccocar.karve.dtos.ModifyReserveConceptsByCodeRequest;
import com.eccocar.karve.dtos.ModifyReserveConceptsByCodeResponse;
import com.eccocar.karve.dtos.ModifyReserveConceptsRequest;
import com.eccocar.karve.dtos.ModifyReserveConceptsResponse;
import com.eccocar.karve.dtos.ModifyReserveInformationByCodeRequest;
import com.eccocar.karve.dtos.ModifyReserveInformationByCodeResponse;
import com.eccocar.karve.dtos.ModifyReserveInformationRequest;
import com.eccocar.karve.dtos.ModifyReserveInformationResponse;
import com.eccocar.karve.dtos.ModifyReserveRequest;
import com.eccocar.karve.dtos.ModifyReserveResponse;
import com.eccocar.karve.dtos.PersonInformation;
import com.eccocar.karve.dtos.RetrieveReserveByCodeRequest;
import com.eccocar.karve.dtos.RetrieveReserveByCodeResponse;
import com.eccocar.karve.dtos.RetrieveReserveRequest;
import com.eccocar.karve.dtos.RetrieveReserveResponse;
import com.eccocar.karve.dtos.SimulateReserveRequest;
import com.eccocar.karve.dtos.SimulateReserveResponse;
import com.eccocar.karve.services.impl.ReserveServiceImpl;
import com.eccocar.karve.util.JSONUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ReserveControllerTest {

    private ReserveController reserveController;
    private ReserveServiceImpl reserveService;
    private MockMvc mockMvc;
    private MockHttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        reserveService = mock(ReserveServiceImpl.class);
        reserveController = spy(new ReserveController(reserveService));
        this.mockMvc = MockMvcBuilders.standaloneSetup(reserveController).build();
    }

    @Test
    public void createReserve() throws Exception {
        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setVendor("vendor");
        creditCardInformation.setTitular("qwert");
        creditCardInformation.setNumber("12");
        creditCardInformation.setExpirationYear("2022");
        creditCardInformation.setExpirationMonth("JULY");

        PersonInformation driverInformation1 =new PersonInformation();
        driverInformation1.setTown("town");
        driverInformation1.setTitle("Mr");
        driverInformation1.setSalutation("werq");
        driverInformation1.setProvince("provice");
        driverInformation1.setPostCode("123456");
        driverInformation1.setPhone("1212 345667");
        driverInformation1.setMobile("9999955555");
        driverInformation1.setMail("mail@gmail.com");
        driverInformation1.setLicenseNumber("LINUM321");
        driverInformation1.setLicenseExpeditionPlace("place2");
        driverInformation1.setLicenseExpeditionDate("12/12/2014");
        driverInformation1.setLicenseExpeditionCountryCode("LECC");
        driverInformation1.setLicenseClass("licenceClass");
        driverInformation1.setLastName("last name");
        driverInformation1.setIdentityNumber("43332");
        driverInformation1.setIdentityExpirationDate("12/12/2020");
        driverInformation1.setIdentityExpeditionPlace("place1");
        driverInformation1.setIdentityExpeditionDate("12/12/2019");
        driverInformation1.setIdentityExpeditionCountryCode("IECC1");
        driverInformation1.setFullName("Full name");
        driverInformation1.setFirstName("First Name");
        driverInformation1.setCountryCode("IND");
        driverInformation1.setBirthPlace("Birth place");
        driverInformation1.setBirthDate("12/12/2012");
        driverInformation1.setAddress("Address1");
        PersonInformation driverInformation2 =new PersonInformation();
        driverInformation2.setTown("townn");
        driverInformation2.setTitle("Mr");
        driverInformation2.setSalutation("erwre");
        driverInformation2.setProvince("asdfg");
        driverInformation2.setPostCode("654321");
        driverInformation2.setPhone("1230 123456");
        driverInformation2.setMobile("9555559999");
        driverInformation2.setMail("mail2@gmail.com");
        driverInformation2.setLicenseNumber("linum24");
        driverInformation2.setLicenseExpeditionPlace("placesss");
        driverInformation2.setLicenseExpeditionDate("12/12/2016");
        driverInformation2.setLicenseExpeditionCountryCode("LIECC2");
        driverInformation2.setLicenseClass("licenclass");
        driverInformation2.setLastName("lst name");
        driverInformation2.setIdentityNumber("43223");
        driverInformation2.setIdentityExpirationDate("12/12/2015");
        driverInformation2.setIdentityExpeditionPlace("placeee");
        driverInformation2.setIdentityExpeditionDate("12/12/2011");
        driverInformation2.setIdentityExpeditionCountryCode("IECC2");
        driverInformation2.setFullName("full namee");
        driverInformation2.setFirstName("fist name");
        driverInformation2.setCountryCode("IND");
        driverInformation2.setBirthPlace("birthxplace");
        driverInformation2.setBirthDate("12/12/2015");
        driverInformation2.setAddress("address2");

        CreateReserveRequest createReserveRequest = new CreateReserveRequest();
        createReserveRequest.setReserveId("reserv21");
        createReserveRequest.setReceiveComercialInfo(true);
        createReserveRequest.setRateId("RAID");
        createReserveRequest.setPromotionCode("PROCOD");
        createReserveRequest.setPickUpTime("30");
        createReserveRequest.setPickUpOfficeId("PUOI");
        createReserveRequest.setPickUpDeliveryPlaceCode(3321);
        createReserveRequest.setPickUpDate("12/12/2020");
        createReserveRequest.setPaymentMethod(2);
        createReserveRequest.setLocalAddress("local Address");
        createReserveRequest.setLanguageCode("hindi");
        createReserveRequest.setGatewayPaymentOrderId("qwer3221");
        createReserveRequest.setFlight("dsfgsd");
        createReserveRequest.setDropOffTime("20");
        createReserveRequest.setDropOffOfficeId("DODID");
        createReserveRequest.setDropOffDate("12/12/2017");
        createReserveRequest.setDropOffCollectionPlaceCode(0);
        createReserveRequest.setDriverInformation2(driverInformation2);
        createReserveRequest.setDriverInformation1(driverInformation1);
        createReserveRequest.setDriverCode2("DRICOD2");
        createReserveRequest.setDriverCode1("DRICOD1");
        createReserveRequest.setDiscount(3210.00);
        createReserveRequest.setDeliveryAddress("Delivery Address");
        createReserveRequest.setCurrencyCode("CRNCYCOD");
        createReserveRequest.setCreditCard(creditCardInformation);
        createReserveRequest.setCouponCode("CPNCOD");
        createReserveRequest.setCountryCode("IND");
        createReserveRequest.setCollectionAddress("Collection address");
        createReserveRequest.setClientName("Client name");
        createReserveRequest.setClientCode("CC321");
        createReserveRequest.setChargedAmount(3210.00);
        createReserveRequest.setCarTypeId("CRTYPID");
        createReserveRequest.setCancelationTimerSeconds(30);
        createReserveRequest.setAffiliateCode("AFFCOD");
        createReserveRequest.setAdditionalNotes("additional notes");

        CreateReserveResponse createReserveResponse = new CreateReserveResponse();
        createReserveResponse.setResponseVersion(5);
        createReserveResponse.setResponseServerName("BDS");
        createReserveResponse.setResponseRunTime(null);
        createReserveResponse.setResponseMessage("Rate Not Assigned To Broker");
        createReserveResponse.setResponseDatetime("Wed Nov 20 07:37:14 CET 2019");
        createReserveResponse.setResponseData(null);
        createReserveResponse.setResponseCode(6);

        when(reserveService.createReserve(createReserveRequest)).thenReturn(createReserveResponse);
        this.mockMvc.perform(post("/reserve/createReserve/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(createReserveRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getAllListReserves() throws Exception {
        ListReservesRequest listReservesRequest = new ListReservesRequest();
        listReservesRequest.setPickUpOfficeId("PUOID");
        listReservesRequest.setPickUpDate("12/12/2018");
        listReservesRequest.setLocator("adfasdf");
        listReservesRequest.setLastMinutes(21);
        listReservesRequest.setIncludeModifieds(true);
        listReservesRequest.setDriver1LastName("Last");
        listReservesRequest.setDriver1FirstName("First");
        listReservesRequest.setBrokerCode("BROCOD");

        ListReservesResponse listReservesResponse = new ListReservesResponse();
        listReservesResponse.setResponseVersion(5);
        listReservesResponse.setResponseServerName("BDS");
        listReservesResponse.setResponseRunTime(null);
        listReservesResponse.setResponseMessage("[Sybase][ODBC Driver][Adaptive Server Anywhere]Cannot convert 12/12/2018 to a timestamp");
        listReservesResponse.setResponseDatetime("Wed Nov 20 07:52:06 CET 2019");
        listReservesResponse.setResponseCode(100);

        when(reserveService.getAllListReserves(listReservesRequest)).thenReturn(listReservesResponse);
        this.mockMvc.perform(post("/reserve/listOfReserve/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(listReservesRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void updateReserve() throws Exception {
        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setVendor("vendor");
        creditCardInformation.setTitular("qwert");
        creditCardInformation.setNumber("12");
        creditCardInformation.setExpirationYear("2022");
        creditCardInformation.setExpirationMonth("JULY");

        PersonInformation driverInformation1 =new PersonInformation();
        driverInformation1.setTown("town");
        driverInformation1.setTitle("Mr");
        driverInformation1.setSalutation("werq");
        driverInformation1.setProvince("provice");
        driverInformation1.setPostCode("123456");
        driverInformation1.setPhone("1212 345667");
        driverInformation1.setMobile("9999955555");
        driverInformation1.setMail("mail@gmail.com");
        driverInformation1.setLicenseNumber("LINUM321");
        driverInformation1.setLicenseExpeditionPlace("place2");
        driverInformation1.setLicenseExpeditionDate("12/12/2014");
        driverInformation1.setLicenseExpeditionCountryCode("LECC");
        driverInformation1.setLicenseClass("licenceClass");
        driverInformation1.setLastName("last name");
        driverInformation1.setIdentityNumber("43332");
        driverInformation1.setIdentityExpirationDate("12/12/2020");
        driverInformation1.setIdentityExpeditionPlace("place1");
        driverInformation1.setIdentityExpeditionDate("12/12/2019");
        driverInformation1.setIdentityExpeditionCountryCode("IECC1");
        driverInformation1.setFullName("Full name");
        driverInformation1.setFirstName("First Name");
        driverInformation1.setCountryCode("IND");
        driverInformation1.setBirthPlace("Birth place");
        driverInformation1.setBirthDate("12/12/2012");
        driverInformation1.setAddress("Address1");
        PersonInformation driverInformation2 =new PersonInformation();
        driverInformation2.setTown("townn");
        driverInformation2.setTitle("Mr");
        driverInformation2.setSalutation("erwre");
        driverInformation2.setProvince("asdfg");
        driverInformation2.setPostCode("654321");
        driverInformation2.setPhone("1230 123456");
        driverInformation2.setMobile("9555559999");
        driverInformation2.setMail("mail2@gmail.com");
        driverInformation2.setLicenseNumber("linum24");
        driverInformation2.setLicenseExpeditionPlace("placesss");
        driverInformation2.setLicenseExpeditionDate("12/12/2016");
        driverInformation2.setLicenseExpeditionCountryCode("LIECC2");
        driverInformation2.setLicenseClass("licenclass");
        driverInformation2.setLastName("lst name");
        driverInformation2.setIdentityNumber("43223");
        driverInformation2.setIdentityExpirationDate("12/12/2015");
        driverInformation2.setIdentityExpeditionPlace("placeee");
        driverInformation2.setIdentityExpeditionDate("12/12/2011");
        driverInformation2.setIdentityExpeditionCountryCode("IECC2");
        driverInformation2.setFullName("full namee");
        driverInformation2.setFirstName("fist name");
        driverInformation2.setCountryCode("IND");
        driverInformation2.setBirthPlace("birthxplace");
        driverInformation2.setBirthDate("12/12/2015");
        driverInformation2.setAddress("address2");

        ModifyReserveRequest modifyReserveRequest = new ModifyReserveRequest();
        modifyReserveRequest.setReserveId("reserv21");
        modifyReserveRequest.setRateId("RAID");
        modifyReserveRequest.setPromotionCode("PROCOD");
        modifyReserveRequest.setPickUpTime("30");
        modifyReserveRequest.setPickUpOfficeId("PUOI");
        modifyReserveRequest.setPickUpDeliveryPlaceCode(3321);
        modifyReserveRequest.setPickUpDate("12/12/2020");
        modifyReserveRequest.setPaymentMethod(2);
        modifyReserveRequest.setLocalAddress("local Address");
        modifyReserveRequest.setLanguageCode("hindi");
        modifyReserveRequest.setFlight("dsfgsd");
        modifyReserveRequest.setDropOffTime("20");
        modifyReserveRequest.setDropOffOfficeId("DODID");
        modifyReserveRequest.setDropOffDate("12/12/2017");
        modifyReserveRequest.setDropOffCollectionPlaceCode(0);
        modifyReserveRequest.setDriverInformation2(driverInformation2);
        modifyReserveRequest.setDriverInformation1(driverInformation1);
        modifyReserveRequest.setDriverCode2("DRICOD2");
        modifyReserveRequest.setDriverCode1("DRICOD1");
        modifyReserveRequest.setDiscount(3210.00);
        modifyReserveRequest.setDeliveryAddress("Delivery Address");
        modifyReserveRequest.setCurrencyCode("CRNCYCOD");
        modifyReserveRequest.setCreditCard(creditCardInformation);
        modifyReserveRequest.setCouponCode("CPNCOD");
        modifyReserveRequest.setCountryCode("IND");
        modifyReserveRequest.setCollectionAddress("Collection address");
        modifyReserveRequest.setClientName("Client name");
        modifyReserveRequest.setClientCode("CC321");
        modifyReserveRequest.setChargedAmount(3210.00);
        modifyReserveRequest.setCarTypeId("CRTYPID");
        modifyReserveRequest.setAffiliateCode("AFFCOD");
        modifyReserveRequest.setAdditionalNotes("additional notes");
        ModifyReserveResponse modifyReserveResponse = new ModifyReserveResponse();
        modifyReserveResponse.setResponseVersion(5);
        modifyReserveResponse.setResponseServerName("BDS");
        modifyReserveResponse.setResponseRunTime(null);
        modifyReserveResponse.setResponseMessage("Reserve Not Exist");
        modifyReserveResponse.setResponseDatetime("Wed Nov 20 08:06:52 CET 2019");
        modifyReserveResponse.setResponseData(null);
        modifyReserveResponse.setResponseCode(5);
        when(reserveService.updateReserve(modifyReserveRequest)).thenReturn(modifyReserveResponse);
        this.mockMvc.perform(put("/reserve/updateReserve/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(modifyReserveRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void updateReserveClientByCode() throws Exception {
        ModifyReserveClientsByCodeRequest modifyReserveClientsByCodeRequest = new ModifyReserveClientsByCodeRequest();
        modifyReserveClientsByCodeRequest.setReserveCode("RESVCOD");
        modifyReserveClientsByCodeRequest.setLanguageCode("HINDI");
        modifyReserveClientsByCodeRequest.setDriverCode2("DRI322");
        modifyReserveClientsByCodeRequest.setDriverCode1("DRI321");
        modifyReserveClientsByCodeRequest.setCountryCode("IND");
        modifyReserveClientsByCodeRequest.setClientCode("CC321");
        ModifyReserveClientsByCodeResponse modifyReserveClientsByCodeResponse = new ModifyReserveClientsByCodeResponse();
        modifyReserveClientsByCodeResponse.setResponseVersion(5);
        modifyReserveClientsByCodeResponse.setResponseServerName("BDS");
        modifyReserveClientsByCodeResponse.setResponseRunTime(null);
        modifyReserveClientsByCodeResponse.setResponseMessage("Reserve Not Exist");
        modifyReserveClientsByCodeResponse.setResponseDatetime("Wed Nov 20 08:17:06 CET 2019");
        modifyReserveClientsByCodeResponse.setResponseData(null);
        modifyReserveClientsByCodeResponse.setResponseCode(5);
        when(reserveService.updateReserveClientByCode(modifyReserveClientsByCodeRequest)).thenReturn(modifyReserveClientsByCodeResponse);
        this.mockMvc.perform(put("/reserve/updateReserve/clientCode/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(modifyReserveClientsByCodeRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void updateReserveConcepts() throws Exception {
        ModifyReserveConceptsRequest modifyReserveConceptsRequest = new ModifyReserveConceptsRequest();
        modifyReserveConceptsRequest.setReserveId("RESV321");
        modifyReserveConceptsRequest.setPaymentMethod(1);
        modifyReserveConceptsRequest.setLanguageCode("HINDI");
        modifyReserveConceptsRequest.setCountryCode("IND");
        modifyReserveConceptsRequest.setChargedAmount(3210.00);
        ModifyReserveConceptsResponse modifyReserveConceptsResponse = new ModifyReserveConceptsResponse();
        modifyReserveConceptsResponse.setResponseVersion(5);
        modifyReserveConceptsResponse.setResponseServerName("BDS");
        modifyReserveConceptsResponse.setResponseRunTime(null);
        modifyReserveConceptsResponse.setResponseMessage("Reserve Not Exist");
        modifyReserveConceptsResponse.setResponseDatetime("Wed Nov 20 08:25:10 CET 2019");
        modifyReserveConceptsResponse.setResponseData(null);
        modifyReserveConceptsResponse.setResponseCode(5);
        when(reserveService.updateReserveConcept(modifyReserveConceptsRequest)).thenReturn(modifyReserveConceptsResponse);
        this.mockMvc.perform(put("/reserve/updateReserveConcepts/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(modifyReserveConceptsRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void updateReserveConceptsByCode() throws Exception {
        ModifyReserveConceptsByCodeRequest modifyReserveConceptsByCodeRequest = new ModifyReserveConceptsByCodeRequest();
        modifyReserveConceptsByCodeRequest.setReserveCode("RESV321");
        modifyReserveConceptsByCodeRequest.setLanguageCode("HINDI");
        modifyReserveConceptsByCodeRequest.setCountryCode("IND");
        modifyReserveConceptsByCodeRequest.setChargedAmount(3210.0);
        ModifyReserveConceptsByCodeResponse modifyReserveConceptsByCodeResponse = new ModifyReserveConceptsByCodeResponse();
        modifyReserveConceptsByCodeResponse.setResponseVersion(5);
        modifyReserveConceptsByCodeResponse.setResponseServerName("BDS");
        modifyReserveConceptsByCodeResponse.setResponseRunTime(null);
        modifyReserveConceptsByCodeResponse.setResponseMessage("Reserve Not Exist");
        modifyReserveConceptsByCodeResponse.setResponseDatetime("Wed Nov 20 08:29:21 CET 2019");
        modifyReserveConceptsByCodeResponse.setResponseData(null);
        modifyReserveConceptsByCodeResponse.setResponseCode(5);
        when(reserveService.updateReserveConceptsByCode(modifyReserveConceptsByCodeRequest)).thenReturn(modifyReserveConceptsByCodeResponse);
        this.mockMvc.perform(put("/reserve/updateReserveConcepts/Code/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(modifyReserveConceptsByCodeRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void updateReserveInformation() throws Exception {

        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setVendor("vendor");
        creditCardInformation.setTitular("qwert");
        creditCardInformation.setNumber("12");
        creditCardInformation.setExpirationYear("2022");
        creditCardInformation.setExpirationMonth("JULY");

        PersonInformation driverInformation1 =new PersonInformation();
        driverInformation1.setTown("town");
        driverInformation1.setTitle("Mr");
        driverInformation1.setSalutation("werq");
        driverInformation1.setProvince("provice");
        driverInformation1.setPostCode("123456");
        driverInformation1.setPhone("1212 345667");
        driverInformation1.setMobile("9999955555");
        driverInformation1.setMail("mail@gmail.com");
        driverInformation1.setLicenseNumber("LINUM321");
        driverInformation1.setLicenseExpeditionPlace("place2");
        driverInformation1.setLicenseExpeditionDate("12/12/2014");
        driverInformation1.setLicenseExpeditionCountryCode("LECC");
        driverInformation1.setLicenseClass("licenceClass");
        driverInformation1.setLastName("last name");
        driverInformation1.setIdentityNumber("43332");
        driverInformation1.setIdentityExpirationDate("12/12/2020");
        driverInformation1.setIdentityExpeditionPlace("place1");
        driverInformation1.setIdentityExpeditionDate("12/12/2019");
        driverInformation1.setIdentityExpeditionCountryCode("IECC1");
        driverInformation1.setFullName("Full name");
        driverInformation1.setFirstName("First Name");
        driverInformation1.setCountryCode("IND");
        driverInformation1.setBirthPlace("Birth place");
        driverInformation1.setBirthDate("12/12/2012");
        driverInformation1.setAddress("Address1");
        PersonInformation driverInformation2 =new PersonInformation();
        driverInformation2.setTown("townn");
        driverInformation2.setTitle("Mr");
        driverInformation2.setSalutation("erwre");
        driverInformation2.setProvince("asdfg");
        driverInformation2.setPostCode("654321");
        driverInformation2.setPhone("1230 123456");
        driverInformation2.setMobile("9555559999");
        driverInformation2.setMail("mail2@gmail.com");
        driverInformation2.setLicenseNumber("linum24");
        driverInformation2.setLicenseExpeditionPlace("placesss");
        driverInformation2.setLicenseExpeditionDate("12/12/2016");
        driverInformation2.setLicenseExpeditionCountryCode("LIECC2");
        driverInformation2.setLicenseClass("licenclass");
        driverInformation2.setLastName("lst name");
        driverInformation2.setIdentityNumber("43223");
        driverInformation2.setIdentityExpirationDate("12/12/2015");
        driverInformation2.setIdentityExpeditionPlace("placeee");
        driverInformation2.setIdentityExpeditionDate("12/12/2011");
        driverInformation2.setIdentityExpeditionCountryCode("IECC2");
        driverInformation2.setFullName("full namee");
        driverInformation2.setFirstName("fist name");
        driverInformation2.setCountryCode("IND");
        driverInformation2.setBirthPlace("birthxplace");
        driverInformation2.setBirthDate("12/12/2015");
        driverInformation2.setAddress("address2");

        ModifyReserveInformationRequest modifyReserveInformationRequest = new ModifyReserveInformationRequest();
        modifyReserveInformationRequest.setReserveId("RESV321");
        modifyReserveInformationRequest.setLocalAddress("Local address");
        modifyReserveInformationRequest.setLanguageCode("HINDI");
        modifyReserveInformationRequest.setFlight("qwert");
        modifyReserveInformationRequest.setDriverInformation2(driverInformation2);
        modifyReserveInformationRequest.setDriverInformation1(driverInformation1);
        modifyReserveInformationRequest.setDeliveryAddress("Delivery address");
        modifyReserveInformationRequest.setCreditCard(creditCardInformation);
        modifyReserveInformationRequest.setCountryCode("IND");
        modifyReserveInformationRequest.setCollectionAddress("Collection address");
        modifyReserveInformationRequest.setClientName("Client Name");
        modifyReserveInformationRequest.setAdditionalNotes("Additional notes");
        ModifyReserveInformationResponse modifyReserveInformationResponse = new ModifyReserveInformationResponse();
        modifyReserveInformationResponse.setResponseVersion(5);
        modifyReserveInformationResponse.setResponseServerName("BDS");
        modifyReserveInformationResponse.setResponseRunTime(null);
        modifyReserveInformationResponse.setResponseMessage("Reserve Not Exist");
        modifyReserveInformationResponse.setResponseDatetime("Wed Nov 20 08:29:21 CET 2019");
        modifyReserveInformationResponse.setResponseData(null);
        modifyReserveInformationResponse.setResponseCode(5);
        when(reserveService.updateReserveInformation(modifyReserveInformationRequest)).thenReturn(modifyReserveInformationResponse);
        this.mockMvc.perform(put("/reserve/updateReserveInformation/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(modifyReserveInformationRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void updateReserveInformationByCode() throws Exception {

        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setVendor("vendor");
        creditCardInformation.setTitular("qwert");
        creditCardInformation.setNumber("12");
        creditCardInformation.setExpirationYear("2022");
        creditCardInformation.setExpirationMonth("JULY");

        PersonInformation driverInformation1 =new PersonInformation();
        driverInformation1.setTown("town");
        driverInformation1.setTitle("Mr");
        driverInformation1.setSalutation("werq");
        driverInformation1.setProvince("provice");
        driverInformation1.setPostCode("123456");
        driverInformation1.setPhone("1212 345667");
        driverInformation1.setMobile("9999955555");
        driverInformation1.setMail("mail@gmail.com");
        driverInformation1.setLicenseNumber("LINUM321");
        driverInformation1.setLicenseExpeditionPlace("place2");
        driverInformation1.setLicenseExpeditionDate("12/12/2014");
        driverInformation1.setLicenseExpeditionCountryCode("LECC");
        driverInformation1.setLicenseClass("licenceClass");
        driverInformation1.setLastName("last name");
        driverInformation1.setIdentityNumber("43332");
        driverInformation1.setIdentityExpirationDate("12/12/2020");
        driverInformation1.setIdentityExpeditionPlace("place1");
        driverInformation1.setIdentityExpeditionDate("12/12/2019");
        driverInformation1.setIdentityExpeditionCountryCode("IECC1");
        driverInformation1.setFullName("Full name");
        driverInformation1.setFirstName("First Name");
        driverInformation1.setCountryCode("IND");
        driverInformation1.setBirthPlace("Birth place");
        driverInformation1.setBirthDate("12/12/2012");
        driverInformation1.setAddress("Address1");
        PersonInformation driverInformation2 =new PersonInformation();
        driverInformation2.setTown("townn");
        driverInformation2.setTitle("Mr");
        driverInformation2.setSalutation("erwre");
        driverInformation2.setProvince("asdfg");
        driverInformation2.setPostCode("654321");
        driverInformation2.setPhone("1230 123456");
        driverInformation2.setMobile("9555559999");
        driverInformation2.setMail("mail2@gmail.com");
        driverInformation2.setLicenseNumber("linum24");
        driverInformation2.setLicenseExpeditionPlace("placesss");
        driverInformation2.setLicenseExpeditionDate("12/12/2016");
        driverInformation2.setLicenseExpeditionCountryCode("LIECC2");
        driverInformation2.setLicenseClass("licenclass");
        driverInformation2.setLastName("lst name");
        driverInformation2.setIdentityNumber("43223");
        driverInformation2.setIdentityExpirationDate("12/12/2015");
        driverInformation2.setIdentityExpeditionPlace("placeee");
        driverInformation2.setIdentityExpeditionDate("12/12/2011");
        driverInformation2.setIdentityExpeditionCountryCode("IECC2");
        driverInformation2.setFullName("full namee");
        driverInformation2.setFirstName("fist name");
        driverInformation2.setCountryCode("IND");
        driverInformation2.setBirthPlace("birthxplace");
        driverInformation2.setBirthDate("12/12/2015");
        driverInformation2.setAddress("address2");

        ModifyReserveInformationByCodeRequest modifyReserveInformationByCodeRequest = new ModifyReserveInformationByCodeRequest();
        modifyReserveInformationByCodeRequest.setLocalAddress("Local address");
        modifyReserveInformationByCodeRequest.setLanguageCode("HINDI");
        modifyReserveInformationByCodeRequest.setFlight("qwert");
        modifyReserveInformationByCodeRequest.setDriverInformation2(driverInformation2);
        modifyReserveInformationByCodeRequest.setDriverInformation1(driverInformation1);
        modifyReserveInformationByCodeRequest.setDeliveryAddress("Delivery address");
        modifyReserveInformationByCodeRequest.setCreditCard(creditCardInformation);
        modifyReserveInformationByCodeRequest.setCountryCode("IND");
        modifyReserveInformationByCodeRequest.setCollectionAddress("Collection address");
        modifyReserveInformationByCodeRequest.setClientName("Client Name");
        modifyReserveInformationByCodeRequest.setAdditionalNotes("Additional notes");
        ModifyReserveInformationByCodeResponse modifyReserveInformationByCodeResponse = new ModifyReserveInformationByCodeResponse();
        modifyReserveInformationByCodeResponse.setResponseVersion(5);
        modifyReserveInformationByCodeResponse.setResponseServerName("BDS");
        modifyReserveInformationByCodeResponse.setResponseRunTime(null);
        modifyReserveInformationByCodeResponse.setResponseMessage("Reserve Not Exist");
        modifyReserveInformationByCodeResponse.setResponseDatetime("Wed Nov 20 08:29:21 CET 2019");
        modifyReserveInformationByCodeResponse.setResponseData(null);
        modifyReserveInformationByCodeResponse.setResponseCode(5);
        when(reserveService.updateReserveInformationByCode(modifyReserveInformationByCodeRequest)).thenReturn(modifyReserveInformationByCodeResponse);
        this.mockMvc.perform(put("/reserve/updateReserveInformation/clientCode/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(modifyReserveInformationByCodeRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getAllReserve() throws Exception {
        RetrieveReserveRequest retrieveReserveRequest = new RetrieveReserveRequest();
        retrieveReserveRequest.setReserveId("RESV321");
        retrieveReserveRequest.setLanguageCode("HINDI");
        retrieveReserveRequest.setCountryCode("IND");
        RetrieveReserveResponse retrieveReserveResponse = new RetrieveReserveResponse();
        retrieveReserveResponse.setResponseVersion(5);
        retrieveReserveResponse.setResponseServerName("BDS");
        retrieveReserveResponse.setResponseRunTime(null);
        retrieveReserveResponse.setResponseMessage("Reserve Not Exist");
        retrieveReserveResponse.setResponseDatetime("Wed Nov 20 08:29:21 CET 2019");
        retrieveReserveResponse.setResponseData(null);
        retrieveReserveResponse.setResponseCode(5);
        when(reserveService.getAllReserve(retrieveReserveRequest)).thenReturn(retrieveReserveResponse);
        this.mockMvc.perform(post("/reserve/getAllReserve/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveReserveRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getAllReserveByCode() throws Exception {
        RetrieveReserveByCodeRequest retrieveReserveByCodeRequest = new RetrieveReserveByCodeRequest();
        retrieveReserveByCodeRequest.setReserveCode("RESV321");
        retrieveReserveByCodeRequest.setLanguageCode("HINDI");
        retrieveReserveByCodeRequest.setIncludeAllConcepts(true);
        retrieveReserveByCodeRequest.setCountryCode("IND");
        RetrieveReserveByCodeResponse retrieveReserveByCodeResponse = new RetrieveReserveByCodeResponse();
        retrieveReserveByCodeResponse.setResponseVersion(5);
        retrieveReserveByCodeResponse.setResponseServerName("BDS");
        retrieveReserveByCodeResponse.setResponseRunTime(null);
        retrieveReserveByCodeResponse.setResponseMessage("Reserve Not Exist");
        retrieveReserveByCodeResponse.setResponseDatetime("Wed Nov 20 08:29:21 CET 2019");
        retrieveReserveByCodeResponse.setResponseData(null);
        retrieveReserveByCodeResponse.setResponseCode(5);
        when(reserveService.getAllReserveByCode(retrieveReserveByCodeRequest)).thenReturn(retrieveReserveByCodeResponse);
        this.mockMvc.perform(post("/reserve/getAllReserveByCode/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveReserveByCodeRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void simulateReserve() throws Exception {
        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setVendor("vendor");
        creditCardInformation.setTitular("qwert");
        creditCardInformation.setNumber("12");
        creditCardInformation.setExpirationYear("2022");
        creditCardInformation.setExpirationMonth("JULY");

        PersonInformation driverInformation1 =new PersonInformation();
        driverInformation1.setTown("town");
        driverInformation1.setTitle("Mr");
        driverInformation1.setSalutation("werq");
        driverInformation1.setProvince("provice");
        driverInformation1.setPostCode("123456");
        driverInformation1.setPhone("1212 345667");
        driverInformation1.setMobile("9999955555");
        driverInformation1.setMail("mail@gmail.com");
        driverInformation1.setLicenseNumber("LINUM321");
        driverInformation1.setLicenseExpeditionPlace("place2");
        driverInformation1.setLicenseExpeditionDate("12/12/2014");
        driverInformation1.setLicenseExpeditionCountryCode("LECC");
        driverInformation1.setLicenseClass("licenceClass");
        driverInformation1.setLastName("last name");
        driverInformation1.setIdentityNumber("43332");
        driverInformation1.setIdentityExpirationDate("12/12/2020");
        driverInformation1.setIdentityExpeditionPlace("place1");
        driverInformation1.setIdentityExpeditionDate("12/12/2019");
        driverInformation1.setIdentityExpeditionCountryCode("IECC1");
        driverInformation1.setFullName("Full name");
        driverInformation1.setFirstName("First Name");
        driverInformation1.setCountryCode("IND");
        driverInformation1.setBirthPlace("Birth place");
        driverInformation1.setBirthDate("12/12/2012");
        driverInformation1.setAddress("Address1");
        PersonInformation driverInformation2 =new PersonInformation();
        driverInformation2.setTown("townn");
        driverInformation2.setTitle("Mr");
        driverInformation2.setSalutation("erwre");
        driverInformation2.setProvince("asdfg");
        driverInformation2.setPostCode("654321");
        driverInformation2.setPhone("1230 123456");
        driverInformation2.setMobile("9555559999");
        driverInformation2.setMail("mail2@gmail.com");
        driverInformation2.setLicenseNumber("linum24");
        driverInformation2.setLicenseExpeditionPlace("placesss");
        driverInformation2.setLicenseExpeditionDate("12/12/2016");
        driverInformation2.setLicenseExpeditionCountryCode("LIECC2");
        driverInformation2.setLicenseClass("licenclass");
        driverInformation2.setLastName("lst name");
        driverInformation2.setIdentityNumber("43223");
        driverInformation2.setIdentityExpirationDate("12/12/2015");
        driverInformation2.setIdentityExpeditionPlace("placeee");
        driverInformation2.setIdentityExpeditionDate("12/12/2011");
        driverInformation2.setIdentityExpeditionCountryCode("IECC2");
        driverInformation2.setFullName("full namee");
        driverInformation2.setFirstName("fist name");
        driverInformation2.setCountryCode("IND");
        driverInformation2.setBirthPlace("birthxplace");
        driverInformation2.setBirthDate("12/12/2015");
        driverInformation2.setAddress("address2");
        SimulateReserveRequest simulateReserveRequest = new SimulateReserveRequest();
        simulateReserveRequest.setReserveId("reserv21");
        simulateReserveRequest.setRateId("RAID");
        simulateReserveRequest.setPromotionCode("PROCOD");
        simulateReserveRequest.setPickUpTime("30");
        simulateReserveRequest.setPickUpOfficeId("PUOI");
        simulateReserveRequest.setPickUpDeliveryPlaceCode(3321);
        simulateReserveRequest.setPickUpDate("12/12/2020");
        simulateReserveRequest.setPaymentMethod(2);
        simulateReserveRequest.setLocalAddress("local Address");
        simulateReserveRequest.setLanguageCode("hindi");
        simulateReserveRequest.setFlight("dsfgsd");
        simulateReserveRequest.setDropOffTime("20");
        simulateReserveRequest.setDropOffOfficeId("DODID");
        simulateReserveRequest.setDropOffDate("12/12/2017");
        simulateReserveRequest.setDropOffCollectionPlaceCode(0);
        simulateReserveRequest.setDriverInformation2(driverInformation2);
        simulateReserveRequest.setDriverInformation1(driverInformation1);
        simulateReserveRequest.setDriverCode2("DRICOD2");
        simulateReserveRequest.setDriverCode1("DRICOD1");
        simulateReserveRequest.setDiscount(3210.00);
        simulateReserveRequest.setDeliveryAddress("Delivery Address");
        simulateReserveRequest.setCurrencyCode("CRNCYCOD");
        simulateReserveRequest.setCreditCard(creditCardInformation);
        simulateReserveRequest.setCouponCode("CPNCOD");
        simulateReserveRequest.setCountryCode("IND");
        simulateReserveRequest.setCollectionAddress("Collection address");
        simulateReserveRequest.setClientName("Client name");
        simulateReserveRequest.setClientCode("CC321");
        simulateReserveRequest.setChargedAmount(3210.00);
        simulateReserveRequest.setCarTypeId("CRTYPID");
        simulateReserveRequest.setAffiliateCode("AFFCOD");
        simulateReserveRequest.setAdditionalNotes("additional notes");

        SimulateReserveResponse simulateReserveResponse = new SimulateReserveResponse();
        simulateReserveResponse.setResponseVersion(5);
        simulateReserveResponse.setResponseServerName("BDS");
        simulateReserveResponse.setResponseRunTime(null);
        simulateReserveResponse.setResponseMessage("Reserve Not Exist");
        simulateReserveResponse.setResponseDatetime("Wed Nov 20 08:29:21 CET 2019");
        simulateReserveResponse.setResponseData(null);
        simulateReserveResponse.setResponseCode(5);
        when(reserveService.simulateReserve(simulateReserveRequest)).thenReturn(simulateReserveResponse);
        this.mockMvc.perform(post("/reserve/simulateReserve/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(simulateReserveRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}