package com.mycompany.pap1.logica;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author martin
 */

@Entity
@Table(name = "donaciones") // Nombre de la tabla que contendrá los datos de Donacion y sus subclases
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Usa una sola tabla para Donacion y sus subclases
@DiscriminatorColumn(name = "tipo_donacion") // Columna que diferenciará entre Alimento y Articulo
public abstract class Donacion {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática de ID
    private int id;

    private LocalDate fechaIngresada;

    @OneToMany(mappedBy = "donacion") // Relación One-to-Many con Distribucion
    private List<Distribucion> distribuciones;

    public Donacion() {
        super();
    }

    public Donacion(LocalDate fechaIngresada) {
        this.fechaIngresada = fechaIngresada;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaIngresada() {
        return fechaIngresada;
    }

    public List<Distribucion> getDistribuciones() {
        return distribuciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaIngresada(LocalDate fechaIngresada) {
        this.fechaIngresada = fechaIngresada;
    }

    public void setDistribuciones(List<Distribucion> distribuciones) {
        this.distribuciones = distribuciones;
    }
}
