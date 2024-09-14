package com.mycompany.pap1.logica;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;
import javax.persistence.OneToMany;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "beneficiarios")
public class Beneficiario extends Usuario {
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "fecha_nacimiento")
    private int fechaNacimiento;
    
    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private EstadoBeneficiario estado;
    @Column(name = "barrio")
    private Barrio barrio;
    @OneToMany(mappedBy = "beneficiario")
    private List<Distribucion> distribuciones;
    
    public Beneficiario() {
        super();
    }
        
    public String getDireccion(){
        return direccion;
    }
    public int getFechaNacimiento(){
        return fechaNacimiento;
    }
    public EstadoBeneficiario getEstado(){
        return estado;
    }
    public Barrio getBarrio(){
        return barrio;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setFechaNacimiento(int fecha){
        fechaNacimiento = fecha;
    }
    public void setEstado(EstadoBeneficiario estado){
        this.estado = estado;
    }
    public void setBarrio(Barrio barrio){
        this.barrio = barrio;
    }
}