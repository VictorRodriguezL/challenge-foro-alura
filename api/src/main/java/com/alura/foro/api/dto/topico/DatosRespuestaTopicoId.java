package com.alura.foro.api.dto.topico;

import com.alura.foro.api.dto.curso.DatosRespuestaCurso;
import com.alura.foro.api.dto.usuario.DatosRespuestaUsuario;
import com.alura.foro.api.modelo.Topico;

public record DatosRespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                     DatosRespuestaCurso curso) {

    public DatosRespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}
