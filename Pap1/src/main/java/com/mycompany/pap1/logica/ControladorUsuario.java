
package com.mycompany.pap1.logica;


import com.mycompany.pap1.datatypes.dtBeneficiario;
import com.mycompany.pap1.interfaces.IControladorUsuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControladorUsuario implements IControladorUsuario {

    private String altaUsuarioNombre;
    private String altaUsuarioEmail;
    private String altaUsuarioDireccion;
    private LocalDate altaUsuarioFecha;
    private EstadoBeneficiario altaUsuarioEstado;
    private Barrio altaUsuarioBarrio;
    private int altaUsuarioLicencia;
    
    private static ControladorUsuario instancia = null;
    
    public static ControladorUsuario getInstancia(){
            if (instancia == null)
                instancia = new ControladorUsuario();
            return instancia;
    }
    
  
    
    public void crearRepartidor(String nombre, String email, int numeroLicencia){
        Repartidor user = new Repartidor(nombre, email, numeroLicencia);
        ManejadorUsuario mD = ManejadorUsuario.getInstancia();
        mD.agregarRepartidor(user);
        System.out.println("Distribucion registrada con exito.");
    }
    
    
    @Override
    public boolean ExisteUsuario(String email) {
        var m = ManejadorUsuario.getInstancia();
        for (Usuario us : m.usuarios) {
            if (us.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void AgregarDatosAltaUsuario(String nombre, String email) {
        this.altaUsuarioNombre = nombre;
        this.altaUsuarioEmail = email;
    }

    @Override
    public void AgregarDatosAltaBeneficiario(String direccion, LocalDate fecha, EstadoBeneficiario estado,Barrio barrio) {
        this.altaUsuarioDireccion = direccion;
        this.altaUsuarioFecha = fecha;
        this.altaUsuarioEstado = estado;
        this.altaUsuarioBarrio = barrio;
    }

    @Override
    public void AgregarDatosAltaRepartidor(int licencia) {
        this.altaUsuarioLicencia = licencia;
    }

    @Override
    public void ConfirmarAltaBeneficiario() {
        var m = ManejadorUsuario.getInstancia();
        m.usuarios.add(new Beneficiario(altaUsuarioNombre,altaUsuarioEmail, altaUsuarioDireccion,
        altaUsuarioFecha, altaUsuarioEstado, altaUsuarioBarrio));
    }

    @Override
    public void ConfirmarAltaRepartidor() {
        var m = ManejadorUsuario.getInstancia();
        m.agregarRepartidor(new Repartidor(altaUsuarioNombre,altaUsuarioEmail,altaUsuarioLicencia));
    }
    
    
    @Override
    public void CancelartAlta() {
        altaUsuarioNombre ="";
        altaUsuarioEmail = "";
        altaUsuarioDireccion = "";
        altaUsuarioLicencia = 0;
    }

    @Override
    public List<dtBeneficiario> GetBeneficiarios() {
        var res = new ArrayList<dtBeneficiario>();
        var m = ManejadorUsuario.getInstancia();
        var usuarios = m.usuarios;
        
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Beneficiario) {
                Beneficiario b = (Beneficiario) usuario;
                res.add(new dtBeneficiario(b.getNombre(),b.getEmail(),b.getDireccion(),
                    b.getFechaNacimiento(),b.getEstado(),b.getBarrio()));
            } 
        }
        
        return res;
    }
    
    
}
