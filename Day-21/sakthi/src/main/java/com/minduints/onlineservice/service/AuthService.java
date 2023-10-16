package com.minduints.onlineservice.service;

import com.minduints.onlineservice.dto.request.AuthenticationRequest;
import com.minduints.onlineservice.dto.request.RegisterRequest;
import com.minduints.onlineservice.dto.response.AuthenticationResponse;

public interface AuthService {
    boolean userRegistration(RegisterRequest request);

    AuthenticationResponse userAuthentication(AuthenticationRequest request);
}
