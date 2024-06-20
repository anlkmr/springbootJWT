package com.anil.jwtExample.Services;

import com.anil.jwtExample.exceptions.RoleNotFoundException;
import com.anil.jwtExample.exceptions.UserAlreadyExistsException;
import com.anil.jwtExample.dtos.ApiResponseDto;
import com.anil.jwtExample.dtos.SignInRequestDto;
import com.anil.jwtExample.dtos.SignUpRequestDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> signUpUser(SignUpRequestDto signUpRequestDto) throws UserAlreadyExistsException, RoleNotFoundException;

    ResponseEntity<ApiResponseDto<?>> signInUser(SignInRequestDto signInRequestDto);
}
