package com.consultas;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static final int serialVersionId = 1;
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
