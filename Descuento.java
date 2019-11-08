/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuento;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ingresarNumerosParaDescontar();
    }
    
    public static void ingresarNumerosParaDescontar(){
    double descuento = 0;
    double precio = 0;
    double resultado = 0;
    
       Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculando el descuento de un producto");
       
       System.out.print("\nIngrese precio del producto: ");
        precio = teclado.nextDouble();
        
       System.out.print("Ingrese descuento para ese producto: ");
        descuento = teclado.nextInt();
       
        if(precio > 0 && descuento > 0){           
        descuento = descuento / 100;
        double calculoDescuentoPorPrecio = descuento * precio;
        resultado = precio - calculoDescuentoPorPrecio;
                
                System.out.println("\nPRECIO: " + precio);
                System.out.println("DESCUENTO: " + "-" + calculoDescuentoPorPrecio);
                System.out.println("TOTAL:" + resultado);
        }
        else{
            System.out.println("\nERROR: Ingrese valores positivos.");
        }
    }
       
}
