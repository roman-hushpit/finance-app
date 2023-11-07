package com.roman.hushpit.accountmanagementserver.mapper;

import com.roman.hushpit.accountmanagementserver.controller.entity.RegisterUserRequest;
import com.roman.hushpit.accountmanagementserver.repository.entity.CustomUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper
public interface UserMapper {

    @Mapping(target = "userId", expression = "java(generateUUID())")
    CustomUser mapTo(RegisterUserRequest registerUserRequest);


    default UUID generateUUID() {
        return UUID.randomUUID();
    }
}
