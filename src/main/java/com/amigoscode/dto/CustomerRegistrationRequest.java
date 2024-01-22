package com.amigoscode.dto;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
