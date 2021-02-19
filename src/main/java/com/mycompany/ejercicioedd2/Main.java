/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd2;

import java.util.Scanner;

/**
 * We ask the user for a series of data per screen and then we show them
 * @author Víctor Blanco Rodrigo
 * @version 1.0
 */
public class Main {
    
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName;//Nombre del usuario
        String firstSurname;//Primer apellido del usuario
        String lastSurname;//Segundo apellido del usuario
        String fullName;
       
        System.out.println("Introduzca su nombre");
        Scanner reader = new Scanner(System.in);
        firstName = reader.nextLine();
        
        System.out.println("Introduzca su primer apellido");
        firstSurname = reader.nextLine();
        
        System.out.println("Introduzca su segundo apellido");
        lastSurname = reader.nextLine();
        
        fullName=(firstName+" "+firstSurname+" "+lastSurname);
        
        System.out.println(fullNam);
    }
    
}
