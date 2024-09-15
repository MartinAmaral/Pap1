package com.mycompany.pap1.logica;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {
    @Id
    @Column(nullable = false, unique = true)
    protected String email;

    @Column(nullable = false)
    protected String nombre;

    public Usuario() {
        super();
    }

    public String getEmail(){
        return email;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
