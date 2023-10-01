package br.com.alura.forum.domain.estado;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroEstado(
    @NotNull
    String descricao
){}
