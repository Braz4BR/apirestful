package com.dio.apirestful.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder; // Import faltando

import com.dio.apirestful.domain.model.Usuario;
import com.dio.apirestful.service.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        var usuario = userService.findById(id);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuarioToCreate) {
        var usuarioCriado = userService.create(usuarioToCreate);

        
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(usuarioCriado.getId())
            .toUri();

        return ResponseEntity.created(location).body(usuarioCriado);
    }
}
