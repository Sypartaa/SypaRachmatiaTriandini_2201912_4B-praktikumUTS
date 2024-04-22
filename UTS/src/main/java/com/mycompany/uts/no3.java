/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

import java.util.Scanner;
public class no3 {

    //method reverse untuk mengembalikan bilangan bulat
    public static int reverse(int num) {
        int sum = 0;
        while (num != 0) {
            int a = num % 10;
            sum = sum * 10 + a;
            num = num /10;
        }
        return sum;
    }

    //method untuk mengecek palindrome
    public static boolean isPalindrome(int num) {
        int sum = reverse(num);
        return num == sum;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " adalah bilangan palindrom.");
        } else {
            System.out.println(num + " bukan bilangan palindrom.");
        }
    }
}