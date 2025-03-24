package com.dio.apirestful.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.apirestful.domain.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long>{
    
    
}
