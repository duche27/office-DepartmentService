package com.gui.department.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@Builder
public class Error {

    private String message;

    public Error(String message) {
        this.message = message;
    }
}