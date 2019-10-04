package ru.itpark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaximeterService service = new TaximeterService();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите длину предполагаемого пути в километрах: ");
        int distance = keyboard.nextInt();
        int cost = service.costOrder(distance);
        System.out.println("Стоимость заказа: " + cost);
    }
}
