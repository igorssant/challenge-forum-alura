package br.com.alura.forum.domain.autor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AutorRepository extends JpaRepository<Autor, Integer> {
    Page<Autor> findAllByAut_id(Pageable paginacao);
}
