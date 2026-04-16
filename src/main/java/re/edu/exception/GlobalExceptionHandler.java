package re.edu.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import re.edu.dto.response.ErrorResponse;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(DataConflictException.class)
    public ResponseEntity<ErrorResponse<String>> handleDataConflictException(DataConflictException ex) {
        log.error("DataConflictException", ex);
        log.warn("DataConflictException", ex);
        log.info("DataConflictException", ex);
        log.debug("DataConflictException", ex);
        log.trace("DataConflictException", ex);
        ErrorResponse<String> errorResponse = new ErrorResponse<>(
                409,
                "Data conflict",
                ex.getMessage()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
}
