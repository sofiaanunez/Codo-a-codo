/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author alumno
 */
public class Persona {
  private String nombre; private int edad; private int dni;
    private String sexo; private double peso; private double altura;

    public Persona(){}
    
    public Persona(String nombre, int edad, String sexo){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;   
    dni = 0;
    peso = 0;
    altura = 0;
    }
    
    public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = "H";   
    dni = 0;
    peso = 0;
    altura = 0;
    }
    
    public Persona(String nombre, int edad, int dni, String sexo, double peso, double altura){
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

        /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

        /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String calcularIMC(){
    double pesoActual = getPeso() / (Math.pow(getAltura(), 2));
    if(pesoActual < 20){
        return "peso bajo";
    } else {
    if(pesoActual < 25){
        return "peso ideal";
    } else {
            return "sobrepeso";
            }
    } 
    }
    
    public String esMayorDeEdad(){
    String legalidad = "";
    if(edad > 18){legalidad = "mayor de edad";}
    else { legalidad = "menor de edad";}
    return legalidad;
    }
    
    public void comprobarSexo(){
    if(sexo != "M" && sexo != "H"){
    this.sexo = "H";
    }
    }
    
    public void generarDNI(){
        int dniGenerado = 0;
        dniGenerado = (int)(Math.random()*10000000); //CON EL 10000000 LE DIGO LA CANTIDAD DE DIGITOS
        this.setDni(dniGenerado);
    }
    
    public String toString(){
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + getDni() + "\nSexo: " + sexo + "\nPeso: " + getPeso()
            + "\nSu peso es " + calcularIMC() + "\nUsted es " + esMayorDeEdad();
    }






    
}
