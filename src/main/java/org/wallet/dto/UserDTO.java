package org.wallet.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserDTO {

    private Long id;
    @Email(message = "E-mail inválido!")
    private String email;
    private String name;
    @NotNull
    @Length(max = 10, min = 6, message = "A senha deve conter no mínimo 6 caracteres e no máximo 10")
    private String password;
}
