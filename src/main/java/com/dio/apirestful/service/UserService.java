package com.dio.apirestful.service;

import com.dio.apirestful.domain.model.Usuario;

public interface UserService {

    Usuario findById(long id);

    Usuario create(Usuario usuarioToCreate);
}
