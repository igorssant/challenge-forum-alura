package br.com.alura.forum.domain.autor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
public interface AutorRepository extends JpaRepository<Autor, Integer> {
    UserDetails findByLogin(String usuario);
}
