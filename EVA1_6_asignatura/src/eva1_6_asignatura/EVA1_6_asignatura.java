/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_6_asignatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //captura
        Scanner sc=new Scanner (System.in);
        //definir
        String clave, nombre, carrera;
        int creditos, Hteoria, Hpractica;
        boolean TipMat;
        //
        System.out.println("introdusca su clave");
        clave= sc.nextLine();
        System.out.println("introdusca su nombre");
        nombre= sc.nextLine();
        System.out.println("introdusca su carrera");
        carrera= sc.nextLine();
        System.out.println("introdusca sus creditos");
        creditos= sc.nextInt();
        System.out.println("introdusca sus horas de teoria");
        Hteoria= sc.nextInt();
        System.out.println("introdusca sus horas de preactica");
        Hpractica= sc.nextInt();
        System.out.println("introdusca su tipo de materia [true -->generica] y [false --> especialidad]");
        TipMat= sc.nextBoolean();
        System.out.println("Tu clave es : "+ clave);
        System.out.println("Tu nombre es : "+ nombre);
        System.out.println("Tu carrera es : "+ carrera);
        System.out.println("Tus creditos son : "+ creditos);
        System.out.println("Tus horas teoricas son : "+ Hteoria);
        System.out.println("Tus horas practicas son : "+ Hpractica);
        System.out.println("Tu tipo de materia es : "+ TipMat);
        /*
        if (TipMat=true) {
            System.out.println("Tu tipo de materia es: generica");
        }
        else 
            System.out.println("Tu tipo de materia es: especialidad");
        */
    }
    
}
