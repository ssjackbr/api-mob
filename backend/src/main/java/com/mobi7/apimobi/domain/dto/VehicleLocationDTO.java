package com.mobi7.apimobi.domain.dto;

import lombok.Builder;

import java.time.Instant;
import java.util.Map;

@Builder
public class VehicleLocationDTO {

    private String interestPoint;
    private String vehicle;
    private Map<Instant, Instant> datePositions;
    private Instant quantityHours;

}
