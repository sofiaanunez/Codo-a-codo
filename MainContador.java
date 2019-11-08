/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincontador;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class MainContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contador cont = new Contador(5);

        Scanner cl = new Scanner(System.in);
        
            System.out.print("Inicialice el contador: ");
            int num = cl.nextInt();
            
            Contador cont2 = new Contador(num);
       
            cont.incrementar();
            cont.decrementar();
            cont.decrementar();
            cont.decrementar();
            cont2.incrementar();
            cont2.incrementar();
            
            
            System.out.println(cont.getCont());
            System.out.println(cont2.getCont());

        }

    }
    

