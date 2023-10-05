package com.minduints.sakthi.service;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.minduints.sakthi.dto.request.LoginDTO;
import com.minduints.sakthi.dto.request.SignUpDTO;
import com.minduints.sakthi.dto.response.AuthenticationResponse;
import com.minduints.sakthi.model.User;
import com.minduints.sakthi.model.enumerate.Role;
import com.minduints.sakthi.repository.UserRepository;
import com.minduints.sakthi.util.JwtUtil;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	private final JwtUtil jwtUtil;

	public boolean userRegistration(SignUpDTO request) {
		Optional<User> isUserExists = userRepository.findByEmail(request.getEmail());
		if (!isUserExists.isPresent()) {
			var user = User.builder().name(request.getName()).email(request.getEmail())
					.password(passwordEncoder.encode(request.getPassword())).isEnabled(true)
					.role(Role.valueOf(request.getRole().toUpperCase())).build();
			userRepository.save(user);
			return true;
		} else {
			return false;
		}
	}

	public AuthenticationResponse userAuthentication(LoginDTO request) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
		var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
		var token = jwtUtil.generateToken(user);
		return AuthenticationResponse.builder().token(token).uid(user.getUid()).role(user.getRole()).build();
	}
}