package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        while (true) {
            System.out.println("Играем: 1- ножницы 2- камень 3- бумага 0-выход");
            int player = input.nextInt();

            int computer = ran.nextInt(3) + 1;

            if (player >= 4) {
                System.out.println("неверно, жулик! введите число от 1 до 3");
                continue;
            }
            if (player == 0) {
                System.out.println("finish game");
                return;
            }
            if (player == computer) {
                System.out.println("Ничья");
                continue;
            }
            switch (computer) {
                case 1 -> System.out.println(" Компьютер : ножницы");
                case 2 -> System.out.println(" Компьютер в этом раунде: камень");
                case 3 -> System.out.println(" Компьютер в этом раунде: бумага");
            }
            switch (player) {
                case 1 -> {
                    if (computer == 2) {
                        System.out.println("Комп win");
                    }
                    if (computer == 3) {
                        System.out.println("Комп lose");
                        break;
                    }
                }
                case 2 -> {
                    if (computer == 1) {
                        System.out.println("Комп lose");
                    }
                    if (computer == 3) {
                        System.out.println("Комп win");
                        break;
                    }
                }
                case 3 -> {
                    if (computer == 1) {
                        System.out.println("Комп win");
                    }
                    if (computer == 2) {
                        System.out.println("Комп lose");
                        break;
                    }
                }
            }
        }
    }
}

