package com.example.Estudiantes.servicio;

import com.example.Estudiantes.entity.Estudiantes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudiantesServicio {

    private List<Estudiantes> estudiantes = new ArrayList<>();

    public EstudiantesServicio() {
        estudiantes.add(new Estudiantes(1, "Juan", "Velasques", 25, 35, 30));
        estudiantes.add(new Estudiantes(2, "Ana", "Grajales", 21, 35, 30));
        estudiantes.add(new Estudiantes(3, "Pedro", "Renteria", 45, 24, 11));
        estudiantes.add(new Estudiantes(4, "Arturo", "Benavides", 35, 45, 32));
        estudiantes.add(new Estudiantes(5, "Jose", "Guarin", 25, 31, 31));
        estudiantes.add(new Estudiantes(6, "Laura", "Jans", 55, 23, 36));

    }

    public List<Estudiantes> listarEstudiantes() {
        return estudiantes;
    }

    public Estudiantes buscarNombre(String nombre) {
        for (Estudiantes e : estudiantes) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null;
    }

    public void agregarEstudiantes(Estudiantes estudiante) throws Exception {
        // Verificar si el nombre ya existe
        for (Estudiantes e : estudiantes) {
            if (e.getNombre().equals(estudiante.getNombre())) {
                throw new Exception("El nombre del estudiante ya existe");
            }
        }
        estudiantes.add(estudiante);
    }

    public void actualizarEstudiante(Estudiantes estudiante) {
        for (Estudiantes e : estudiantes) {
            if (e.getNombre().equals(estudiante.getNombre())) {
                e.setNota1(estudiante.getNota1());
                e.setNota2(estudiante.getNota2());
                e.setNota3(estudiante.getNota3());
                break;
            }
        }
    }

    public List<Estudiantes> calcularPromedioNotasEstudiantes() {
        List<Estudiantes> estudiantesConPromedio = new ArrayList<>();
        for (Estudiantes e : estudiantes) {
            float promedio = (float) ((e.getNota1() + e.getNota2() + e.getNota3()) / 3);
            promedio = Math.round(promedio * 100.0f) / 100.0f; // Redondear a 2 decimales
            e.setPromedio(promedio);
            estudiantesConPromedio.add(e);
        }
        return estudiantesConPromedio;
    }


}