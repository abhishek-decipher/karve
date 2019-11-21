package com.eccocar.karve.clients;

import com.eccocar.karve.dtos.*;

public interface ClientDataClient {
    CreateClientResponse createClient(CreateClientRequest createClientRequest);

    ModifyClientResponse updateClient(ModifyClientRequest modifyClientRequest);

    RetrieveClientResponse getClientByClientCode(RetrieveClientRequest retrieveClientRequest);

    RetrieveClientsResponse getAllClients(RetrieveClientsRequest retrieveClientsRequest);

    RetrieveClientByLicenseResponse getClientByLicense(RetrieveClientByLicenseRequest retrieveClientByLicenseRequest);
}
