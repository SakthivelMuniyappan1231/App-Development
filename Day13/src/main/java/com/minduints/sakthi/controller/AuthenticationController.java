package com.minduints.sakthi.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minduints.sakthi.constant.Api;
import com.minduints.sakthi.dto.request.LoginDTO;
import com.minduints.sakthi.dto.request.SignUpDTO;
import com.minduints.sakthi.dto.response.AuthenticationResponse;
import com.minduints.sakthi.service.AuthService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(Api.AUTH)
@RequiredArgsConstructor
@CrossOrigin(value = Api.FRONTEND)
@Tag(name = "Authentication")
public class AuthenticationController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody SignUpDTO request) {
        boolean isRegistered = authService.userRegistration(request);
        return isRegistered ? ResponseEntity.ok("User registered successfully")
                : ResponseEntity.badRequest().body("Something went wrong!");
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody LoginDTO request) {
        return ResponseEntity.ok(authService.userAuthentication(request));
    }
}