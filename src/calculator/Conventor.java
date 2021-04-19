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

    public String convertInSI(String from, String to, double value, List<String> units) {

        int exp = units.indexOf(from) - units.indexOf(to);
        if (value * Math.pow(10, exp) - (int)(value * Math.pow(10, exp)) == 0) {
            return String.valueOf((int)(value * Math.pow(10, exp))) + to;
        } else {
            return String.valueOf(value * Math.pow(10, exp)) + to;
        }
    }

    public static void main(String[] args) {
        Conventor c = new Conventor();
        System.out.println(c.convertInSI("m", "cm", 1, c.unitsSI));
    }
}
