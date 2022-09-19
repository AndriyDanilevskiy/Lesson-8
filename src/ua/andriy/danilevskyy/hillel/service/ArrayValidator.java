package ua.andriy.danilevskyy.hillel.service;

import ua.andriy.danilevskyy.hillel.exceptions.ArrayDataException;
import ua.andriy.danilevskyy.hillel.exceptions.ArraySizeException;

import static java.util.Objects.isNull;

public class ArrayValidator {
    static void validateArray(String[][] data) {
        if(isNull(data)){
            throw new IllegalStateException("The array is null.");
        }
        for (String[] datum : data) {
            if (data.length != 4 || datum.length != 4) {
                throw new ArraySizeException("Array has wrong size");
            }
        }
    }

    static void validateArrayItem(String[][] arr, int i, int j) {
        if(isNull(arr[i][j])){
            throw new IllegalStateException("Element with coordinates '" + i + "','" + j
                    + "' is null.");
        }

        try{
            Integer.parseInt(arr[i][j]);
        } catch (NumberFormatException e) {
            String message = e.getMessage() + ": Element with coordinates '" + i + "','" + j
                    + "' has wrong format.";
            throw new ArrayDataException(message);
        }

    }
}