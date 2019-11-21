package com.eccocar.karve.services;

import com.eccocar.karve.dtos.*;

public interface ClientService {

    CreateClientResponse createClient(CreateClientRequest createClientRequest);

    ModifyClientResponse updateClient(ModifyClientRequest modifyClientRequest);

    RetrieveClientResponse getClientByClientCode(RetrieveClientRequest retrieveClientRequest);

    RetrieveClientsResponse getAllClients(RetrieveClientsRequest retrieveClientsRequest);

    RetrieveClientByLicenseResponse getClientByLicense(RetrieveClientByLicenseRequest retrieveClientByLicenseRequest);
}
