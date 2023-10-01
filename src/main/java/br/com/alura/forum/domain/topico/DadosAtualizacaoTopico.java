package br.com.alura.forum.domain.topico;

import br.com.alura.forum.domain.autor.Autor;
import br.com.alura.forum.domain.curso.Curso;
import br.com.alura.forum.domain.estado.Estado;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
    @NotNull
    Integer id,
    String titulo,
    String mensagem,
    Estado estado,
    Autor autor,
    Curso curso
){}
