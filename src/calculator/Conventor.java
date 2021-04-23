/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jakub
 */
public class Conventor {

    public List<String> unitsSI = new ArrayList<>();
    private List<String> unitsImperial = new ArrayList<>();

    public Conventor() {
        Collections.addAll(unitsSI, "mm", "cm", "dm", "m", "km");
        Collections.addAll(unitsImperial, "in", "ft", "yd", "mi");
    }

    public String convertInSI(String from, String to, double value) {

        int exp = unitsSI.indexOf(from) - unitsSI.indexOf(to);
        if (value * Math.pow(10, exp) - (int) (value * Math.pow(10, exp)) == 0) {
            return String.valueOf((int) (value * Math.pow(10, exp))) ;
        } else {
            return String.valueOf(value * Math.pow(10, exp)) ;
        }
    }

    public String convertInImp(String from, String to, double value) {
        double[] chart = new double[]{2.54, 3.048, 0.9114, 1.609344};
        int index = unitsImperial.indexOf(from);
        int index1 = unitsImperial.indexOf(to);
        int exp = index - index1;
        double result = value * chart[index] * Math.pow(10, exp) / chart[index1];
        return String.valueOf(result);

    }

    public String convertFromSIToImp(String from, String to, double value) {
        if (unitsSI.contains(from)) {

            return convertInImp("in", to, Double.valueOf(convertInSI(from, "cm", value)) / 2.54);
        }
        else{

            return convertInSI("cm", to, Double.valueOf(convertInImp(from, "in", value)) * 2.54);
        }
    }

    public static void main(String[] args) {
        Conventor c = new Conventor();
        System.out.println(c.convertInSI("mm", "cm", 10));
        System.out.println(c.convertInImp("in", "ft", 6));
         System.out.println(c.convertFromSIToImp("in", "cm", 2));
    }
}
