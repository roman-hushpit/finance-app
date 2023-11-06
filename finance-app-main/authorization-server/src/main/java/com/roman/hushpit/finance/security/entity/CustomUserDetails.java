package com.roman.hushpit.finance.security.entity;

import com.roman.hushpit.finance.entity.CustomUser;
import lombok.Data;
import lombok.Getter;
import lombok.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.UUID;

@Getter
public class CustomUserDetails extends User {

    private UUID userId;

    public CustomUserDetails(CustomUser customUser, Collection<? extends GrantedAuthority> authorities) {
        super(customUser.getEmail(), customUser.getPassword(), authorities);
        userId = customUser.getUserId();
    }
}
