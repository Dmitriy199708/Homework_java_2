package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance, paymentToBankAccount;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш баланс : ");
        balance = in.nextInt();
        System.out.print("Зачисление на счет : ");
        paymentToBankAccount = in.nextInt();

        int bonus = 0;
        int Final_balance = 0;
        if (paymentToBankAccount >= 1000) {
            bonus = paymentToBankAccount / 100;
            Final_balance = bonus + balance + paymentToBankAccount;
        } else if (paymentToBankAccount < 1000) {
            bonus = 0;
            Final_balance = balance + paymentToBankAccount;
        }
        System.out.println("Начисленные бонусы = " + bonus);
        System.out.println("Итоговый баланс = " + Final_balance);

    }
}
