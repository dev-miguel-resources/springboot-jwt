package com.chilecompra.springboot.backend.apirest.models.services;

import com.chilecompra.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService { //interfaz personalizada

	public Usuario findByUsername(String username);
}
