package com.omisflicker.img.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResponseDTO<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean success=true;
    private int status = 200;
    private String message;
    private T body;
    private String errorCode;

    @Override
    public String toString() {
        return "ApiResponseDTO{" +
                "success=" + success +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", body=" + body +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}
