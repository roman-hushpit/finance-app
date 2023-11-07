package com.roman.hushpit.accountmanagementserver.service.impl;

import com.roman.hushpit.accountmanagementserver.controller.entity.RegisterUserRequest;
import com.roman.hushpit.accountmanagementserver.exception.UserAlreadyCreatedException;
import com.roman.hushpit.accountmanagementserver.mapper.UserMapper;
import com.roman.hushpit.accountmanagementserver.repository.CustomUserRepository;
import com.roman.hushpit.accountmanagementserver.repository.entity.CustomUser;
import com.roman.hushpit.accountmanagementserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final CustomUserRepository customUserRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(RegisterUserRequest registerUserRequest) {
        checkUserNotExist(registerUserRequest.getEmail());

        CustomUser user = CustomUser.builder()
                .userId(UUID.randomUUID())
                .active(false)
                .email(registerUserRequest.getEmail())
                .password(passwordEncoder.encode(registerUserRequest.getPassword()))
                .build();
        customUserRepository.save(user);
    }

    public void checkUserNotExist(String userEmail) {
        Optional<CustomUser> customUser = customUserRepository.findByEmail(userEmail);
        if (customUser.isPresent()) {
            throw new UserAlreadyCreatedException("User already created exception");
        }
    }
}
