package com.minduints.onlineservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minduints.onlineservice.constant.Api;
import com.minduints.onlineservice.dto.request.AuthenticationRequest;
import com.minduints.onlineservice.dto.request.RegisterRequest;
import com.minduints.onlineservice.dto.response.AuthenticationResponse;
import com.minduints.onlineservice.service.AuthService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(Api.AUTH)
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000" , allowCredentials = "true")
public class AuthenticationController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        boolean isRegistered = authService.userRegistration(request);
        return isRegistered ? ResponseEntity.ok("User registered successfully")
                : ResponseEntity.badRequest().body("Sommething went wrong!");
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(authService.userAuthentication(request));
    }
}
