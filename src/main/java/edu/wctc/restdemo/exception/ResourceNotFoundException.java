package edu.wctc.restdemo.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String resource, String param, String value) {
        super(String.format("%s not found for %s: %s", resource, param, value));
    }
}
