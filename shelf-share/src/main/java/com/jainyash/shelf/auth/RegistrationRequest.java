package com.jainyash.shelf.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "First name is required")
    @NotBlank(message = "First name cannot be blank")
    private String firstname;

    @NotEmpty(message = "Last name is required")
    @NotBlank(message = "Last name cannot be blank")
    private String lastname;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email is required")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @NotEmpty(message = "password is required")
    @NotBlank(message = "password cannot be blank")
    @Size(min = 8, message = "Password should be at least 8 characters long")
    private String password;
}
