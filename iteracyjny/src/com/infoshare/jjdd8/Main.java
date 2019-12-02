package com.infoshare.jjdd8;

import java.util.Scanner;

//iteracyjnie
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wyrazow ciagow mam policzyc?(max 47)");
        int repeat = scanner.nextInt();
        int previousNumber  = 0;
        int nextNumber = 1;

        System.out.print("Ciag fibonacciego skladajacy sie z "+repeat+" liczb:");

        for (int i = 1; i <= repeat; ++i)
        {
            System.out.print(previousNumber+" ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
