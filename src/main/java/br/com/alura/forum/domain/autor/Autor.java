package br.com.alura.forum.domain.autor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name = "tbl_autor")
@Entity(name = "Autor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "aut_id")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aut_id;
    private String nome;
    private Date dataCadastro;
    private Boolean ativo;

    public Autor(DadosCadastroAutor autor) {
        this.ativo = true;
        this.nome = autor.nome();
        this.dataCadastro = autor.dataCadastro();
    }

    public void atualizar(DadosCadastroAutor autor) {
        if(autor.nome() != null) {
            this.nome = autor.nome();
        }

        if(autor.dataCadastro() != null) {
            this.dataCadastro = autor.dataCadastro();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
