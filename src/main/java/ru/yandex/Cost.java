package ru.yandex;

public class Cost {

    private static final String HIGH = "HIGH";
    private static final String MIDDLE = "MIDDLE";
    private static final String LOW = "LOW";
    private int cost;

    public double getCostOfDelivery(double distance, boolean isBigSize, boolean isFragility, String congestion) {
        if (distance <= 0) {
            return 0;
        }
        if (distance <= 2 && distance > 0) {
            cost += 50;
        }
        if (distance <= 10 && distance > 2) {
            cost += 100;
        }
        if (distance <= 30 && distance > 10) {
            cost += 200;
        }
        if (distance > 30) {
            if (isFragility) {
                return -1;
            }
            cost += 300;
        }

        if (isBigSize) {
            cost += 200;
        } else {
            cost += 100;
        }

        if (isFragility) {
            cost += 300;
        }

        double congestionValue;
        switch (congestion) {
            case HIGH:
                congestionValue = 1.6;
                break;
            case MIDDLE:
                congestionValue = 1.4;
                break;
            case LOW:
                congestionValue = 1.2;
                break;
            default:
                congestionValue = 1;
        }

        double result = cost * congestionValue;

        return result >= 400 ? result : 400;
    }
}
