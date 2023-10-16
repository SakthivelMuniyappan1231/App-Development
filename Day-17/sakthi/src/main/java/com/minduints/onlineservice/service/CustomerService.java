package com.minduints.onlineservice.service;

import java.util.List;

import com.minduints.onlineservice.dto.request.UserRequest;
import com.minduints.onlineservice.dto.response.UserResponse;

public interface CustomerService {
	
    List<UserResponse> getAllUsers();

    UserResponse getUser(Long uid);

    UserResponse updateUser(UserRequest request, Long uid);

    boolean deleteUser(Long uid);
}
