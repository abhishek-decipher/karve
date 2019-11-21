package com.eccocar.karve.services.impl;

import com.eccocar.karve.clients.ClientDataClient;
import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientDataClient clientDataClient;

    @Autowired
    ClientServiceImpl(ClientDataClient clientDataClient) {
        this.clientDataClient = clientDataClient;
    }


    @Override
    public CreateClientResponse createClient(CreateClientRequest createClientRequest) {
        return clientDataClient.createClient(createClientRequest);
    }

    @Override
    public ModifyClientResponse updateClient(ModifyClientRequest modifyClientRequest) {
        return clientDataClient.updateClient(modifyClientRequest);

    }

    @Override
    public RetrieveClientResponse getClientByClientCode(RetrieveClientRequest retrieveClientRequest) {
        return clientDataClient.getClientByClientCode(retrieveClientRequest);
    }

    @Override
    public RetrieveClientsResponse getAllClients(RetrieveClientsRequest retrieveClientsRequest) {
        return clientDataClient.getAllClients(retrieveClientsRequest);
    }

    @Override
    public RetrieveClientByLicenseResponse getClientByLicense(RetrieveClientByLicenseRequest retrieveClientByLicenseRequest) {
        return clientDataClient.getClientByLicense(retrieveClientByLicenseRequest);
    }


}
