package com.alura.foro.api.dto.topico;

import com.alura.foro.api.modelo.Curso;
import com.alura.foro.api.modelo.Estado;
import com.alura.foro.api.modelo.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Estado estado,
        @NotNull
        Long autorId,
        @NotNull
        Long cursoId) {
}
