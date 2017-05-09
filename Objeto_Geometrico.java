/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto_Geometrico;

public class Objeto_Geometrico{

    public static void main(String args[]){
        Triangulos t1 = new Triangulos(1,1.5,1);
        t1.getArea();
        System.out.println("El Area es = "+t1.getArea());
        t1.getPerimetro();
        System.out.println("El Perimetro es = "+t1.getPerimetro());
    }
}

