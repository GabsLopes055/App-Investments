package br.com.th.springboot.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Data;

@Data
public class UserRequest {

    @Positive(message = "O id do usuário deve ser um número positivo.")
    private Long id;
    
    @NotBlank(message = "O nome do usuário não pode ser em branco.")
    @NotNull(message = "O nome do usuário não pode ser em branco.")
    private String name;

    @NotBlank(message = "O username do usuário não pode ser em branco.")
    private String username;

    @NotBlank(message = "O email do usuário não pode ser em branco.")
    @Email(message = "Informe um email válido.")
    private String email;

    @NotBlank(message = "O password do usuário não pode ser em branco.")
    private String password;

    public UserRequest(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UserRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
