package com.example.closedloanupdate.Controllers;

import com.example.closedloanupdate.DTO.MloanClientDto;
import com.example.closedloanupdate.Service.UpdateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class UpdateController {

    private final UpdateService updateService;

    public UpdateController(UpdateService updateService) {
        this.updateService = updateService;
    }

    @PutMapping(path = "/updatePayment/{externalId}", produces = "application/json")
    public ResponseEntity<Optional<MloanClientDto>> getByPaymentsDates(@PathVariable("externalId") String externalId) throws Exception {
        return new ResponseEntity<>(updateService.updateIdsWithSuffix(externalId), HttpStatus.OK);
    }
}




