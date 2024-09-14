/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pap1.logica;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author martin
 */
@MappedSuperclass
public abstract class Usuario {
    @Id
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "nombre")
    private String nombre;

    public Usuario() {
        super();
    }
        
    public String getNombre(){
        return nombre;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEmail(String email){
        this.email = email;   
    }
}