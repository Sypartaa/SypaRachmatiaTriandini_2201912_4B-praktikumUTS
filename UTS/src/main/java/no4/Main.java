/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Balok
        Balok balok1 = new Balok();
        Balok balok2 = new Balok();
        Balok balok3 = new Balok();
        
        balok1.setPanjang(1);
        balok1.setLebar(1);
        balok1.setTinggi(1);
        
        balok2.setPanjang(30);
        balok2.setLebar(40);
        balok2.setTinggi(50);
        
        balok3.setPanjang(25);
        balok3.setLebar(35);
        balok3.setTinggi(45);
        
        
        // Menampilkan hasil
        System.out.println("Balok dengan panjang : " + balok1.panjang + ", lebar : " + balok1.lebar + 
                " dan tinggi : " + balok1.tinggi + ". Luasnya : " + balok1.getLuas() +
                ", sedangkan kelilingnya : " + balok1.getKeliling() + 
                " dan volumenya : " + balok1.getVolume());
        System.out.println("Balok dengan panjang : " + balok2.panjang + ", lebar : " + balok2.lebar + 
                " dan tinggi : " + balok2.tinggi + ". Luasnya : " + balok2.getLuas() + 
                ", sedangkan kelilingnya : " + balok2.getKeliling() + 
                " dan volumenya : " + balok2.getVolume());
        System.out.println("Balok dengan panjang : " + balok3.panjang + ", lebar : " + balok3.lebar + 
                " dan tinggi : " + balok3.tinggi + ". Luasnya : " + balok3.getLuas() +
                ", sedangkan kelilingnya : " + balok3.getKeliling() + 
                " dan volumenya : " + balok3.getVolume());
    }
}
