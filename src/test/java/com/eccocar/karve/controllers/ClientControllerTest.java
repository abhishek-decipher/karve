package com.eccocar.karve.controllers;


import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.impl.ClientServiceImpl;
import com.eccocar.karve.util.JSONUtil;
import io.swagger.annotations.ApiOperation;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.PUT;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ClientControllerTest {

    private ClientController clientController;
    private ClientServiceImpl clientService;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        clientService = mock(ClientServiceImpl.class);
        clientController = spy(new ClientController(clientService));
        this.mockMvc = MockMvcBuilders.standaloneSetup(clientController).build();
    }

    @Test
    public void getAllClients() throws Exception {
        RetrieveClientsRequest retrieveClientsRequest = new RetrieveClientsRequest();
        retrieveClientsRequest.setBirthDate("1991-12-18");
        retrieveClientsRequest.setCountryCode("ALB");

        RetrieveClientsResponse retrieveClientsResponse = new RetrieveClientsResponse();
        retrieveClientsResponse.setResponseCode(0);
        retrieveClientsResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveClientsResponse.setResponseMessage("Correct Petition");
        retrieveClientsResponse.setResponseServerName("BDS");
        retrieveClientsResponse.setResponseRunTime((long) 100);
        retrieveClientsResponse.setResponseVersion(5);

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setClientCode("000001");

        List<ClientRate> assignedRates = new ArrayList<>();

        ClientRate clientRate = new ClientRate();
        clientRate.setFromDate("1991-12-12");
        clientRate.setRateCode("450");
        clientRate.setUntilDate("1995-12-12");
        assignedRates.add(clientRate);
        PersonInformation personInformation = new PersonInformation();
        personInformation.setAddress("18 ,CUROSITY LANDMARK USA");
        personInformation.setBirthDate("1995-12-18");
        personInformation.setBirthPlace("Washington DC");
        personInformation.setCountryCode("ALB");
        personInformation.setFirstName("ADAM DECAR");
        personInformation.setLastName("DECPR");
        personInformation.setFullName("ADMAN DECOR LIVOR");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setIdentityExpeditionPlace("DC");
        personInformation.setIdentityNumber("121245AS");
        personInformation.setIdentityExpeditionDate("2000-12-01");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setTitle("DATA CLOVE");
        personInformation.setTown("DATA CLIENT");
        personInformation.setSalutation("Salutation");
        personInformation.setMail("abhishek.decipherzpne@gmail.com");
        personInformation.setLicenseClass("Class Licensed");
        personInformation.setMobile("7891200456");
        personInformation.setProvince("Data Client");
        personInformation.setPostCode("302020");

        client.setClientInformation(personInformation);
        client.setClientCode("4561231245");
        client.setIsCompany(true);
        clients.add(client);
        retrieveClientsResponse.setResponseData(clients);
        when(clientService.getAllClients(retrieveClientsRequest)).thenReturn(retrieveClientsResponse);
        this.mockMvc.perform(post("/client/getAllClients/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveClientsRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void createClient() throws Exception {
        CreateClientRequest createClientRequest = new CreateClientRequest();
        PersonInformation personInformation = new PersonInformation();
        personInformation.setAddress("18 ,CUROSITY LANDMARK USA");
        personInformation.setBirthDate("1995-12-18");
        personInformation.setBirthPlace("Washington DC");
        personInformation.setCountryCode("ALB");
        personInformation.setFirstName("ADAM DECAR");
        personInformation.setLastName("DECPR");
        personInformation.setFullName("ADMAN DECOR LIVOR");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setIdentityExpeditionPlace("DC");
        personInformation.setIdentityNumber("121245AS");
        personInformation.setIdentityExpeditionDate("2000-12-01");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setTitle("DATA CLOVE");
        personInformation.setTown("DATA CLIENT");
        personInformation.setSalutation("Salutation");
        personInformation.setMail("abhishek.decipherzpne@gmail.com");
        personInformation.setLicenseClass("Class Licensed");
        personInformation.setMobile("7891200456");
        personInformation.setProvince("Data Client");
        personInformation.setPostCode("302020");
        createClientRequest.setClientInformation(personInformation);
        createClientRequest.setIsCompany(true);

        CreateClientResponse createClientResponse = new CreateClientResponse();
        createClientResponse.setResponseCode(0);
        createClientResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        createClientResponse.setResponseMessage("Correct Petition");
        createClientResponse.setResponseServerName("BDS");
        createClientResponse.setResponseRunTime((long) 100);
        createClientResponse.setResponseVersion(5);
        createClientResponse.setResponseData("WA00001");

        when(clientService.createClient(createClientRequest)).thenReturn(createClientResponse);
        this.mockMvc.perform(post("/client/createClient/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(createClientRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void retrieveClient() throws Exception {
        RetrieveClientRequest retrieveClientRequest = new RetrieveClientRequest();
        retrieveClientRequest.setClientCode("12121");
        retrieveClientRequest.setIdentityNumber("10000001");
        retrieveClientRequest.setMail("abhishek.decipherzone@gmail.com");

        RetrieveClientResponse retrieveClientResponse = new RetrieveClientResponse();
        retrieveClientResponse.setResponseCode(0);
        retrieveClientResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        retrieveClientResponse.setResponseMessage("Correct Petition");
        retrieveClientResponse.setResponseServerName("BDS");
        retrieveClientResponse.setResponseRunTime((long) 100);
        retrieveClientResponse.setResponseVersion(5);


        Client client = new Client();
        client.setClientCode("000001");

        List<ClientRate> assignedRates = new ArrayList<>();

        ClientRate clientRate = new ClientRate();
        clientRate.setFromDate("1991-12-12");
        clientRate.setRateCode("450");
        clientRate.setUntilDate("1995-12-12");
        assignedRates.add(clientRate);
        PersonInformation personInformation = new PersonInformation();
        personInformation.setAddress("18 ,CUROSITY LANDMARK USA");
        personInformation.setBirthDate("1995-12-18");
        personInformation.setBirthPlace("Washington DC");
        personInformation.setCountryCode("ALB");
        personInformation.setFirstName("ADAM DECAR");
        personInformation.setLastName("DECPR");
        personInformation.setFullName("ADMAN DECOR LIVOR");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setIdentityExpeditionPlace("DC");
        personInformation.setIdentityNumber("121245AS");
        personInformation.setIdentityExpeditionDate("2000-12-01");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setTitle("DATA CLOVE");
        personInformation.setTown("DATA CLIENT");
        personInformation.setSalutation("Salutation");
        personInformation.setMail("abhishek.decipherzpne@gmail.com");
        personInformation.setLicenseClass("Class Licensed");
        personInformation.setMobile("7891200456");
        personInformation.setProvince("Data Client");
        personInformation.setPostCode("302020");

        client.setClientInformation(personInformation);
        client.setClientCode("4561231245");
        client.setIsCompany(true);
        retrieveClientResponse.setResponseData(client);
        when(clientService.getClientByClientCode(retrieveClientRequest)).thenReturn(retrieveClientResponse);
        this.mockMvc.perform(post("/client/getClientbyClientCode/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveClientRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void updateClient() throws Exception {
        ModifyClientRequest modifyClientRequest = new ModifyClientRequest();
        PersonInformation personInformation = new PersonInformation();
        personInformation.setAddress("18 ,CUROSITY LANDMARK USA");
        personInformation.setBirthDate("1995-12-18");
        personInformation.setBirthPlace("Washington DC");
        personInformation.setCountryCode("ALB");
        personInformation.setFirstName("ADAM DECAR");
        personInformation.setLastName("DECPR");
        personInformation.setFullName("ADMAN DECOR LIVOR");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setIdentityExpeditionPlace("DC");
        personInformation.setIdentityNumber("121245AS");
        personInformation.setIdentityExpeditionDate("2000-12-01");
        personInformation.setIdentityExpeditionCountryCode("ALB");
        personInformation.setTitle("DATA CLOVE");
        personInformation.setTown("DATA CLIENT");
        personInformation.setSalutation("Salutation");
        personInformation.setMail("abhishek.decipherzpne@gmail.com");
        personInformation.setLicenseClass("Class Licensed");
        personInformation.setMobile("7891200456");
        personInformation.setProvince("Data Client");
        personInformation.setPostCode("302020");
        modifyClientRequest.setClientInformation(personInformation);
        modifyClientRequest.setIsCompany(true);

        ModifyClientResponse modifyClientResponse = new ModifyClientResponse();

        modifyClientResponse.setResponseCode(0);
        modifyClientResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
        modifyClientResponse.setResponseMessage("Correct Petition");
        modifyClientResponse.setResponseServerName("BDS");
        modifyClientResponse.setResponseRunTime((long) 100);
        modifyClientResponse.setResponseVersion(5);
        modifyClientResponse.setResponseData("WA00001");
        when(clientService.updateClient(modifyClientRequest)).thenReturn(modifyClientResponse);
        this.mockMvc.perform(put("/client/updateClient/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(modifyClientRequest))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

   @Test
   public void getClientByLicense() throws Exception {
       RetrieveClientByLicenseRequest retrieveClientByLicenseRequest = new RetrieveClientByLicenseRequest();
       retrieveClientByLicenseRequest.setCountryCode("12121");
       retrieveClientByLicenseRequest.setLicenseNumber("ASASA12345");

       RetrieveClientByLicenseResponse retrieveClientByLicenseResponse = new RetrieveClientByLicenseResponse();
       retrieveClientByLicenseResponse.setResponseCode(0);
       retrieveClientByLicenseResponse.setResponseDatetime("Tue Nov 19 08:35:28 CET 2019");
       retrieveClientByLicenseResponse.setResponseMessage("Correct Petition");
       retrieveClientByLicenseResponse.setResponseServerName("BDS");
       retrieveClientByLicenseResponse.setResponseRunTime((long) 100);
       retrieveClientByLicenseResponse.setResponseVersion(5);

       Client client = new Client();
       client.setClientCode("000001");

       List<ClientRate> assignedRates = new ArrayList<>();

       ClientRate clientRate = new ClientRate();
       clientRate.setFromDate("1991-12-12");
       clientRate.setRateCode("450");
       clientRate.setUntilDate("1995-12-12");
       assignedRates.add(clientRate);
       PersonInformation personInformation = new PersonInformation();
       personInformation.setAddress("18 ,CUROSITY LANDMARK USA");
       personInformation.setBirthDate("1995-12-18");
       personInformation.setBirthPlace("Washington DC");
       personInformation.setCountryCode("ALB");
       personInformation.setFirstName("ADAM DECAR");
       personInformation.setLastName("DECPR");
       personInformation.setFullName("ADMAN DECOR LIVOR");
       personInformation.setIdentityExpeditionCountryCode("ALB");
       personInformation.setIdentityExpeditionPlace("DC");
       personInformation.setIdentityNumber("121245AS");
       personInformation.setIdentityExpeditionDate("2000-12-01");
       personInformation.setIdentityExpeditionCountryCode("ALB");
       personInformation.setTitle("DATA CLOVE");
       personInformation.setTown("DATA CLIENT");
       personInformation.setSalutation("Salutation");
       personInformation.setMail("abhishek.decipherzpne@gmail.com");
       personInformation.setLicenseClass("Class Licensed");
       personInformation.setMobile("7891200456");
       personInformation.setProvince("Data Client");
       personInformation.setPostCode("302020");

       client.setClientInformation(personInformation);
       client.setClientCode("4561231245");
       client.setIsCompany(true);
       retrieveClientByLicenseResponse.setResponseData(client);
       when(clientService.getClientByLicense(retrieveClientByLicenseRequest)).thenReturn(retrieveClientByLicenseResponse);
       this.mockMvc.perform(post("/client/getClientbylicense/")
                .accept(MediaType.APPLICATION_JSON)
                .content(JSONUtil.toJson(retrieveClientByLicenseResponse))
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
    }



}