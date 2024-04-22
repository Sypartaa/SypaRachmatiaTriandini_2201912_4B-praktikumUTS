/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no4;



// Kelas Balok
public class Balok {
    // Atribut
    int panjang;
    int lebar;
    int tinggi;
    
    // Konstruktor
    public Balok() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }
    
    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    
    // Method untuk menghitung luas
    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    // Method untuk menghitung keliling
    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
    
    // Method untuk menghitung volume
    public int getVolume() {
        return panjang * lebar * tinggi;
    }
    
    // Method setter untuk panjang
    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }
    
    // Method setter untuk lebar
    public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }
    
    // Method setter untuk tinggi
    public void setTinggi(int tinggiBaru) {
        tinggi = tinggiBaru;
    }
}