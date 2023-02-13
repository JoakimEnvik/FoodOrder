package se.yrgo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order();


        while (true) {
            System.out.println("vad vill du äta:");
            menu.showMenu();
            input = scanner.nextLine();
            order.addToOrder(input);
            System.out.println("Va det bra så?");
            System.out.println("Y/N");
            input = scanner.nextLine();

            if (input.equals("Y")) {
                break;
            }
        }
        System.out.println("Din nota blev: " + Calculator.calculateBill(order.getOrder()) + " kr");




    }
}