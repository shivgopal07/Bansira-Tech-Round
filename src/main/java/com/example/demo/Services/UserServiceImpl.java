package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(UserDto userDto) {
        // Check if user already exists
        if (userRepository.findByUsername(userDto.getUsername()) != null) {
            throw new RuntimeException("User already exists");
        }
        
        // Create a new user entity
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        
        // Save the user
        userRepository.save(user);
    }

    @Override
    public String login(LoginRequest loginRequest) {
        // Find the user by username
        User user = userRepository.findByUsername(loginRequest.getUsername());
        
        // Check if user exists and password matches
        if (user == null || !user.getPassword().equals(loginRequest.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }
        
        // Return some success message or identifier
        return "Login successful";
    }
}
