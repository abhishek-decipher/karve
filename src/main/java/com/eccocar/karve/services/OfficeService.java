package com.eccocar.karve.services;

import com.eccocar.karve.dtos.RetrieveOfficeZonesRequest;
import com.eccocar.karve.dtos.RetrieveOfficeZonesResponse;
import com.eccocar.karve.dtos.RetrieveOfficesRequest;
import com.eccocar.karve.dtos.RetrieveOfficesResponse;

public interface OfficeService {
    RetrieveOfficesResponse getAllOffices(RetrieveOfficesRequest retrieveOfficesRequest);

    RetrieveOfficeZonesResponse getAllOfficeZones(RetrieveOfficeZonesRequest retrieveOfficeZonesRequest);
}
