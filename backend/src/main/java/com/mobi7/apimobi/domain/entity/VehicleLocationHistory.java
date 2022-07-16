package com.mobi7.apimobi.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tb_vehicle_location_history")
public class VehicleLocationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_interest_point")
    private String nameInterestPoint;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "start_position")
    private Instant startPositionDate;

    @Column(name = "end_position")
    private Instant endPositionDate;

    @Column(name = "quantity_hours")
    private Instant quantityHoursAtPoint;
}
