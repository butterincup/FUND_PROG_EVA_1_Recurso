/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entradadedatos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_5_EntradaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear nuevo escaner para la entrada de datos
        Scanner captura= new Scanner(System.in);
        int edad;
        String nombre;
        
        System.out.println("introduce tu nombre");
        nombre = captura.nextLine();
        
        
        System.out.println("intruduce tu edad");
        edad = captura.nextInt();
        
        System.out.println("tu nombre es: "+ nombre);
        System.out.println("tu edad es: "+ edad);
    }
    
}
