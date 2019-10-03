/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopochino;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class HoroscopoChino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ingresar por teclado, en 3 variables, la fecha de nacimiento. Indicar a qué signo del horóscopo chino pertenece.
     int anio = 0;
     int signo = 0;
     
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("Ingrese su año de nacimiento [XXXX] : ");
     
     anio = teclado.nextInt();
     signo = anio%12;
     
     switch(signo){
         case 0: System.out.println("Usted pertenece al signo MONO");
         break;
         case 1: System.out.println("Usted pertenece al signo GALLO");
         break;
         case 2: System.out.println("Usted pertenece al signo PERRO");
         break;
         case 3: System.out.println("Usted pertenece al signo CERDO");
         break;
         case 4: System.out.println("Usted pertenece al signo RATA");
         break;
         case 5: System.out.println("Usted pertenece al signo BUEY");
         break;
         case 6: System.out.println("Usted pertenece al signo TIGRE");
         break;
         case 7: System.out.println("Usted pertenece al signo CONEJO");
         break;
         case 8: System.out.println("Usted pertenece al signo DRAGON");
         break;
         case 9: System.out.println("Usted pertenece al signo SERPIENTE");
         break;
         case 10: System.out.println("Usted pertenece al signo CABALLO");
         break;
         case 11: System.out.println("Usted pertenece al signo CABRA");
         break;
     }
    }
    
}
