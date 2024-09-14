/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pap1.logica;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "distribuciones")
public class Distribucion {
    @Id
    @ManyToOne
    @JoinColumn(name = "donacion_id")
    private Donacion donacion;

    @Column(name = "fecha_preparacion")
    private LocalDate fechaPreparacion;

    @Column(name = "fecha_entrega")
    private LocalDate fechaEntrega;

    @Column(name = "estado_distribucion")
    @Enumerated(EnumType.STRING)
    private EstadoDistribucion estadoDistribucion;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id")
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


