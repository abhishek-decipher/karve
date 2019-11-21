package com.eccocar.karve.clients;

import com.eccocar.karve.dtos.CreateChargeRequest;
import com.eccocar.karve.dtos.CreateChargeResponse;
import com.eccocar.karve.dtos.RetrieveDiscountsRequest;
import com.eccocar.karve.dtos.RetrieveDiscountsResponse;
import com.eccocar.karve.dtos.RetrieveRatesRequest;
import com.eccocar.karve.dtos.RetrieveRatesResponse;

public interface ChargeClient {

    CreateChargeResponse createCharge(CreateChargeRequest createChargeRequest);

    RetrieveDiscountsResponse getDiscount(RetrieveDiscountsRequest retrieveDiscountsRequest);

    RetrieveRatesResponse getRates(RetrieveRatesRequest retrieveRatesRequest);
}
