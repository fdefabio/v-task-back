package com.proyecto.vtb.vtaskback.estudiante;


import org.springframework.data.annotation.Id;

public class Estudiante {

    @Id
    private Long   id;
    private String apellido;
    private String grupo;

    public Estudiante() {

    }

    public Estudiante(Long id, String apellido, String grupo) {
        this.id = id;
        this.apellido = apellido;
        this.grupo = grupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
