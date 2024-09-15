/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pap1.fabricas;

import com.mycompany.pap1.interfaces.IControladorUsuario;
import com.mycompany.pap1.logica.ControladorDistribucion;
import com.mycompany.pap1.interfaces.IControladorDistribucion;
/**
 *
 * @author gonza
 */
public class FabricaCDistribucion {
    public static IControladorDistribucion getControlador(){
        return ControladorDistribucion.getInstancia();
    }
}

