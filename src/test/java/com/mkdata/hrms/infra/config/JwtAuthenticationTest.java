package com.mkdata.hrms.infra.config;

import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;
import org.springframework.security.authentication.AuthenticationManager;

@DisplayName("JWT authentication")
public class JwtAuthenticationTest {

    @Mock
    AuthenticationManager authenticationManager;
}
