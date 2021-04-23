/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author jakub
 */
public class Calculator {

    //  private StringBuffer buffer = new StringBuffer();
    private double sum(String number, String number1) {
        return Double.valueOf(number) + Double.valueOf(number1);
    }

    private double difference(String number, String number1) {
        return Double.valueOf(number) - Double.valueOf(number1);
    }

    private double product(String number, String number1) {
        return Double.valueOf(number) * Double.valueOf(number1);
    }

    private double quotient(String number, String number1) {
        return Double.valueOf(number) / Double.valueOf(number1);
    }

    public String calculate(String input){
        String validatInp = validateInput();
        List<String> inputList = new LinkedList<>(Arrays.asList(input.split(" ")));
        double result;
        
        while (indexOfNextOperation(inputList) >= 0) {
            int index = indexOfNextOperation(inputList);

            switch (inputList.get(index)) {
                case "x":
                    result = product(inputList.get(index - 1), inputList.get(index + 1));
                    updateList(inputList, index, String.valueOf(result));
                    break;
                case "÷":
                    result = quotient(inputList.get(index - 1), inputList.get(index + 1));
                    updateList(inputList, index, String.valueOf(result));
                    break;
                case "+":
                    result = sum(inputList.get(index - 1), inputList.get(index + 1));
                    updateList(inputList, index, String.valueOf(result));
                    break;
                case "-":
                    result = difference(inputList.get(index - 1), inputList.get(index + 1));
                    updateList(inputList, index, String.valueOf(result));
                    break;

            }
        }
        if (Double.valueOf(inputList.get(0)) == Math.floor(Double.valueOf(inputList.get(0)))) {

            return new DecimalFormat("#").format(Double.valueOf(inputList.get(0)));
        } else {
            return inputList.get(0);
        }

    }

    private int lessIndex(int number, int number1) {
        if (number1 == -1 ^ number == -1) {
            return Math.max(number1, number);
        } else {
            return Math.min(number1, number);
        }

    }

    private void updateList(List<String> list, int index, String replaceWith) {

        list.set(index, replaceWith);
        list.remove(index + 1);
        list.remove(index - 1);

    }

    public int indexOfNextOperation(List<String> list) {

        if (list.contains("÷") || list.contains("x")) {
            return lessIndex(list.indexOf("÷"), list.indexOf("x"));
        } else if (list.contains("+") || list.contains("-")) {
            return lessIndex(list.indexOf("+"), list.indexOf("-"));
        }

        return -1;
    }

    private String validateInput(String input) {
        List<Character> list = new LinkedList<Character>(Arrays.asList(input.toCharArray()));
        List<Character> operations = new ArrayList<Character>();
        operations.add('+');
        operations.add('-');
        operations.add('x');
        operations.add('÷');

        for (int i = 0; i <= list.size(); i++) {
            if (operations.contains(list.get(i))) {
                list.add(i - 1, ' ');
                list.add(i + 1, ' ');
            }
            StringBuilder builder = new StringBuilder();
            for (Character ch : list) {
                builder.append(ch);
            }
            return builder.toString();
        }

    }

    public String backspace(String string) {
        if (string.length() != 0) {
            return string.substring(0, string.length() - 1);
        } else {
            return string;
        }

    }

    
}
