package com.mycompany.pap1.logica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Repartidor extends Usuario {

    public Repartidor() {
    super();
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
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
