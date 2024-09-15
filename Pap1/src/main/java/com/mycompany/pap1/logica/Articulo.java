package com.mycompany.pap1.logica;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo extends Donacion {
    
    @Column(nullable = false)
    private String descripcion;
    
    @Column(nullable = false)
    private float peso;
    
    @Column(nullable = false)
    private String dimensiones;
  
    public Articulo(String descripcion, float peso, String dimensiones, int id, LocalDate fechaIngresada) {
        super(id, fechaIngresada);
        this.descripcion = descripcion;
        this.peso = peso;
        this.dimensiones = dimensiones;
    }  
    
    public String getDescripcion(){
        return descripcion;
    }
    public float getPeso(){
        return peso;
    }
    public String getDimensiones(){
        return dimensiones;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public void setDimensiones(String dimensiones){
        this.dimensiones = dimensiones;
    }
    
}