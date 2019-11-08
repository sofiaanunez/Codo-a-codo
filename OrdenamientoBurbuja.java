/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoburbuja;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class OrdenamientoBurbuja {

 public static void main(String[] args) {
        // TODO code application logic here
        int array[] = new int[5];
        int aux     = 0;
        Scanner teclado = new Scanner(System.in);
                     
         for(int i=0; i<5; i++){
        System.out.print("Ingrese numero:");
         array[i] = teclado.nextInt();
         }
         for(int i=0; i<4; i++){
             for(int j=i+1; j<5; j++){ //COMPARO POSICIONES
                if(array[i] > array[j]){
                    aux = array[i]; //ASIGNO
               array[i] = array[j]; //PISO VALOLORES
               array[j] = aux; //PISO
                }
         }
         }
         System.out.println("Lista ordenada: ");
         for(int i=0; i<5; i++){
             System.out.println(array[i]);
         }
         }
    
}
