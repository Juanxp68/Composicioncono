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
public class Circulo {
    
    
    private float x, y;
    private float radio;
    
    /**
     * 
     * @param cX Parametro necesario para imprimir el valor de este
     * @param cY Parametro necesario para imprimir el valor de este
     * @param r Parametro necesario para imprimir el valor de este
     */
    
public Circulo (float cX, float cY, float r) { // constructor

    this.x = cX;
    this.y = cY;
    this.radio = r;
 }

/**
 * 
 * @return Devuelve un valor de tipo float
 */

 public float getX() { 
     return x; 
 }
 
 /**
  * 
  * @param x Parametro necesario para imprimir el valor de este
  */
 
 public void setX(float x) { 
     this.x = x; 
 }
 
 /**
  * 
  * @return Devuelve un valor de tipo float
  */
 public float getY() { 
     return y; 
 }
 
 /**
  * 
  * @param y Parametro necesario para imprimir el valor de este
  */
 public void setY(float y) { 
     this.y = y; 
 }
 
 /**
  * 
  * @return Devuelve un valor de tipo float
  */
 public float getRadio() { 
     return radio; 
 }
 
 /**
  * 
  * @param radio Parametro necesario para imprimir el valor de este
  */
 public void setRadio(float radio) { 
     this.radio = radio; 
 }
 
 /**
  * 
  * @return float Devuelve un valor de tipo float
  */
 
 public float area() { 
     return (float)Math.PI*radio*radio; 
 }
 

 public void imprimir () {
     
 
     System.out.print(" x=" + x);
     System.out.print(" y=" + y);
     System.out.print(" r=" + radio);
     System.out.print(" A=" + area());
 }
}



    

