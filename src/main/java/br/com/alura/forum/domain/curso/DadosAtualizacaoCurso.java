package br.com.alura.forum.domain.curso;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCurso(
    @NotNull
    Integer id,
    String nome
){}
