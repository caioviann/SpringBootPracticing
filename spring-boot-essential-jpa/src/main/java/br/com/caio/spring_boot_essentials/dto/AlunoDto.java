package br.com.caio.spring_boot_essentials.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlunoDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String email;
}
