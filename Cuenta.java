/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Date;

public class Cuenta {
    private int id=0;
    private double saldo=0;
    double retiro=0;
    double deposito=0;
    private double interes_anual;
    private Date fecha_creacion;
    
    public Cuenta() {
    }
    
     public Cuenta(int i, double s, double rt, double dp){
        this.id = i;
        this.saldo = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public double getInteres_mensual() {
        double im=this.saldo*0.045;
        return im;
    }
    
    public double deposito(){
        //this.saldo=this.saldo+deposito;
        double dpo=this.saldo+deposito;
        return dpo;
    }
    public double retiro(){
        double rto=this.saldo-retiro+deposito;
        return rto;
    }
    public void Balance(){
        System.out.println("------BALANCE------");
        System.out.println("ID: "+this.getId());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Retiro: "+this.retiro());
        System.out.println("Deposito: "+deposito());
        System.out.println("Interes Mensual: "+this.getInteres_mensual());
        System.out.println("Fecha: "+this.fecha_creacion);
    }
    public static void main (String args[]){
        Cuenta ct=new Cuenta();
        ct.id=1122;
        ct.saldo=20.000;
        ct.retiro=2500;
        ct.deposito=3.000;
     
        ct.Balance();
        
    }

}





   
