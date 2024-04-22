/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author ASUS
 */
public class no2D {
    public static void main(String[] args) {
        int rows = 6; // Jumlah baris
        for (int i = 1; i <= rows; i++) {
            // Menambahkan spasi di awal setiap baris
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            // Mencetak angka secara berurutan dari 1 hingga (rows - i + 1)
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}