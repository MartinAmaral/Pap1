package com.mycompany.pap1.logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "beneficiarios")
public class Beneficiario extends Usuario {
    
    @JoinColumn(name = "direccion")
    private String direccion;
    
    @JoinColumn(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    
    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "estado_id")
    private EstadoBeneficiario estado;
    
    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "barrio_id")
    private Barrio barrio;
    
    @OneToMany(mappedBy = "beneficiario")
    private List<Distribucion> distribuciones;
    
    public Beneficiario(String nombre, String email, String direccion, LocalDate fechaNacimiento, EstadoBeneficiario estado, Barrio barrio) {
        
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.barrio = barrio;
        this.distribuciones = new ArrayList<>();
    }

        
    public String getDireccion(){
        return direccion;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public EstadoBeneficiario getEstado(){
        return estado;
    }
    public Barrio getBarrio(){
        return barrio;
    }
    
    public void setDirecion(String direccion){
        this.direccion = direccion;
    }
    public void setFechaNacimiento(LocalDate fecha){
        fechaNacimiento = fecha;
    }
    public void setEstado(EstadoBeneficiario estado){
        this.estado = estado;
    }
    public void setBarrio(Barrio barrio){
        this.barrio = barrio;
    }
      
}
