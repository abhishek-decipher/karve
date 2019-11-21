package com.eccocar.karve.controllers;

import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.ReserveService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Reserve", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("reserve")
public class ReserveController {

    private ReserveService reserveService;

    @Autowired
    ReserveController(ReserveService reserveService) {
        this.reserveService = reserveService;
    }

    @PostMapping(value = "/createReserve/")
    @ApiOperation(value = "createReserve")
    public CreateReserveResponse createReserve(@RequestBody CreateReserveRequest createReserveRequest) {
        return this.reserveService.createReserve(createReserveRequest);
    }

    @PostMapping(value = "/listOfReserve/")
    @ApiOperation(value = "Get List Of Reserve")
    public ListReservesResponse getAllListReserves(@RequestBody ListReservesRequest listReservesRequest) {
        return this.reserveService.getAllListReserves(listReservesRequest);
    }

    @PutMapping(value = "/updateReserve/")
    @ApiOperation(value = "Update Reserve")
    public ModifyReserveResponse updateReserve(@RequestBody ModifyReserveRequest modifyReserveRequest) {
        return this.reserveService.updateReserve(modifyReserveRequest);
    }


    @PutMapping(value = "/updateReserve/clientCode/")
    @ApiOperation(value = "Update Reserve By Client Code")
    public ModifyReserveClientsByCodeResponse updateReserveClientByCode(@RequestBody ModifyReserveClientsByCodeRequest modifyReserveClientsByCodeRequest) {
        return this.reserveService.updateReserveClientByCode(modifyReserveClientsByCodeRequest);
    }

    @PutMapping(value = "/updateReserveConcepts/")
    @ApiOperation(value = "Update Reserve Concepts")
    public ModifyReserveConceptsResponse updateReserveConcepts(@RequestBody ModifyReserveConceptsRequest modifyReserveConceptsRequest) {
        return this.reserveService.updateReserveConcept(modifyReserveConceptsRequest);
    }

    @PutMapping(value = "/updateReserveConcepts/Code/")
    @ApiOperation(value = "Update Reserve concepts By Code")
    public ModifyReserveConceptsByCodeResponse updateReserveConceptsByCode(@RequestBody ModifyReserveConceptsByCodeRequest modifyReserveConceptsByCodeRequest) {
        return this.reserveService.updateReserveConceptsByCode(modifyReserveConceptsByCodeRequest);
    }

    @PutMapping(value = "/updateReserveInformation/")
    @ApiOperation(value = "Update Reserve Information")
    public ModifyReserveInformationResponse updateReserveInformation(@RequestBody ModifyReserveInformationRequest modifyReserveInformationRequest) {
        return this.reserveService.updateReserveInformation(modifyReserveInformationRequest);
    }

    @PutMapping(value = "/updateReserveInformation/clientCode/")
    @ApiOperation(value = "Update Reserve Information By Client Code")
    public ModifyReserveInformationByCodeResponse updateReserveInformationByCode(@RequestBody ModifyReserveInformationByCodeRequest modifyReserveInformationByCodeRequest) {
        return this.reserveService.updateReserveInformationByCode(modifyReserveInformationByCodeRequest);
    }

    @PostMapping(value = "/getAllReserve/")
    @ApiOperation(value = "Get all Reserve")
    public RetrieveReserveResponse getAllReserve(@RequestBody RetrieveReserveRequest retrieveReserveRequest) {
        return this.reserveService.getAllReserve(retrieveReserveRequest);
    }

    @PostMapping(value = "/getAllReserveByCode/")
    @ApiOperation(value = "Get all Reserve By Code")
    public RetrieveReserveByCodeResponse getAllReserveByCode(@RequestBody RetrieveReserveByCodeRequest retrieveReserveByCodeRequest ) {
        return this.reserveService.getAllReserveByCode(retrieveReserveByCodeRequest);
    }

    @PostMapping(value = "/simulateReserve/")
    @ApiOperation(value = "Simulate Reserve")
    public SimulateReserveResponse simulateReserve(@RequestBody SimulateReserveRequest simulateReserveRequest) {
        return this.reserveService.simulateReserve(simulateReserveRequest);
    }

}
