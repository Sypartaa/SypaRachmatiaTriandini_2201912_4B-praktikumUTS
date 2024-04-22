/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts;

import java.util.Scanner;

public class no1 {

    public static boolean isPalindrome(int number) {

        int digit1 = number / 100;
        int digit3 = number % 10;

        // Memeriksa apakah bilangan palindrom
        return digit1 == digit3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan tiga digit integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }

        scanner.close();
    }
}