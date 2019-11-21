package com.eccocar.karve.services.impl;

import com.eccocar.karve.clients.QuotationClient;
import com.eccocar.karve.dtos.RetrieveQuotationCarTypeRequest;
import com.eccocar.karve.dtos.RetrieveQuotationCarTypeResponse;
import com.eccocar.karve.dtos.RetrieveQuotationRequest;
import com.eccocar.karve.dtos.RetrieveQuotationResponse;
import com.eccocar.karve.services.QuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuotationServiceImpl implements QuotationService {

    private QuotationClient quotationClient;

    @Autowired
    public QuotationServiceImpl(QuotationClient quotationClient) {
        this.quotationClient = quotationClient;
    }

    @Override
    public RetrieveQuotationCarTypeResponse getQuotationCarTypes(RetrieveQuotationCarTypeRequest retrieveQuotationCarTypeRequest) {
        return quotationClient.getQuotationCarTypes(retrieveQuotationCarTypeRequest);
    }

    @Override
    public RetrieveQuotationResponse getQuotation(RetrieveQuotationRequest retrieveQuotationRequest) {
        return quotationClient.getQuotation(retrieveQuotationRequest);

    }
}
