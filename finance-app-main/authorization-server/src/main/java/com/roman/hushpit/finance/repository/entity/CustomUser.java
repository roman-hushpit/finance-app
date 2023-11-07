package com.roman.hushpit.finance.repository.entity;

import jakarta.persistence.Entity;
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
    private Long id;
    private UUID userId; // UUID for user ID
    private String email;
    private String password;
    private Boolean active;

}
