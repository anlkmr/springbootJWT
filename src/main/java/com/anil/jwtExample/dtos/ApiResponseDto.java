package com.anil.jwtExample.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ApiResponseDto<T> {
    private boolean isSuccess;
    private String message;
    private T response;
}