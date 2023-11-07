package com.roman.hushpit.accountmanagementserver.repository;


import com.roman.hushpit.accountmanagementserver.repository.entity.CustomUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomUserRepository extends CrudRepository<CustomUser, Long> {

    Optional<CustomUser> findByEmail(String email);
}
