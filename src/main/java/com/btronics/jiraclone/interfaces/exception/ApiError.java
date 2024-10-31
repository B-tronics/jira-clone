package com.btronics.jiraclone.interfaces.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class ApiError {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    LocalDateTime timestamp;
    String path;
    int status;
    String error;
    String message;
    @Builder.Default
    List<String> details = new ArrayList<>();
}
