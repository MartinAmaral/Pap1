package com.mycompany.pap1.logica;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import com.mycompany.pap1.persistencia.DistribucionID;

@Entity
@Table(name = "distribuciones")
@IdClass(DistribucionID.class)
public class Distribucion implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "beneficiario_email") // Asegúrate de que el nombre coincide con el definido en DistribucionID
    private Beneficiario beneficiario;

    @Id
    @ManyToOne
    @JoinColumn(name = "donacion_id") // Asegúrate de que el nombre coincide con el definido en DistribucionID
    private Donacion donacion;

    private int fechaPreparacion;
    private int fechaEntrega;

    @Enumerated(EnumType.STRING)
    private EstadoDistribucion estado;

    public Distribucion() {
        super();
    }

    public Distribucion(Beneficiario beneficiario, Donacion donacion, int fechaPreparacion, int fechaEntrega, EstadoDistribucion estado) {
        this.beneficiario = beneficiario;
        this.donacion = donacion;
        this.fechaPreparacion = fechaPreparacion;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    // Getters y Setters
    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Donacion getDonacion() {
        return donacion;
    }

    public void setDonacion(Donacion donacion) {
        this.donacion = donacion;
    }

    public int getFechaPreparacion() {
        return fechaPreparacion;
    }

    public void setFechaPreparacion(int fechaPreparacion) {
        this.fechaPreparacion = fechaPreparacion;
    }

    public int getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(int fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EstadoDistribucion getEstado() {
        return estado;
    }

    public void setEstado(EstadoDistribucion estado) {
        this.estado = estado;
    }
}
