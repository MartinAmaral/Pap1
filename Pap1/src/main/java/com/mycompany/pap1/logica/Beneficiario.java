package com.mycompany.pap1.logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "beneficiarios") // Opcionalmente puedes asignar un nombre específico a la tabla
public class Beneficiario extends Usuario {

    private String direccion;

    private LocalDate fechaNacimiento;

    @Enumerated(EnumType.STRING) // Esto mapea el enum como String
    private EstadoBeneficiario estado;

    @Enumerated(EnumType.STRING)
    private Barrio barrio;

    @OneToMany(mappedBy = "beneficiario") // Relación One-to-Many con Distribucion
    private List<Distribucion> distribuciones;

    
    
    public Beneficiario(String nombre, String email, String direccion, LocalDate fechaNacimiento, EstadoBeneficiario estado, Barrio barrio) {
    
        super(nombre,email);
        
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.barrio = barrio;
        this.distribuciones = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public EstadoBeneficiario getEstado() {
        return estado;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(LocalDate fecha) {
        fechaNacimiento = fecha;
    }

    public void setEstado(EstadoBeneficiario estado) {
        this.estado = estado;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
}
