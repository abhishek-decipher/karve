package com.eccocar.karve.services.impl;

import com.eccocar.karve.clients.ReserveClient;
import com.eccocar.karve.dtos.*;
import com.eccocar.karve.services.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveServiceImpl implements ReserveService {

    private ReserveClient reserveClient;

    @Autowired
    public ReserveServiceImpl(ReserveClient reserveClient) {
        this.reserveClient = reserveClient;
    }

    @Override
    public CreateReserveResponse createReserve(CreateReserveRequest createReserveRequest) {
        return reserveClient.createReserve(createReserveRequest);
    }

    @Override
    public ListReservesResponse getAllListReserves(ListReservesRequest listReservesRequest) {
        return reserveClient.getAllListReserves(listReservesRequest);
    }

    @Override
    public ModifyReserveResponse updateReserve(ModifyReserveRequest modifyReserveRequest) {
        return reserveClient.updateReserve(modifyReserveRequest);

    }

    @Override
    public ModifyReserveClientsByCodeResponse updateReserveClientByCode(ModifyReserveClientsByCodeRequest modifyReserveClientsByCodeRequest) {
        return reserveClient.updateReserveClientByCode(modifyReserveClientsByCodeRequest);

    }

    @Override
    public ModifyReserveConceptsResponse updateReserveConcept(ModifyReserveConceptsRequest modifyReserveConceptsRequest) {
        return reserveClient.updateReserveConcept(modifyReserveConceptsRequest);
    }

    @Override
    public ModifyReserveConceptsByCodeResponse updateReserveConceptsByCode(ModifyReserveConceptsByCodeRequest modifyReserveConceptsByCodeRequest) {
        return reserveClient.updateReserveConceptsByCode(modifyReserveConceptsByCodeRequest);
    }

    @Override
    public ModifyReserveInformationResponse updateReserveInformation(ModifyReserveInformationRequest modifyReserveInformationRequest) {
        return reserveClient.updateReserveInformation(modifyReserveInformationRequest);

    }

    @Override
    public RetrieveReserveResponse getAllReserve(RetrieveReserveRequest retrieveReserveRequest) {
        return reserveClient.getAllReserve(retrieveReserveRequest);

    }

    @Override
    public RetrieveReserveByCodeResponse getAllReserveByCode(RetrieveReserveByCodeRequest retrieveReserveByCodeRequest) {
        return reserveClient.getAllReserveByCode(retrieveReserveByCodeRequest);

    }

    @Override
    public SimulateReserveResponse simulateReserve(SimulateReserveRequest simulateReserveRequest) {
        return reserveClient.simulateReserve(simulateReserveRequest);
    }

    @Override
    public ModifyReserveInformationByCodeResponse updateReserveInformationByCode(ModifyReserveInformationByCodeRequest modifyReserveInformationByCodeRequest) {
        return reserveClient.updateReserveInformationByCode(modifyReserveInformationByCodeRequest);
    }
}
