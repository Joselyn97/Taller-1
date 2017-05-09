/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class Rectangulo {
    
    public static double ancho;
    public static double altura;
    
    public Rectangulo(){
        Rectangulo.ancho = 1;
        Rectangulo.altura = 1;
    }
    
    public Rectangulo(double ac,double at){
        Rectangulo.ancho = ac;
        Rectangulo.altura = at;
    }    
    
    public static double getArea(double ac,double at){
        return ac*at;
    }
    
    public static double getPerimetro(double ac,double at) {
        return (2*ac)*(2*at);
    }
    
    public static void main(String args[]){
        
        Rectangulo r1;
        r1 = new Rectangulo(4,40);
        
        System.out.println("Rectangulo 1");
        System.out.println("Su ancho es: "+ancho);
        System.out.println("Su altura es: "+altura);
        System.out.println("Area: "+getArea(ancho,altura));
        System.out.println("Perimetro: "+getPerimetro(ancho,altura));
        
        Rectangulo r2;
        r2 = new Rectangulo(3.5,35.9);
        
        System.out.println("Rectangulo 2");
        System.out.println("Su ancho es: "+ancho);
        System.out.println("Su altura es: "+altura);
        System.out.println("Area: "+getArea(ancho,altura));
        System.out.println("Perimetro: "+getPerimetro(ancho,altura));
       
    }
}


 
