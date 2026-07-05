/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeprogram;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Primeprogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number");
        final int n = input.nextInt();
        System.out.print("enter num to display per line ");
        final int perline = input.nextInt(); 
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                count++;
                System.out.print(number + " ");
                if (count % perline == 0) {
                    System.out.println();
                }
            }
            number++;
        }
        input.close();
    }
    public static boolean isPrime(int num) {
        if (num < 2) 
            return false;
        for (int i = 2; i <num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
