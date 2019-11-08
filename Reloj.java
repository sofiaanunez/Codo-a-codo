/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author sofia
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
               int horas = 0; int minutos = 0; int segundos = 0;
        
        while(true){
        if(horas < 10){
            System.out.print("0");
        }
            System.out.print(horas + ":");
        if(minutos < 10){
            System.out.print("0");
        }
            System.out.print(minutos + ":");
        if(segundos < 10){
            System.out.print("0");
        }
            System.out.println(segundos);
            segundos++;
            
            if(segundos == 60){
            segundos = 0;
            minutos++;
            if(minutos == 60){
            minutos = 0;
            horas++;
            if(horas == 24){
                horas = 0;
            }
            }
            }
            
            Thread.sleep(1000);
        } //cierre while
    }
    
    
}
