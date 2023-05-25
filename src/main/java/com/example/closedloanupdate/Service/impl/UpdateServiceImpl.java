package com.example.closedloanupdate.Service.impl;

import com.example.closedloanupdate.DTO.MloanClientDto;
import com.example.closedloanupdate.Model.Mclient;
import com.example.closedloanupdate.Model.Mloan;
import com.example.closedloanupdate.Service.UpdateService;
import com.example.closedloanupdate.repository.MClientrepository;
import com.example.closedloanupdate.repository.MLloanrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UpdateServiceImpl implements UpdateService {

    @Autowired
    private  MLloanrepository mLoanRepo;
    @Autowired
    private  MClientrepository mClientRepo;


    @Override
    public Optional<MloanClientDto> updateIdsWithSuffix(String id) {
        List<Mloan> mloans = mLoanRepo.findMloanByExternalId(id);
        List<Mclient> mClients = mClientRepo.findMclientByExternalId(id);

        int suffix = 1;
        for (Mloan mLoan : mloans) {
            mLoan.setExternalId(id + "#" + suffix);
            mLoanRepo.save(mLoan);
            suffix++;
        }

        suffix = 1;
        for (Mclient mClient : mClients) {
            mClient.setExternalId(id + "#" + suffix);
            mClientRepo.save(mClient);
            suffix++;
        }
        return null;
    }
}

