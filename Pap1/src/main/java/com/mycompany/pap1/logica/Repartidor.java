package com.mycompany.pap1.logica;

import javax.persistence.Entity;

@Entity
public class Repartidor extends Usuario {
private int numeroLicencia;
    public Repartidor() {
      
    }

    public Repartidor(String nombre, String email, int numeroLicencia) {
        super(nombre,email); // No es necesario llamar a super() aquí, ya que la clase padre es abstracta
        
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia(){
        return numeroLicencia;
    }
    public void setNumeroLicencia(int numeroLicencia){
        this.numeroLicencia = numeroLicencia;
    }
}
