package com.consultas;

import javax.persistence.*;

@Entity
@Table( name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;

    @Column(name = "email", length = 35, nullable = false, unique = true)
    private String email;

    @Column(name = "mensaje", length = 250, nullable = false)
    private String mensaje;

    public Consulta() {
    }

    public Consulta(int id, String nombre, String email, String mensaje) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
