/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_tipos_datos;

/**
 *
 * @author Usuario
 */
public class EVA1_3_Tipos_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte pruebaByte;//1 byte = 8 bits -> 256
        //pruebaByte = 256; //256 no cabe en la variable
        pruebaByte = 127;
        pruebaByte = -127;
        
        short pruebasShort; //2 bytes = 16 bits -> 65536
        //pruebasShort = -32769; no cabe
        pruebasShort = -32768;
        pruebasShort = 32767;
        System.out.println(pruebasShort);//imprime la variable
        pruebasShort++;// ++ --> operador, suma uno al contenido de la variable
        System.out.println(pruebasShort);
    }
    
}
