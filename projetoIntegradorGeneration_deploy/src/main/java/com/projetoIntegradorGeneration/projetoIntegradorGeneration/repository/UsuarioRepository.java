package com.projetoIntegradorGeneration.projetoIntegradorGeneration.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoIntegradorGeneration.projetoIntegradorGeneration.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase (String nomeCompleto);

	public Optional<Usuario> findByUsuario(String usuario);
	
	public Usuario findByNomeCompleto(String nomeCompleto);
}
