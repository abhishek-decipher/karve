package com.eccocar.karve.services;


import com.eccocar.karve.dtos.CreateChargeRequest;
import com.eccocar.karve.dtos.CreateChargeResponse;
import com.eccocar.karve.dtos.RetrieveDiscountsRequest;
import com.eccocar.karve.dtos.RetrieveDiscountsResponse;
import com.eccocar.karve.dtos.RetrieveRatesRequest;
import com.eccocar.karve.dtos.RetrieveRatesResponse;

public interface ChargeService {

    CreateChargeResponse createCharge(CreateChargeRequest createChargeRequest);

    RetrieveDiscountsResponse retrieveDiscount(RetrieveDiscountsRequest retrieveDiscountsRequest);

    RetrieveRatesResponse retrieveRates(RetrieveRatesRequest retrieveRatesRequest);

}
