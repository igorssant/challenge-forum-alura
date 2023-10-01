package br.com.alura.forum.domain.topico;

import br.com.alura.forum.domain.autor.Autor;
import br.com.alura.forum.domain.curso.Curso;
import br.com.alura.forum.domain.estado.Estado;
import jakarta.validation.constraints.NotBlank;

import java.sql.Date;

public record DadosCadastroTopico (
    @NotBlank
    String titulo,
    @NotBlank
    String mensagem,
    @NotBlank
    Date dataCriacao,
    Estado estado,
    Autor autor,
    Curso curso
){}
