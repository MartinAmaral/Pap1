package com.mycompany.pap1.logica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "repartidores")
public class Repartidor extends Usuario {

    @Column(nullable = false)
    private int numeroLicencia;

    public Repartidor(String nombre, String email, int numeroLicencia) {
        super(); // No es necesario llamar a super() aquí, ya que la clase padre es abstracta
        this.nombre = nombre;
        this.email = email;
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia(){
        return numeroLicencia;
    }
    public void setNumeroLicencia(int numeroLicencia){
        this.numeroLicencia = numeroLicencia;
    }
}
