package com.example.Estudiantes.entity;

public class Estudiantes {
    private int codigo;
    private String nombre;
    private String apellido;
    private float nota1;
    private float nota2;
    private float nota3;
    private float promedio; // Cambio de tipo de dato
    private boolean aprobado;

    public Estudiantes(int codigo, String nombre, String apellido, float nota1, float nota2, float nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "codigo=" + codigo +
                ", nombre='" + nombre +
                ", apellido='" + apellido +
                ", nota1='" + nota1 +
                ", nota2='" + nota2 +
                ", nota3='" + nota3 +
                '}';
    }
}



