/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;

/**
 *
 * @author ESTUDIANTE
 */

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */




    public static void main(String[] args) {
        
       
        
        Scanner flujoEnt = new Scanner (System.in);
        String nombre= null;
        int numhoras=0;
        double valhora=0;
        double valorpagar=0;
        // TODO code application logic here
        System.out.println("Nombre");
        nombre=flujoEnt.next();
        
        System.out.println("Horas trabajadas");
        numhoras=flujoEnt.nextInt();
        
        System.out.println("Valor Hora");
        valhora=flujoEnt.nextDouble();
        
        System.out.println("Valor Pagar");
        valorpagar=flujoEnt.nextDouble();
        
       valorpagar=calcular_salario(numhoras, valhora);
       System.out.println("Nombre"+nombre+ "pago"+ valorpagar);
        
    }
        /**
     * 
     * @param numhoras
     * @param valhora
     * @return 
     */
 public static double calcular_salario (int numhoras, double valhora);{
    if (numhoras %40)
}
}


