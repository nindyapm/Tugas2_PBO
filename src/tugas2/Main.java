/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
import java.util.Scanner;
import baloktabung.ruang.Balok;
import baloktabung.ruang.Tabung;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean pilihan = false;
        int ulang;
        do{
            int menu;
            double panjang, lebar, tinggiBalok, jari, tinggiTabung;
            System.out.println("\n\n=========MENU UTAMA========");
            System.out.println("1. HITUNG BALOK");
            System.out.println("2. HITUNG TABUNG");
            System.out.println("0. EXIT");
            System.out.print("PILIH : "); menu = input.nextInt();

            if(menu == 1){
                System.out.println("==========INPUT==========");
                System.out.print("Input Panjang   : "); panjang = input.nextInt();
                System.out.print("Input Lebar     : "); lebar = input.nextInt();
                System.out.print("Input Tinggi    : "); tinggiBalok = input.nextInt();

                Balok balok = new Balok(tinggiBalok,panjang,lebar); 
                
                System.out.println("\n==========OUTPUT==========");
                System.out.println("Luas Persegi Panjang        : " + balok.luas());
                System.out.println("Keliling Persegi Panjang    : " + balok.keliling());
                System.out.println("Volume Balok                : " + balok.volume());
                System.out.println("Luas Permukaan Balok        : " + balok.luasPermukaan()); 
            }
            else if (menu == 2){
                System.out.println("==========INPUT===========");
                System.out.print("Input Tinggi Tabung    : "); tinggiTabung = input.nextInt();
                System.out.print("Input Jari-jari Tabung : "); jari = input.nextInt();

                Tabung tabung = new Tabung(tinggiTabung,jari);

                System.out.println("\n=========OUTPUT=========");
                System.out.println("Luas Lingkaran         : " + tabung.luas());
                System.out.println("Keliling Lingkaran     : " + tabung.keliling());
                System.out.println("Volume Tabung          : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung  : " + tabung.luasPermukaan());
            }
            else if (menu == 0){
                System.exit(0);
            }
            else{
                System.out.println("Silahkan Input Ulang!");
                pilihan = true;
            }
            System.out.print("Ulangi?? (Ya: 1 || Tidak: 0) = "); ulang = input.nextInt();
                if(ulang == 1){
                    pilihan =  true;
                }
                else if (ulang == 0){
                   System.exit(0);
                }
       }while(pilihan = true);
    } 
}
