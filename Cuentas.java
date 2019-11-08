/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author sofia
 */
public class Cuentas {
   private String nombre;
    private String nroCuenta;
    private double saldo;
    
    public Cuentas(){} //constructor por defecto

    public Cuentas(String nombre, String nroCuenta, double saldo){
        this.nombre    = nombre;
        this.nroCuenta = nroCuenta;
        this.saldo     = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
       public boolean depositar(double n){
        boolean depositoOK = true;
        if(n < 0){
        depositoOK = false;
        }else{
        saldo = saldo + n;
        }
        System.out.println("Saldo actual: " + saldo);
        return depositoOK;
       
    }
   
    public boolean extraer(double x){
        boolean extraerOK = true;
        if(x<0 && x<=saldo){
        saldo = saldo - x;
                System.out.println("Saldo actual: " + saldo);
        }else{
            System.out.println("ERROR: No se pudo extraer dinero del saldo");
        extraerOK = false;
        }
        return extraerOK;
    }
    
    public String toString(){ //como quiero que salgan impresas las cosas
    return "Los datos del cliente son:\n Nombre: " + nombre + "\nNumero de cuenta: " + nroCuenta
            + "\nSaldo: " + saldo;
    }
    
    public boolean transferir(Cuentas c, double t){
        boolean transferOK = true;
        //se tiene que descontar de un saldo e incrementarlo en el otro, diferenciarlos por el objeto
       if(t>0 && t<=saldo){
           c.depositar(t);
           extraer(t); //extrae lo mismo que depositó (?)
       }
       else { 
           transferOK = false;
           System.out.println("\nERROR: No se pudo realizar la transferencia"); 
       }
        System.out.print("\nSe realizó una transferencia de: " + t);
       return transferOK;
    }
    
    
}
