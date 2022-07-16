package com.mobi7.apimobi.repository;

import com.mobi7.apimobi.domain.entity.InterestPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestPointRepository extends JpaRepository<InterestPoint, Long> {

    InterestPoint findInterestPointByLatitudeAndLongitude (Double latitude, Double longitude);
}
