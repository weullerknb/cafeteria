package com.example.cafeteria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cafeteria.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
