package com.example.galocego.controller;

import com.example.galocego.model.Usuario;
import com.example.galocego.services.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsers(){
        return usuarioService.ListUsers();
    }

    @GetMapping(path =  "/{id}")
    public  Usuario getUserById(@PathVariable Long id){
        return usuarioService.getUserById(id);
    }

    @PostMapping(path = "/cadastrar")
        public Usuario saveUser(@RequestBody Usuario usuario) {
            return usuarioService.saveUser(usuario);
        }




}
