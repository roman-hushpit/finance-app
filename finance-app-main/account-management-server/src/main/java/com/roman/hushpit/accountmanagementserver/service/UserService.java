package com.roman.hushpit.accountmanagementserver.service;

import com.roman.hushpit.accountmanagementserver.controller.entity.RegisterUserRequest;

public interface UserService {

    void registerUser(RegisterUserRequest registerUserRequest);
}
