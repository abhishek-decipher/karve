package com.eccocar.karve.clients;

import com.eccocar.karve.dtos.RetrieveQuotationCarTypeRequest;
import com.eccocar.karve.dtos.RetrieveQuotationCarTypeResponse;
import com.eccocar.karve.dtos.RetrieveQuotationRequest;
import com.eccocar.karve.dtos.RetrieveQuotationResponse;

public interface QuotationClient {
    RetrieveQuotationCarTypeResponse getQuotationCarTypes(RetrieveQuotationCarTypeRequest retrieveQuotationCarTypeRequest);

    RetrieveQuotationResponse getQuotation(RetrieveQuotationRequest retrieveQuotationRequest);
}
