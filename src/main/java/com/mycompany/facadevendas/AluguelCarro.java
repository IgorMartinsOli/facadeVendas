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
public class AluguelCarro {
    static ArrayList<Integer> carros = new ArrayList();
    
    public void alugarCarro(){
        System.out.println("Carro alugado");
        carros.add(1);
    }
    
    public void devolverCarro(){
        carros.remove(0);
    }
}
