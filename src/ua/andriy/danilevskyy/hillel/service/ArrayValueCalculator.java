package ua.andriy.danilevskyy.hillel.service;

import ua.andriy.danilevskyy.hillel.exceptions.ArrayDataException;
import ua.andriy.danilevskyy.hillel.exceptions.ArraySizeException;

import static ua.andriy.danilevskyy.hillel.service.ArrayValidator.validateArray;
import static ua.andriy.danilevskyy.hillel.service.ArrayValidator.validateArrayItem;

public class ArrayValueCalculator {
    public int doCalc(String[][] data) throws ArraySizeException, ArrayDataException {
        validateArray(data);

        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                validateArrayItem(data, i, j);
                sum += Integer.parseInt(data[i][j]);
            }
        }
        return sum;
    }
}
