package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //0 + 1 = 1
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 2 + 3 = 5
        // 3 + 5 = 8
        // 5 + 8 = 13
        // 13 + 8 = 21
        // 21 + 13 = 34
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaçıncı basamağa kadar fibonacci yazdırmak istiyorsunuz?: ");
        int basamak = scanner.nextInt();
        int sayi1 = 0;
        int sayi2 = 1;
        for (int i=0; i<basamak; i++){
            int sonuc = sayi1 + sayi2;
            System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
            sayi1 = sayi2;
            sayi2 = sonuc;
        }
    }
}