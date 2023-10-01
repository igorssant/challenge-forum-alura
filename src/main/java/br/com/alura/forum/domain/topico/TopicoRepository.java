package br.com.alura.forum.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Integer> {
    Page<Topico> findAllByTop_id(Pageable paginacao);
}
