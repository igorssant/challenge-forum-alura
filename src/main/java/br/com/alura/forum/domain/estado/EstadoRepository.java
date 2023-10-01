package br.com.alura.forum.domain.estado;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
    Page<Estado> findAllByEst_id(Pageable paginacao);
}
