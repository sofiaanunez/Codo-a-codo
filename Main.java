/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author alumno
 */
public class Main {
        public static void main(String[] args) {
        // TODO code application logic here
        Libro principito = new Libro("principito", "fjkds", 5, 0);
        
            System.out.println(principito.prestamo());
            
        Libro hp = new Libro("harry potter", "rowling", 0, 1);
            
            System.out.println(hp.prestamo());
            
            hp.decremente();
            
            System.out.println(principito.toString());
            
            System.out.println(hp.toString());
        
    }
}
