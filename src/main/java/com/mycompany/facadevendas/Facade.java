/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadevendas;

import java.util.Scanner;

/**
 *
 * @author igor_
 */
public class Facade {
    public AluguelCarro carro = new AluguelCarro();
    public ReservaAereo aereo = new ReservaAereo();
    public ReservaHotel hotel = new ReservaHotel();
    Scanner scan = new Scanner(System.in);
    
    public void alugarCarros(){
        AluguelCarro.carros.add(0);
        AluguelCarro.carros.add(0);
        AluguelCarro.carros.add(0);
        AluguelCarro.carros.add(0);
        System.out.print("Deseja alugar ou devolver? ");
        int i = scan.nextInt();
        
        switch(i){
            case 1 -> {
                carro.alugarCarro();
            }
            case 2 -> {
                carro.devolverCarro();
            }}}
    
    public void alugarPoltronas(){
        ReservaAereo.poltronas.add(0);
        ReservaAereo.poltronas.add(0);
        ReservaAereo.poltronas.add(0);
        ReservaAereo.poltronas.add(0);
        System.out.print("Deseja alugar ou devolver? ");
        int i = scan.nextInt();
        
        switch(i){
            case 1 -> {
                aereo.comprarPoltrona();
            }
            case 2 -> {
                aereo.devolverPoltrona();
            }}}
            
    public void alugarQuarto(){
        ReservaHotel.quartos.add(1);
        ReservaHotel.quartos.add(1);
        ReservaHotel.quartos.add(1);
        ReservaHotel.quartos.add(1);
        System.out.print("Deseja alugar ou devolver? ");
        int i = scan.nextInt();
        
        switch(i){
            case 1 -> {
                hotel.alugarQuarto();
            }
            case 2 -> {
                hotel.devolverQuarto();
            }}}
    
}
