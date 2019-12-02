package com.infoshare.jjdd8;

import java.util.Scanner;

//rekurencyjnie
public class Main {

        public static int recursion(int n){
            if(n == 0){
                return 0;
            }
            if(n == 1 || n == 2){
                return 1;
            }
            return recursion(n-2) + recursion(n-1);
        }
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ile wyrazow ciagow mam policzyc?(max 47)");
            int repeat = scanner.nextInt();
            System.out.print("Ciag fibonacciego skladajacy sie z "+repeat+" liczb:");
            for(int i = 0; i < repeat; i++){
                System.out.print(recursion(i) +" ");
            }
        }
}
