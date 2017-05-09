/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto_Geometrico;

/**
 *
 * @author ADMIN-MINEDUC
 */

public class Triangulos extends Objeto_Geometrico {
    public static double Area;
    public static double Perimetro;
    public static double lado1;
    public static double lado2;
    public static double lado3;
    
    public Triangulos () {
        
    }
    public Triangulos ( double l1,double l2, double l3){
        Triangulos.lado1 = l1;
        Triangulos.lado2 = l2;
        Triangulos.lado3 = l3;     
    }
    public double getlado1(){
        return lado1;
    }
    public double getlado2(){
        return lado2;
    }
    public double getlado3(){
        return lado3;
    }
    public void setlado1(double lado1){
        Triangulos.lado1 = lado1;
    }
    public void setlado2(double lado2){
        Triangulos.lado2 = lado2;
    } 
    public void setlado3(double lado3){
        Triangulos.lado3 = lado3;
    }
    public double getArea( ){
        return Area=Triangulos.lado1*Triangulos.lado2/2;
        
    }
    public double getPerimetro( ){
        return Perimetro = Triangulos.lado1+Triangulos.lado2+Triangulos.lado3;
    }
   
} 
