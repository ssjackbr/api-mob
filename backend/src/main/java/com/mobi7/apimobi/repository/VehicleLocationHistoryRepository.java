package com.mobi7.apimobi.repository;

import com.mobi7.apimobi.domain.entity.VehicleLocationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleLocationHistoryRepository extends JpaRepository<VehicleLocationHistory, Long> {
}
