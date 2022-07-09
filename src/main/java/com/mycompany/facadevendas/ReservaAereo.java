/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadevendas;

import java.util.ArrayList;

/**
 *
 * @author igor_
 */
public class ReservaAereo {
    static ArrayList<Integer> poltronas = new ArrayList();
    
    public void comprarPoltrona(){
        System.out.println("Reserva efetuada");
        poltronas.add(1);
    }
    
    public void devolverPoltrona(){
        System.out.println("Reserva cancelada");
        poltronas.remove(0);
        
    }
    
}
