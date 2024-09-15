
package com.mycompany.pap1.logica;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@Entity
public abstract class Donacion {
    
    private static int contador = 0;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "fecha_ingresada")
    LocalDate fechaIngresada;
    
    @OneToMany(mappedBy = "donacion")
    private List<Distribucion> distribuciones;
    
    public Donacion() {
        super();
    }

    public Donacion(int id, LocalDate fechaIngresada) {
        this.id = generarId();
        this.fechaIngresada = fechaIngresada;
    }
    
    private static int generarId() {
        return ++contador; 
    }
    public int getId(){
        return id;
    }
    public LocalDate getFechaIngresada(){
        return fechaIngresada;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setFechaIngresada(LocalDate fecha){
        this.fechaIngresada = fecha;
    }
}
