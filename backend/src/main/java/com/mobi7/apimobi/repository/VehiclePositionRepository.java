package com.mobi7.apimobi.repository;

import com.mobi7.apimobi.domain.entity.VehiclePosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
public interface VehiclePositionRepository extends JpaRepository<VehiclePosition, Long> {

    VehiclePosition findVehiclePositionByRegistrationTag(String registrationTag);

    VehiclePosition findVehiclePositionByRegistrationTagOrDatePosition (String registrationTag, Instant datePosition);

}
