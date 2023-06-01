package com.alura.foro.api.dto.usuario;

import com.alura.foro.api.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
