package com.mycompany.pap1.logica;

import javax.persistence.Entity;

@Entity
public class Repartidor extends Usuario {
    private String numeroLicencia;

    public Repartidor() {
        super();
    }
    
    public String getNumeroLicencia(){
        return numeroLicencia;
    }
    public void setNumeroLicencia(String numeroLicencia){
        this.numeroLicencia = numeroLicencia;
    }
}