package com.example.closedloanupdate.Service;

import com.example.closedloanupdate.DTO.MloanClientDto;

import java.util.Optional;

public interface UpdateService {

    Optional<MloanClientDto> updateIdsWithSuffix(String externalId) throws Exception;



}
