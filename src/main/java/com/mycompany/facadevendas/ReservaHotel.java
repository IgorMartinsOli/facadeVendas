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
public class ReservaHotel {
    static ArrayList<Integer> quartos = new ArrayList();
    
    public void alugarQuarto(){
        System.out.println("Quarto alugado");
        quartos.add(1);
    }
    
    public void devolverQuarto(){
        System.out.println("Quarto devolvido");
        quartos.remove(0);
    }
}
