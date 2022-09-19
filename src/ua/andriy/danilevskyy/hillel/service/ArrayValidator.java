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

    static void validateArrayItem(String[][] arr, int itemParamOne, int itemParamTwo) {
        try{
            Integer.parseInt(arr[itemParamOne][itemParamTwo]);
        } catch (NumberFormatException e) {
            String message = e.getMessage() + ": Element with coordinates '" + itemParamOne + "','" + itemParamTwo
                    + "' has wrong format.";
            throw new ArrayDataException(message);
        }

    }
}