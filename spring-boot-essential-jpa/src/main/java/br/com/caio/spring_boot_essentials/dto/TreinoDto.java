package br.com.caio.spring_boot_essentials.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TreinoDto {

    @NotNull
    private Integer alunoId;
    @NotBlank
    private String nome;
    @NotEmpty
    private List<Integer> exerciciosIds;
}
