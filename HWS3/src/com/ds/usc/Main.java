package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("                bank account        ");
        System.out.println("**************************************************");
        System.out.println("Enter the type of account which you want to creat ");
        System.out.println("1- gharzol_hasane ");
        System.out.println("2- long_time");
        System.out.println("3- short time");
        int choice = input.nextInt();
        gharzol_hasane gharzol_hasane = new gharzol_hasane();
        long_time long_time = new long_time();
        short_time short_time = new short_time();
        switch (choice) {
            case 1:
                System.out.println("1- withdraw");
                System.out.println("2- deposit");
                System.out.println("3- interest");
                System.out.println("4- balance");

                int choice1 = input.nextInt();
                switch (choice1) {
                    case 1:
                        gharzol_hasane.withdraw();
                        break;
                    case 2:
                        gharzol_hasane.deposit();
                        break;
                    case 3:
                        gharzol_hasane.interest();
                        break;
                    case 4:
                        gharzol_hasane.balance();
                        break;
                }

            case 2:
                System.out.println("1- withdraw");
                System.out.println("2- deposit");
                System.out.println("3- interest");
                System.out.println("4- balance");

                int choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        long_time.withdraw();
                        break;
                    case 2:
                        long_time.deposit();
                        break;
                    case 3:
                        long_time.interest();
                        break;
                    case 4:
                        long_time.balance();
                        break;
                }


            case 3:
                System.out.println("1- withdraw");
                System.out.println("2- deposit");
                System.out.println("3- interest");
                System.out.println("4- balance");
                int choice3 = input.nextInt();
                switch (choice3) {
                    case 1:
                        short_time.withdraw();
                        break;
                    case 2:
                        short_time.deposit();
                        break;
                    case 3:
                        short_time.interest();
                        break;
                    case 4:
                        short_time.balance();
                }
        }
    }
}
