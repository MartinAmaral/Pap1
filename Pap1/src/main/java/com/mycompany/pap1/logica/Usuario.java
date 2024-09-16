package com.mycompany.pap1.logica;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto habilita la generación automática
    protected String email;

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
