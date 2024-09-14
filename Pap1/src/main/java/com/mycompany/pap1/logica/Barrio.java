/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pap1.logica;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author martin
 */
public enum Barrio {
    @Enumerated(EnumType.STRING)
    CIUDAD_VIEJA,
    @Enumerated(EnumType.STRING)
    CORDON,
    @Enumerated(EnumType.STRING)
    PARQUE_RODO,
    @Enumerated(EnumType.STRING)
    CENTRO,
    @Enumerated(EnumType.STRING)
    PALERMO
}
