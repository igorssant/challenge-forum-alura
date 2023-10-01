package br.com.alura.forum.domain.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name = "tbl_curso")
@Entity(name = "Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cur_id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cur_id;
    private String nome;
    private Date dataCadastro;
    private Boolean ativo;

    public Curso(DadosCadastroCurso curso) {
        this.ativo = true;
        this.nome = curso.nome();
        this.dataCadastro = curso.dataCadastro();
    }

    public void atualizar(DadosCadastroCurso curso) {
        if(curso.nome() != null) {
            this.nome = curso.nome();
        }

        if(curso.dataCadastro() != null) {
            this.dataCadastro = curso.dataCadastro();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
