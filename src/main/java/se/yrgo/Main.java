package se.yrgo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order();


        while (true) {
            System.out.println("Vad vill du äta:");
            System.out.println(menu.showMenu());
            input = scanner.nextLine();
            order.addToOrder(input);
            System.out.println("Var det bra så?");
            System.out.println("J/N");
            input = scanner.nextLine();

            if (input.equals("J")) {
                break;
            }
        }
        System.out.println("Din nota blev: " + Calculator.calculateBill(order.getOrder()) + " kr");




    }
}