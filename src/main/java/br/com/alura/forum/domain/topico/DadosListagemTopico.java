package br.com.alura.forum.domain.topico;

import br.com.alura.forum.domain.autor.Autor;
import br.com.alura.forum.domain.curso.Curso;
import br.com.alura.forum.domain.estado.Estado;
import java.sql.Date;

public record DadosListagemTopico(Integer id, String titulo, String mensagem, Date dataCriacao, Estado estado, Autor autor, Curso curso) {
    public DadosListagemTopico(Topico topico) {
        this(
            topico.getTop_id(),
            topico.getTitulo(),
            topico.getMensagem(),
            topico.getDataCriacao(),
            topico.getEstado(),
            topico.getAutor(),
            topico.getCurso()
        );
    }
}
