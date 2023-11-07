package com.roman.hushpit.finance.init;

import com.roman.hushpit.finance.repository.CustomUserRepository;
import com.roman.hushpit.finance.repository.entity.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class StartUpDataService implements ApplicationRunner {

    @Autowired
    private CustomUserRepository customUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        customUserRepository.save(CustomUser.builder()
                .email("test@Test.com")
                .password(passwordEncoder.encode("password"))
                .userId(UUID.randomUUID())
                .id(1L)
                .build());
    }
}
