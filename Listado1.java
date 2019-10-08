/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listado1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Listado1 {
 
    //LISTADO ALUMNOS   
// Nos piden ingresar por tec el nombre y promedio de los alumnos de una comision
// La carga finaliza con nombre = "XXX"
// Se pide imprimir los nombre de todos los alumnos cuyo promedio sea mayor al promedio general

    //EJERCICIO PRACTICANDO ALMACENAMIENTO
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //CREO ARRAYS
      String[] nombres = new String[5];
      double[] prom    = new double[5];

       double promedioGeneral = 0;
       int contAlumnos = 0;
       double acuPromedios = 0;
       //acupromedios = acupromedios + promedio
       
       Scanner teclado = new Scanner(System.in);
       for(int i=0; i<5 ; i++){
        System.out.println("Ingrese nombre: ");
        nombres[i] = teclado.next();
        
        System.out.println("Ingrese promedio: ");
        prom[i] = teclado.nextDouble();
        contAlumnos++;
        acuPromedios = acuPromedios + prom[i];
       }
       
        promedioGeneral = acuPromedios / 5;
        
        for(int p=0; p<5; p++){
            if(prom[p] > promedioGeneral){
                System.out.println("Alumno cuyo promedio es mayor al promedio general: " + nombres[p]);
            }
        }
    }
    
}
