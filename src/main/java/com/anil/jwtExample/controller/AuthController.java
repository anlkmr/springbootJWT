package com.anil.jwtExample.controller;

import com.anil.jwtExample.exceptions.UserAlreadyExistsException;
import com.anil.jwtExample.Services.AuthService;
import com.anil.jwtExample.dtos.ApiResponseDto;
import com.anil.jwtExample.dtos.SignInRequestDto;
import com.anil.jwtExample.dtos.SignUpRequestDto;
import com.anil.jwtExample.exceptions.RoleNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<ApiResponseDto<?>> signUpUser(@RequestBody @Valid SignUpRequestDto signUpRequestDto)
            throws UserAlreadyExistsException, RoleNotFoundException {
        return authService.signUpUser(signUpRequestDto);
    }

    @PostMapping("/signin")
    public ResponseEntity<ApiResponseDto<?>> signInUser(@RequestBody @Valid SignInRequestDto signInRequestDto){
        return authService.signInUser(signInRequestDto);
    }

}
