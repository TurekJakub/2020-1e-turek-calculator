/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import calculator.Perimeter;

/**
 *
 * @author jakub
 */
public class Surface {
    private final Perimeter perimeter = new Perimeter();
    public double squerContent(double a) {
        return rectangleSurface(a, a);
    }

    public double triangleSurface(double a, double va)
     {
        return (a * va) / 2;
    }

    public double roundSurface(double r) {
        return Math.pow(r, 2) * Math.PI;
    }

    public double rectangleSurface(double a, double b) {
        return a * b;

    }

    public double cubeSurface(double a) {
        return 6 * a * a;
    }

    public double blockSurface(double a, double b, double v) {
        return 2 * a * b + 2 * a * v + 2 * b * v;
    }

    public double cylinderSurface(double r, double v) {
        return perimeter.roundPerimeter(r) * v;
    }

    public double ballSurface(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

}
