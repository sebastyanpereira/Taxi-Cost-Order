package ru.itpark;

public class TaximeterService {
    int costOrder(int distance) {
        int costLanding = 60;
        int costPerKilometer = 20;
        int discountPercent = 5;
        int minBorderForDiscount = 1_000;
        int maxDiscountCost = 100;
        int generalCost = costLanding + distance * costPerKilometer;
        if (generalCost > minBorderForDiscount){
            int discountCost = generalCost * discountPercent / 100;
            if(discountCost > maxDiscountCost){
                discountCost = maxDiscountCost;
            }
            generalCost = generalCost - discountCost;
        }
        return generalCost;
    }
}
