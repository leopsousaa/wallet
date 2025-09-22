package org.wallet.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserDTO {

    private Long id;
    @Email(message="E-mail inválido!")
    private String email;
    private String name;
    @NotNull
    private String password;
}
