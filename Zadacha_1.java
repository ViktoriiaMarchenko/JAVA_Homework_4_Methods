package Domashnie;

import java.util.Scanner;

public class Zadacha_1 {
    public static void main(String[] args) {
        chislo();
    }

    static void chislo() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе счисления для конвертации: ");
        int toConvert = in.nextInt();

        String binary = Integer.toBinaryString(toConvert);
        System.out.println("Данное число в двоичной системе: " + binary);
    }
}
