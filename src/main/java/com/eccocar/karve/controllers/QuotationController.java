package com.eccocar.karve.controllers;


import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.ChargeService;
import com.eccocar.karve.services.QuotationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "quotation" , produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("quotation")
public class QuotationController {

    private QuotationService quotationService;

    @Autowired
    QuotationController(QuotationService quotationService) {

        this.quotationService = quotationService;
    }

    @PostMapping(value = "/getQuotationCarTypes/")
    @ApiOperation(value = "Quotation Car Types")
    public RetrieveQuotationCarTypeResponse getQuotationCarTypes(@RequestBody RetrieveQuotationCarTypeRequest retrieveQuotationCarTypeRequest) {
        return this.quotationService.getQuotationCarTypes(retrieveQuotationCarTypeRequest);
    }

    @PostMapping(value = "/getQuotation/")
    @ApiOperation(value = "Get quotation")
    public RetrieveQuotationResponse getQuotation(@RequestBody RetrieveQuotationRequest retrieveQuotationRequest) {
        return this.quotationService.getQuotation(retrieveQuotationRequest);
    }
}
