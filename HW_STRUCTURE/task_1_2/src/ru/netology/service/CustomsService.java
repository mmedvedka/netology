package ru.netology.service;

public class CustomsService {
    public static final double RATE_WEIGHT_DUTY = 125.0;

    public static int calculateCustoms(int price, int weight) {
        return (int) (price * 0.01 + weight * RATE_WEIGHT_DUTY);
    }
}
