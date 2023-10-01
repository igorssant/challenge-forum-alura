package br.com.alura.forum.domain.estado;

public record DadosDetalhamentoEstado(Integer id, String descricao) {
    public DadosDetalhamentoEstado(Estado estado) {
        this(estado.getEst_id(), estado.getDescricao());
    }
}
