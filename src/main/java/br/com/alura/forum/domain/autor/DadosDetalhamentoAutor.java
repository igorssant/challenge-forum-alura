package br.com.alura.forum.domain.autor;

import java.sql.Date;

public record DadosDetalhamentoAutor(
    Integer id,
    String nome,
    Date dataCadastro
) {
    public DadosDetalhamentoAutor(Autor autor) {
        this(
            autor.getAut_id(),
            autor.getNome(),
            autor.getDataCadastro()
        );
    }
}
