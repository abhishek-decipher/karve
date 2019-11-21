package com.eccocar.karve.services;

import com.eccocar.karve.dtos.RetrieveQuotationCarTypeRequest;
import com.eccocar.karve.dtos.RetrieveQuotationCarTypeResponse;
import com.eccocar.karve.dtos.RetrieveQuotationRequest;
import com.eccocar.karve.dtos.RetrieveQuotationResponse;

public interface QuotationService {


    RetrieveQuotationCarTypeResponse getQuotationCarTypes(RetrieveQuotationCarTypeRequest retrieveQuotationCarTypeRequest);

    RetrieveQuotationResponse getQuotation(RetrieveQuotationRequest retrieveQuotationRequest);
}
