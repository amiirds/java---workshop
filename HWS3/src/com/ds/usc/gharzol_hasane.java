package com.ds.usc;

import java.util.Scanner;

public class gharzol_hasane extends Account {
    Scanner input = new Scanner(System.in);
    int y;
    @Override
    public void interest() {
        System.out.println("no interest ");
    }

    @Override
    public void withdraw() {
        System.out.println("enter the amount of money that you want withdraw ");
        y = input.nextInt();
        System.out.println(" done ");
        System.out.println("your balance is " + (x - y) + " .");
    }

    @Override
    public void deposit() {
        System.out.println("enter the amount of money that you want deposit ");
        y = input.nextInt();
        System.out.println(" done ");
        System.out.println("your balance is " + (x + y) + " .");
    }

    @Override
    public void balance() {
        System.out.println("your balance is " + x);
    }
}
