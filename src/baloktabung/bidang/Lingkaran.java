/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baloktabung.bidang;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements MenghitungBidang {

    private double jarijari;

    public Lingkaran(double jari) {
        this.jarijari = jari;
    }
    
    public double getJari() {
        return jarijari;
    }

    public void setJari(double jari) {
        this.jarijari = jari;
    }
    
    @Override
    public double luas() {      
        return 3.14*jarijari*jarijari;    
    }
    
    @Override
    public double keliling() {
        return 3.14*2*jarijari;          
    } 
    
} 
