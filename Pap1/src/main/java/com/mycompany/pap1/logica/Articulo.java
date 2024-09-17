package com.mycompany.pap1.logica;

import java.time.LocalDate;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author martin
 */

@Entity
@DiscriminatorValue("ARTICULO") // Valor para distinguir las instancias de tipo Articulo
public class Articulo extends Donacion {

    private String descripcion;
    private float peso;
    private String dimensiones;

    public Articulo(String descripcion, float peso, String dimensiones, LocalDate fechaIngresada) {
        super(fechaIngresada); // Pasa la fecha a la clase padre
        this.descripcion = descripcion;
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    Articulo(String descripcion, float peso, String dimensiones, int id, LocalDate fechaIngresada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
}
