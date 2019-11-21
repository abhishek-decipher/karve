package com.eccocar.karve.controllers;

import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.OfficeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Office Zones" , produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("office")
public class OfficeController {

    private OfficeService officeService;

    @Autowired
    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }


    @PostMapping(value = "/getAllOffices/")
    @ApiOperation(value = "Get All Offices")
    public RetrieveOfficesResponse getAllOffices(@RequestBody RetrieveOfficesRequest retrieveOfficesRequest) {
        return this.officeService.getAllOffices(retrieveOfficesRequest);
    }

    @PostMapping(value = "/getAllOfficeZones/")
    @ApiOperation(value = "Get All Office Zones")
    public RetrieveOfficeZonesResponse getAllOfficeZones(@RequestBody RetrieveOfficeZonesRequest retrieveOfficeZonesRequest ) {
        return this.officeService.getAllOfficeZones(retrieveOfficeZonesRequest);
    }

}
