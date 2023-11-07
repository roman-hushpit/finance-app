package com.roman.hushpit.accountmanagementserver.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;


@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class CustomUser {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private UUID userId;
    private String email;
    private String password;
    private Boolean active;

}
