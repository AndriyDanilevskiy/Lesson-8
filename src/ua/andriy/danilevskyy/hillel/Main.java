package ua.andriy.danilevskyy.hillel;

import ua.andriy.danilevskyy.hillel.service.ArrayValueCalculator;

public class Main {
    public static void main(String[] args) {
        String[][] data = {
                {"1", "3", "5", "22"},
                {"8", "38", "99", "229"},
                {"25", "46", "53", "77"},
                {"101", "57", "33", "66"}
        };
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        int sum = 0;
        try {
            sum = calculator.doCalc(data);
        } catch (IllegalArgumentException e) {
            System.out.println("Ooops.. " + e.getMessage());
        }

        System.out.println("Sum: " + sum);
    }
}
