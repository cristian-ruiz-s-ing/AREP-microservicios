package com.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hilo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToMany
    private List<Usuario> usuarios; //Usuarios que siguen el hilo (?) (o los usuarios siguen los posts?)
    @OneToMany
    private List<Post> posts; //Posts en el hilo
    @OneToOne
    private Post parentPost;
    @OneToOne
    private Hilo parentHilo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Post getParentPost() {
        return parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }

    public Hilo getParentHilo() {
        return parentHilo;
    }

    public void setParentHilo(Hilo parentHilo) {
        this.parentHilo = parentHilo;
    }
    //public static void main(String[] args) {        System.out.println("Hello world!");    }
}
