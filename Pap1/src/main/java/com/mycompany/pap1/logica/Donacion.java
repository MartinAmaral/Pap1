/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pap1.logica;

import java.util.List;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;

/**
 *
 * @author martin
 */
@Entity
public class Donacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    private LocalDate fechaIngresada;

    @OneToMany(mappedBy = "donacion", fetch = FetchType.LAZY)
    private List<Distribucion> distribuciones;

    public Donacion() {
        super();
    }

    public Donacion(int id, LocalDate fechaIngresada) {
        this.id = id;
        this.fechaIngresada = fechaIngresada;
    }

    public int getId(){
        return id;
    }
    public LocalDate getFechaIngresada(){
        return fechaIngresada;
    }

    public List<Distribucion> getDistribuciones() {
        return distribuciones;
    }

    public void setDistribuciones(List<Distribucion> distribuciones) {
        this.distribuciones = distribuciones;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setFechaIngresada(LocalDate fecha){
        this.fechaIngresada = fecha;
    }
}
