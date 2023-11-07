package com.roman.hushpit.finance.security;

import com.roman.hushpit.finance.repository.entity.CustomUser;
import com.roman.hushpit.finance.repository.CustomUserRepository;
import com.roman.hushpit.finance.security.entity.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;
import java.util.Optional;

@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final CustomUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<CustomUser> customUser = userRepository.findByEmail(email);
        if (customUser.isEmpty()) throw new UsernameNotFoundException("User not found");
        return new CustomUserDetails(customUser.get(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
