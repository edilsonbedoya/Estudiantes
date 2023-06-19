package com.example.Estudiantes.controller;

import com.example.Estudiantes.entity.Estudiantes;
import com.example.Estudiantes.servicio.EstudiantesServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500", allowCredentials = "true")

public class ControladorEstudiantes {
    private  EstudiantesServicio servicio;

    public ControladorEstudiantes(EstudiantesServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Estudiantes>> listarEstudiantes() {
        List<Estudiantes> estudiantes = servicio.listarEstudiantes();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }

    @PutMapping("/actualizar/{nombre}")
    public ResponseEntity<Void> actualizarEstudiante(@PathVariable String nombre, @RequestBody Estudiantes estudiante) {
        Estudiantes estudianteExistente = servicio.buscarNombre(nombre);
        if (estudianteExistente != null) {
            estudianteExistente.setNota1(estudiante.getNota1());
            estudianteExistente.setNota2(estudiante.getNota2());
            estudianteExistente.setNota3(estudiante.getNota3());
            servicio.actualizarEstudiante(estudianteExistente);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/promedio")
    public ResponseEntity<List<Estudiantes>> calcularPromedioNotasEstudiantes() {
        servicio.calcularPromedioNotasEstudiantes();
        List<Estudiantes> estudiantes = servicio.listarEstudiantes();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }
}
