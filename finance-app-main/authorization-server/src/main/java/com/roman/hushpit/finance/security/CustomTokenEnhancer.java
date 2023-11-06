package com.roman.hushpit.finance.security;

import com.roman.hushpit.finance.security.entity.CustomUserDetails;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.server.authorization.token.JwtEncodingContext;
import org.springframework.security.oauth2.server.authorization.token.OAuth2TokenCustomizer;

import java.util.UUID;

public class CustomTokenEnhancer implements OAuth2TokenCustomizer<JwtEncodingContext> {
    @Override
    public void customize(JwtEncodingContext context) {
        UsernamePasswordAuthenticationToken authentication = context.getPrincipal();
        if (authentication.getPrincipal() instanceof CustomUserDetails userDetails) {
            UUID userId = userDetails.getUserId();
            JwtClaimsSet.Builder claims = context.getClaims();
            claims.claim("userId", userId);
        }
    }
}
