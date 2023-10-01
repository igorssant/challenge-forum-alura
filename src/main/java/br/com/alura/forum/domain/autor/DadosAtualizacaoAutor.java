package br.com.alura.forum.domain.autor;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoAutor(
        @NotNull
        Integer id,
        String nome
) {}
