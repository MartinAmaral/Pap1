/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pap1.logica;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author horacio
 */
public class ManejadorUsuario {
    private static ManejadorUsuario instancia = null;
    public List<Usuario> usuarios = new ArrayList<>();
    
    private ManejadorUsuario(){}
    
    public static ManejadorUsuario getInstancia(){
            if (instancia == null)
                instancia = new ManejadorUsuario();
            return instancia;
    }

    Beneficiario buscarBeneficiarioPorEmail(String emailBeneficiario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
