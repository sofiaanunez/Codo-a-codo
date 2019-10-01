/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socios;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Socios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_apellido = "";
        int edad = 0 ;
        int genero = 0;
        int deporte = 0;
        String categoria = "";
        //Nombre categoria//
        String dep = "";
        String gen = "";
       //cantidad de inscriptos//
       int contCadete = 0;
       int contHockey = 0;
       int contFem = 0;
       int contNat = 0; 
       int contMini = 0; 
       int contFutbol = 0;
       int contTenis = 0;
       int contVoley = 0;
       int contJuvenil = 0;
       int contActivo = 0;
       int contVitalicio = 0;
       int contFN = 0;
       int contFFM = 0;
       int contTotal = 0;
       double porcNat = 0;
        
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        nombre_apellido = teclado.next();

        
        while (!nombre_apellido.equals("XXX")){
            
            System.out.println("Ingrese su edad: ");
         edad = teclado.nextInt();
         
            System.out.println("Ingrese su genero: \n 1:Masculino \n 2:Femenino");
         genero = teclado.nextInt();
         if (genero == 1){
             gen = "Femenino";
         } else {
             gen = "Masculino"; }
         
            
            System.out.println("Ingrese deporte: \n 1:Tenis \n 2:Natación \n 3:Voley \n 4:Futbol \n 5:Hockey");
         deporte = teclado.nextInt();
         
         if(edad<5){ categoria = "Premini";} 
         else {
             if(edad<10) { categoria = "Mini"; contMini++;}
         else { 
             if(edad<15){ categoria = "Cadete"; contCadete++;} 
         else {
                 if(edad<18){ categoria = "Juvenil"; contJuvenil++;} 
             
         else {
                 if(edad<65){ categoria = "Activo"; contActivo++;}
            
         else {
                     if(edad>=65){ categoria = "Vitalicio"; contVitalicio++;} 
         }
         }
         }
         }
         }


        System.out.println("Ingrese nombre que finaliza la carga -> 'XXX'");
        nombre_apellido = teclado.nextLine();
        nombre_apellido = teclado.nextLine();
        
                    switch(deporte){
            case 1: dep = "Tenis";
            contTenis++;
            break;
            case 2: dep = "Natacion";
            contNat++;
            break;
            case 3: dep = "Voley";
            contVoley++;
            break;
            case 4: dep = "Futbol";
            contFutbol++;
            break;
            case 5: dep = "Hockey";
            contHockey++;
            break;
            default: System.out.println("Elija un numero de deporte válido");
        }            
            //IMPRESION DATOS USUARIO//
                System.out.println("Sus datos son: " + nombre_apellido + " " + edad + " " + categoria + " " + dep + " " + gen);
            //IMPRESION CANTIDAD CADETES//
                System.out.println("Cantidad de inscriptos en categoría cadete: " + contCadete); 
                System.out.println("Cantidad de inscriptos en hockey: " + contHockey); 
                if (dep.equals("Natación") && gen.equals("Femenino")){ contFN++;}
                
                //INCREMENTO VARIABLE CONTADOR TOTAL POR CATEGORIA Y DEPORTE POR SOCIOS REGISTRADOS//
                contTotal++;
                if (gen.equals("Femenino") && dep.equals("Futbol") && categoria.equals("Mini")){contFFM++;}
        } //CIERRE WHILE//
        
        //PORCENTAJE DE PERSONAS INCRIPTAS EN NATACION
        porcNat = contNat * 100 / contTotal;
    }
   
        
    }
    

