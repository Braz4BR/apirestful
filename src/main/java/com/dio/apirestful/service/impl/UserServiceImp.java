package com.dio.apirestful.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.dio.apirestful.domain.model.Usuario;
import com.dio.apirestful.domain.repository.UserRepository;
import com.dio.apirestful.service.UserService;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Usuario findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        
    }

    @Override
    public Usuario create(Usuario usuarioToCreate) {
        if (usuarioToCreate.getId() != null && userRepository.existsById(usuarioToCreate.getId())){
            throw new IllegalArgumentException("Esse usuário já existe");
        }
        return userRepository.save(usuarioToCreate);
    }
    
}
