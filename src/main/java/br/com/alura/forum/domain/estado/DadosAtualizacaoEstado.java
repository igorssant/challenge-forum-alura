package br.com.alura.forum.domain.estado;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoEstado(
    @NotNull
    Integer id,
    String descricao
){}
