package com.gui.department.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DeparmentNotFoundException extends RuntimeException {

    public DeparmentNotFoundException(String message) {
        super(message);
    }
}
