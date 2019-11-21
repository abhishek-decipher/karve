package com.eccocar.karve.controllers;

import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "Client", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("client")
public class ClientController {

    private ClientService clientService;

    @Autowired
    ClientController(ClientService clientService) {

        this.clientService = clientService;
    }


    @PostMapping(value = "/getAllClients/")
    @ApiOperation(value = "Get All Clients")
    public RetrieveClientsResponse getAllClients(@RequestBody RetrieveClientsRequest retrieveClientsRequest) {
        return this.clientService.getAllClients(retrieveClientsRequest);
    }

    @PostMapping(value = "/getClientbyClientCode/")
    @ApiOperation(value = "Get Client by clientCode")
    public RetrieveClientResponse getClientByClientCode(@RequestBody RetrieveClientRequest retrieveClientRequest) {
        return this.clientService.getClientByClientCode(retrieveClientRequest);
    }

    @PostMapping(value = "/getClientbylicense/")
    @ApiOperation(value = "Get Client by license")
    public RetrieveClientByLicenseResponse getClientByLicense(@RequestBody RetrieveClientByLicenseRequest retrieveClientByLicenseRequest) {
        return this.clientService.getClientByLicense(retrieveClientByLicenseRequest);
    }

    @PostMapping(value = "/createClient/")
    @ApiOperation(value = "Create Client")
    public CreateClientResponse createClient(@RequestBody CreateClientRequest createClientRequest) {
            return this.clientService.createClient(createClientRequest);
    }

    @PutMapping(value = "/updateClient/")
    @ApiOperation(value = "update Client")
    public ModifyClientResponse updateClient(@RequestBody ModifyClientRequest modifyClientRequest) {
        return this.clientService.updateClient(modifyClientRequest);
    }



}
