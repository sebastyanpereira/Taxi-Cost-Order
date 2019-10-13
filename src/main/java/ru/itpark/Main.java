package ru.itpark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaximeterService service = new TaximeterService();
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        System.out.println("Please enter lenght your route in kilometers: ");
        int distance = keyboard.nextInt();
        int cost = service.costOrder(distance);
        System.out.println("Your cost order: " + cost);
    }
}
