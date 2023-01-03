package com.katru.api.resource.request;

public record CreateUserRequest(String cpf, String name, String email, String phone_number, String user_name, String password, String roles) {
    
}
