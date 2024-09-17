package com.mycompany.pap1.logica;

import java.time.LocalDate;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author martin
 */

@Entity
@DiscriminatorValue("ALIMENTO") // Valor para distinguir las instancias de tipo Alimento
public class Alimento extends Donacion {

    private String descripcionProductos;
    private int cantElementos;

    public Alimento(String descripcionProductos, int cantElementos, LocalDate fechaIngresada) {
        super(fechaIngresada); // Pasa la fecha a la clase padre
        this.descripcionProductos = descripcionProductos;
        this.cantElementos = cantElementos;
    }

    Alimento(String descripcionProductos, int cantElementos, int id, LocalDate fechaIngresada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDescripcionProductos() {
        return descripcionProductos;
    }

    public void setDescripcionProductos(String descripcionProductos) {
        this.descripcionProductos = descripcionProductos;
    }

    public int getCantElementos() {
        return cantElementos;
    }

    public void setCantElementos(int cantElementos) {
        this.cantElementos = cantElementos;
    }
}
