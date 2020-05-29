/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacomposicioncono;

/**
 *
 * @author Nucks
 */
public class composicioncono {
    
    /**
  * 
  * @param datos Parametro necesario para imprimir el valor de este
  */   
    
private static void imprimir (Object datos) {

    System.out.println(datos);
 }
 
/**
 * 
 * @param args Parametro necesario para imprimir un valor de tipo String
 */

public static void main (String[] args) {

    java.util.Random aleatorio = new java.util.Random();
 
    for (int i=1; i<=5; i++) {
 
        int radio = aleatorio.nextInt(9)+1;
        Cono cono = new Cono(0, 0, radio, i, "Azul");
        cono.imprimir();
}
 }



    
    
    
}