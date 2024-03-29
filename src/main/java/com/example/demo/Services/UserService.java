package com.example.demo.Services;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.UserDto;

public interface UserService {
    void register(UserDto userDto);
    String login(LoginRequest loginRequest);
}
