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
public class Cono {
    
    private Circulo base;
    private float altura;
    private String color;
    
    /**
     * 
     * @param cX Parametro necesario para imprimir el valor de este
     * @param cY Parametro necesario para imprimir el valor de este
     * @param r Parametro necesario para imprimir el valor de este
     * @param h Parametro necesario para imprimir el valor de este
     * @param color Parametro necesario para imprimir el valor de este
     */
    
 public Cono (float cX, float cY, float r, float h, String color) { // constructor
 
     this.base = new Circulo(cX, cY, r);
     this.altura = h;
     this.color = color;
 }
 
/**
 * 
 * @return Devuelve un valor del parametro descrito
 */
 
 public Circulo getBase() {
 
     return base;
 }
 
/**
 * 
 * @param base Parametro necesario para imprimir el valor de este
 */
 
 public void setBase(Circulo base) {
 
     this.base = base;
 }
 
/**
 * 
 * @return Devuelve un valor de tipo float
 */
 
 public float getAltura() {
 
     return altura;
 }
 
/**
 * 
 * @param altura Parametro necesario para imprimir el valor de este
 */
 public void setAltura(float altura) {
 
     this.altura = altura;
 }
 
 /**
  * 
  * @return Devuelve un valor de tipo String
  */
 
 public String getColor() {
 
     return color;
 }
  /**
   * 
   * @param color Parametro necesario para imprimir el valor de este
   */
 
 public void setColor(String color) {
 
     this.color = color;
     
 }

 
 public void imprimir () {
 
     base.imprimir();
     System.out.println(" h=" + altura + " c=" + color);
 }
}



    

