package br.com.alura.forum.domain.curso;

import jakarta.validation.constraints.NotBlank;
import java.sql.Date;

public record DadosCadastroCurso(
    @NotBlank
    String nome,
    Date dataCadastro
) {}
