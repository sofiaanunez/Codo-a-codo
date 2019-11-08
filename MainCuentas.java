/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class MainCuentas {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner cl = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nom = cl.next();
        
        System.out.print("Nro de cuenta: ");
        String num = cl.next();
        
        System.out.print("Saldo: ");
        double sal = cl.nextDouble();
        
        Cuentas cliente1 = new Cuentas(nom,num,sal);
        Cuentas cliente2 = new Cuentas("Daniel", "48395", 1000);
        Cuentas cliente3 = new Cuentas("Fabricio", "0002", 14000);
        
        cliente2.depositar(10000);
        cliente3.extraer(1500);
        
        System.out.println(cliente1.toString());
        System.out.println(cliente1.getNombre());
        
        System.out.println(cliente3.transferir(cliente2, 10));
    }

    }

