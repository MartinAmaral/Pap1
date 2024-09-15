package com.mycompany.pap1.logica;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alimentos")
public class Alimento extends Donacion {
    
    @Column(nullable = false)
    private String descripcionProductos;
    
    @Column(nullable = false)
    private int cantElementos;
    
    public Alimento(String descripcionProductos, int cantElementos, int id, LocalDate fechaIngresada) {
        super(id, fechaIngresada);
        this.descripcionProductos = descripcionProductos;
        this.cantElementos = cantElementos;
    }

    public String getDescripcionProductos() {
        return descripcionProductos;
    }

    public void setDescripcionProductos(String descripcionProductos) {
        this.descripcionProductos = descripcionProductos;
    }
    
    
    public int getCantElementos(){
        return cantElementos;
    }
    
    public void setCantElementos(int cantidad){
        cantElementos = cantidad;
    }
    
}