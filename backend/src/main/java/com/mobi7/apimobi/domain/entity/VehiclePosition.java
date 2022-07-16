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
@Table(name = "tb_position")
public class VehiclePosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "registration_tag")
    private String registrationTag;

    @Column(name = "date_position")
    private Instant datePosition;

    @Column(name = "vehicle_speed")
    private Integer vehicleSpeed;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "ignition")
    private Boolean ignition;
}