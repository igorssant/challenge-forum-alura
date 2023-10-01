package br.com.alura.forum.domain.autor;

import jakarta.validation.constraints.NotBlank;
import java.sql.Date;

public record DadosCadastroAutor(
        @NotBlank
        String nome,
        @NotBlank
        Date dataCadastro
) {}
