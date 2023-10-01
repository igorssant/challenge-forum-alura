package br.com.alura.forum.domain.curso;

import java.sql.Date;

public record DadosDetalhamentoCurso(Integer id, String nome, Date dataCadastro) {
    public DadosDetalhamentoCurso(Curso curso) {
        this(curso.getCur_id(), curso.getNome(), curso.getDataCadastro());
    }
}
