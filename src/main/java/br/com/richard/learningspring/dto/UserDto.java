package br.com.richard.learningspring.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserDto {

    @NotEmpty(message = "name cannot be null")
    @Size(max=92, message = "name must be lower then 92 characters long")
    private String name;

    @NotEmpty(message = "cpf cannot be null")
    @Size(max=11, message = "cpf must be lower then 11 characters long")
    private String cpf;

    @NotEmpty(message = "email cannot be null")
    @Size(max=62, message = "email must be lower then 62 characters long")
    private String email;

    @NotEmpty(message = "password cannot be null")
    private String password;

    @NotEmpty(message = "type cannot be null")
    @Pattern(regexp = "COMMON|SELLER", message = "type must be COMMON or SELLER")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
