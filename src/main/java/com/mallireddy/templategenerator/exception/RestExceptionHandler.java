package com.mallireddy.templategenerator.exception;

import com.mallireddy.templategenerator.domain.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ApiResponse<Void> handleException(Exception e) {
        log.info("Exception occurred, exception message: {}", e.getMessage());
        return ApiResponse.internalServerError(e.getMessage());
    }
}
