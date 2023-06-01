package com.alura.foro.api.dto.respuesta;

import com.alura.foro.api.modelo.Topico;
import com.alura.foro.api.modelo.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarRespuesta(
        @NotNull
        Long id,
        @NotBlank
        String mensaje,
        @NotNull
        Long topicoId,
        @NotBlank
        Long autorId,
        @NotNull
        Boolean solucion) {
}
