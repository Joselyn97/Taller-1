/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

public class Empleado extends Persona{
    private double salario;
    private String fecha_entrada;
    
    public Empleado(double salario,String fecha_entrada){
        
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    public static void main(String[] args){
        Empleado emple=new Empleado(278.8,"09 de Febreo");
    }
}

