package com.mycompany.pap1.logica;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Distribucion {
    
   
    private Donacion donacion;

 
    private LocalDate fechaPreparacion;

  
    private LocalDate fechaEntrega;

  
    private EstadoDistribucion estadoDistribucion;

   
    private Beneficiario beneficiario;

    public Distribucion() {
        super();
    }

    public Distribucion(LocalDate fechaPreparacion, LocalDate fechaEntrega, EstadoDistribucion estadoDistribucion, Beneficiario beneficiario, Donacion donacion) {
        this.fechaPreparacion = fechaPreparacion;
        this.fechaEntrega = fechaEntrega;
        this.estadoDistribucion = estadoDistribucion;
        this.beneficiario = beneficiario;
        this.donacion = donacion;
    }

    public LocalDate getFechaPreparacion(){
        return fechaPreparacion;
    }
    public LocalDate getFechaEntrega(){
        return fechaEntrega;
    }

    public EstadoDistribucion getEstadoDistribucion(){
        return estadoDistribucion;
    }

    public Beneficiario getBeneficiario(){
        return beneficiario;
    }

    public Donacion getDonacion(){
        return donacion;
    }

    public void setFechaPreparacion(LocalDate fecha){
        fechaPreparacion = fecha;
    }
    public void setFechaEntrega(LocalDate fecha){
        fechaEntrega = fecha;
    }
    public void setEstadoDistribucion(EstadoDistribucion estado){
        this.estadoDistribucion = estado;
    }

    public void setBeneficiario(Beneficiario beneficiario){
        this.beneficiario = beneficiario;
    }

    public void setDonacion(Donacion donacion){
        this.donacion = donacion;
    }
    
    
}