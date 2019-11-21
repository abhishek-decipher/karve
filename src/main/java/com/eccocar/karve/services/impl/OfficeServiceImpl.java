package com.eccocar.karve.services.impl;

import com.eccocar.karve.clients.OfficeClient;
import com.eccocar.karve.dtos.RetrieveOfficeZonesRequest;
import com.eccocar.karve.dtos.RetrieveOfficeZonesResponse;
import com.eccocar.karve.dtos.RetrieveOfficesRequest;
import com.eccocar.karve.dtos.RetrieveOfficesResponse;
import com.eccocar.karve.services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeServiceImpl implements OfficeService {

    private OfficeClient officeClient;

    @Autowired
    public OfficeServiceImpl(OfficeClient officeClient) {
        this.officeClient = officeClient;
    }


    @Override
    public RetrieveOfficesResponse getAllOffices(RetrieveOfficesRequest retrieveOfficesRequest) {
        return officeClient.getAllOffices(retrieveOfficesRequest);
    }

    @Override
    public RetrieveOfficeZonesResponse getAllOfficeZones(RetrieveOfficeZonesRequest retrieveOfficeZonesRequest) {
        return officeClient.getAllOfficeZones(retrieveOfficeZonesRequest);

    }
}
