package com.mobi7.apimobi.service;

import com.mobi7.apimobi.domain.dto.VehicleLocationDTO;
import com.mobi7.apimobi.repository.InterestPointRepository;
import com.mobi7.apimobi.repository.VehicleLocationHistoryRepository;
import com.mobi7.apimobi.repository.VehiclePositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@RequiredArgsConstructor
@Service
public class VehicleLocationHistoryService {

    private final VehicleLocationHistoryRepository vehicleLocationHistoryRepository;
    private final VehiclePositionRepository vehiclePositionRepository;
    private final InterestPointRepository interestPointRepository;

    public void parameterValidation(String resgistrationTag,
                                    Instant startPositionDate,
                                    Instant endPositionDate){

        boolean registrationTagIsEmpty = (!resgistrationTag.isEmpty());

        if (registrationTagIsEmpty){
            getQuantityHourVehicleAtPointInterest(resgistrationTag);
        } else {
            throw new RuntimeException("cannot be null");
        }

    }

    public VehicleLocationDTO getQuantityHourVehicleAtPointInterest (String resgistrationTag,
                                                                     Instant startPositionDate,
                                                                     Instant endPositionDate){
        return null;
    }

    public VehicleLocationDTO getQuantityHourVehicleAtPointInterest (String resgistrationTag){

        return null;
    }

}
