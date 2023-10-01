package br.com.alura.forum.domain.usuario;

import br.com.alura.forum.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    UserDetails findByUsr_usuario(String usuario);
}
