package com.eccocar.karve.services.impl;

import com.eccocar.karve.clients.ChargeClient;
import com.eccocar.karve.dtos.CreateChargeRequest;
import com.eccocar.karve.dtos.CreateChargeResponse;
import com.eccocar.karve.dtos.RetrieveDiscountsRequest;
import com.eccocar.karve.dtos.RetrieveDiscountsResponse;
import com.eccocar.karve.dtos.RetrieveRatesRequest;
import com.eccocar.karve.dtos.RetrieveRatesResponse;
import com.eccocar.karve.services.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargeServiceImpl implements ChargeService {

    private ChargeClient chargeClient;

    @Autowired
    ChargeServiceImpl(ChargeClient chargeClient) {

        this.chargeClient = chargeClient;
    }

    @Override
    public CreateChargeResponse createCharge(CreateChargeRequest createChargeRequest) {
        return chargeClient.createCharge(createChargeRequest);
    }

    @Override
    public RetrieveDiscountsResponse retrieveDiscount(RetrieveDiscountsRequest retrieveDiscountsRequest) {
        return chargeClient.getDiscount(retrieveDiscountsRequest);

    }

    @Override
    public RetrieveRatesResponse retrieveRates(RetrieveRatesRequest retrieveRatesRequest) {
        return chargeClient.getRates(retrieveRatesRequest);
    }
}
