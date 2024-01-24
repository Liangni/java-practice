package com.amigoscode.domain;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
