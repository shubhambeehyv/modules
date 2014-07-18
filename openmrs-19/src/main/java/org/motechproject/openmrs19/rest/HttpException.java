package org.motechproject.openmrs19.rest;

import org.springframework.http.HttpStatus;

public class HttpException extends Exception {

    private static final long serialVersionUID = 1L;
    private HttpStatus statusCode;

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpException(String message, HttpStatus status) {
        super(message);
        this.statusCode = status;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

}
