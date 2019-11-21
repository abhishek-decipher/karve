package com.eccocar.karve.controllers;


import com.eccocar.karve.dtos.CreateChargeRequest;
import com.eccocar.karve.dtos.CreateChargeResponse;
import com.eccocar.karve.dtos.RetrieveDiscountsRequest;
import com.eccocar.karve.dtos.RetrieveDiscountsResponse;
import com.eccocar.karve.dtos.RetrieveRatesRequest;
import com.eccocar.karve.dtos.RetrieveRatesResponse;
import com.eccocar.karve.services.ChargeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Charge", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("charge")
public class ChargeController {

    private ChargeService chargeService;

    @Autowired
    ChargeController(ChargeService chargeService) {

        this.chargeService = chargeService;
    }

    @PostMapping(value = "/createCharge/")
    @ApiOperation(value = "Create Charge")
    public CreateChargeResponse createCharge(@RequestBody CreateChargeRequest createChargeRequest) {
        return this.chargeService.createCharge(createChargeRequest);
    }

    @PostMapping(value = "/retrieveDiscount/")
    @ApiOperation(value = "Retrieve Discount")
    public RetrieveDiscountsResponse retrieveDiscount(@RequestBody RetrieveDiscountsRequest retrieveDiscountsRequest) {
        return this.chargeService.retrieveDiscount(retrieveDiscountsRequest);
    }

    @PostMapping(value = "/retrieveRates/")
    @ApiOperation(value = "Retrieve Rates")
    public RetrieveRatesResponse retrieveRates(@RequestBody RetrieveRatesRequest retrieveRatesRequest) {
        return this.chargeService.retrieveRates(retrieveRatesRequest);
    }
}
