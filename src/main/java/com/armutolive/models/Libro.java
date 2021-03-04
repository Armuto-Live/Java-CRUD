package com.armutolive.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long id;

    @ManyToMany
    @JoinTable(name = "libro_autor",
                joinColumns = {@JoinColumn(name="fb_book")},
                inverseJoinColumns = {@JoinColumn(name = "fb_autor")})
    private List<Autor> autors=new ArrayList<>();

    @Column
    private String titulo;
    @Column
    private int paginas;
    @Column
    private String anio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Autor> getAutors() {
        return autors;
    }

    public void setAutors(List<Autor> autors) {
        this.autors = autors;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", autors=" + autors +
                ", titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", anio='" + anio + '\'' +
                '}';
    }
}
