package br.com.alura.forum.domain.topico;

import br.com.alura.forum.domain.autor.Autor;
import br.com.alura.forum.domain.curso.Curso;
import br.com.alura.forum.domain.estado.Estado;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name = "tbl_topico")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "top_id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer top_id;
    private String titulo;
    private String mensagem;
    private Date dataCriacao;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "est_id")
    private Estado estado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aut_id")
    private Autor autor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cur_id")
    private Curso curso;

    public Topico(DadosCadastroTopico topico) {
        this.titulo = topico.titulo();
        this.mensagem = topico.mensagem();
        this.dataCriacao = topico.dataCriacao();
        this.estado = topico.estado();
        this.autor = topico.autor();
        this.curso = topico.curso();
    }

    public void atualizar(DadosAtualizacaoTopico topico) {
        if(topico.titulo() != null) {
            this.titulo = topico.titulo();
        }

        if(topico.mensagem() != null) {
            this.mensagem = topico.mensagem();
        }

        if(topico.estado() != null) {
            this.estado = topico.estado();
        }

        if(topico.autor() != null) {
            this.autor = topico.autor();
        }

        if(topico.curso() != null) {
            this.curso = topico.curso();
        }
    }
    public void fecharTopico() {
        if(this.estado.getEst_id() != 2) {
            this.estado = new Estado(2, "RESPONDIDO");
        }
    }
}
