/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincontador;

/**
 *
 * @author sofia
 */
public class Contador {
        private int cont;
    
//Constructor con parámetros para inicializar el contador con un valor no negativo. 
//Si el valor inicial que se recibe es negativo el contador tomará el valor cero como valor inicial.
    
    public Contador(){}
    public Contador(int cont){
    if(cont > 0){
        this.cont = cont;
    }else{
        this.cont = 0;
    }
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
         if(cont < 0){ this. cont = 0;}
        else{ this.cont = cont;}
    }
    
  
  public void incrementar(){
    cont ++;
    }
    
    public void decrementar(){

    if(cont > 0){
       cont --;
    }else {
    cont = 0; 
    }
    }

}
