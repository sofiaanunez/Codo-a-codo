/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengua_extranjera;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Lengua_extranjera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//En un colegio existe la posibilidad de elegir, en la materia "lengua extranjera",
//entre las siguientes opciones: [I]nglés, [F]rancés, [P]ortugués y [A]lemán. Se ingresa,
//para cada alumno, la lengua elegida. La computadora muestra el porcentaje de
//Alumnos que eligió cada lengua, en forma de número y en forma gráfica (histograma),
//utilizando líneas hechas con asteriscos.

    String nombre_alumno = "";
    String lengua = "";
    //CONTADORES
    int contIngles = 0;
    int contFrances = 0;
    int contPortugues = 0;
    int contAleman = 0;
    //HISTORIGRAMA
    String histogramaIngles = "";
    String histogramaFrances = "";
    String histogramaPortugues = "";
    String histogramaAleman = "";
    int contTotal = 0;
    //PORCENTAJES ALUMNOS POR IDIOMAS//
    double porcIngles = 0;
    double porcFrances = 0;
    double porcPortugues = 0;
    double porcAleman = 0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre_alumno = teclado.next();
        
         while(!nombre_alumno.equals("XXX")){
            System.out.println("Ingrese idioma: \n I : Inglés \n F : Francés \n P : Portugués \n A : Alemán");
            lengua = teclado.next();
            
            switch(lengua){
             case "I": contIngles++;
             histogramaIngles += "*";
             break;
             case "F": contFrances++;
             histogramaFrances += "*";
             break;
             case "P": contPortugues++;
             histogramaPortugues += "*";
             break;
             case "A": contAleman++;
             histogramaAleman += "*";
             break;
             default: System.out.println("Error");
            }
                        
            
            System.out.println("Ingrese código que termina la carga -> 'XXX', caso contrario, ingrese otro nombre");
            nombre_alumno = teclado.nextLine();
            nombre_alumno = teclado.nextLine();
            
                     contTotal++;
        }

         System.out.println("Cantidad total: " + contTotal);
         porcIngles = contIngles * 100 / contTotal;
         System.out.println("Cantidad total de inscriptos en inglés: " + porcIngles + "%");
         porcFrances = contFrances * 100 / contTotal;
         System.out.println("Cantidad total de inscriptos en francés: " + porcFrances + "%");
         porcPortugues = contPortugues * 100 / contTotal;
         System.out.println("Cantidad total de inscriptos en portugués: " + porcPortugues + "%");
         porcAleman = contAleman * 100 / contTotal;
         System.out.println("Cantidad total de inscriptos en alemán: " + porcAleman+ "%");
         
    }
    
}
