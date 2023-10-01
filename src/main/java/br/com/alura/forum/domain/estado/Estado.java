package br.com.alura.forum.domain.estado;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tbl_estado_topico")
@Entity(name = "Estado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "est_id")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer est_id;
    private String descricao;

    public Estado(DadosCadastroEstado estado) {
        this.descricao = estado.descricao();
    }

    public void atualizar(DadosCadastroEstado estado) {
        if(estado.descricao() != null) {
            this.descricao = estado.descricao();
        }
    }
}
