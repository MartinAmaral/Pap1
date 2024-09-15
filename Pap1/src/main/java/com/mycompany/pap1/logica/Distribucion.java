package com.mycompany.pap1.logica;

import java.time.LocalDate;

public class Distribucion {

    private Donacion donacion;
    private Alimento alimento;
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
        this.fechaPreparacion = fecha;
    }

    public void setFechaEntrega(LocalDate fecha){
        this.fechaEntrega = fecha;
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

    void setEmailBeneficiario(String emailBeneficiario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setIdDonacion(int idDonacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
