package com.armutolive.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Autor")
    private Long id;

    @ManyToMany(mappedBy = "autors")
    private List<Libro> libros=new ArrayList<>();

    @Column
    private String nombre;

    @Column
    private String celular;

    @Column
    private String libro;

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", libros=" + libros +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                ", libro='" + libro + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
}
