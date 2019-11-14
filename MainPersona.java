/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import javax.swing.*;
/**
 *
 * @author alumno
 */
public class MainPersona {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Bienvenido");
        
        Persona usuario = new Persona();
        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre");
        String edad = JOptionPane.showInputDialog(null, "Ingrese edad");
        int ed = Integer.parseInt(edad);
        String sexo = JOptionPane.showInputDialog(null, "Ingrese sexo [M: Mujer, H: hombre]");
        String pesoS = JOptionPane.showInputDialog(null, "Ingrese peso");
        double peso = (double)Double.parseDouble(pesoS);
        String altura = JOptionPane.showInputDialog(null, "Ingrese altura");
        double alturaD = (double)Double.parseDouble(altura);
        
        
        usuario.setNombre(nombre);
        usuario.generarDNI();
        usuario.setEdad(ed);
        usuario.setSexo(sexo);
        usuario.setPeso(peso);
        usuario.setAltura(alturaD);
        
        System.out.println(usuario.toString());


    }
}
