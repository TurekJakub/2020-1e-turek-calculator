/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author jakub
 */
public class Volume {

    public double blockVolume(double a, double b, double c) {
        return a * b * c;

    }

    public double cubeVolume(double a) {
        return Math.pow(a, 3);
    }

    public double globeVolume(double r) {
        return 4 / 3 * Math.PI * Math.pow(r, 3);
    }
    

   
    public double cylinderVolume(double v, double r)
    {
        return roundContent(r)*v;
    
    }
    public double pyramidVolume(double a, double b, double v)
    {
        return rectangleContent(a, b)*v*(1/3);
    
    }

    public double squerContent(double a) {
        return rectangleContent(a, a);
    }

    public double triangleContent(double a, double va)
     {
        return (a * va) / 2;
    }

    public double roundContent(double r) {
        return Math.pow(r, 2) * Math.PI;
    }
     public double rectangleContent(double a, double b) {
        return a * b;

    }
     public double roundGirt(double r)
     { return 2*r*Math.PI;}
    public double cubeSurface(double a)
    {return 6*a*a;}
    public double blockSurface(double a, double b, double v)
    {return 2*a*b+2*a*v+2*b*v;}
    public double cylinderSurface(double r, double v)
    { return roundGirt(r)*v;}
    public double ballSurface(double r)
    {return 4*Math.PI*Math.pow(r, 2);}
    

}
