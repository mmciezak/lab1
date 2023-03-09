package com.company;

import java.util.Locale;

public class Ellipse extends Shape {

    private Point center;
    private double r1,r2;

    Ellipse (Point center, double r1, double r2, Style style){
        super(style);
        this.center=center;
        this.r1=r1;
        this.r2=r2;
    }

    @Override
    String toSvg() {
        return String.format(Locale.ENGLISH,"<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ")
    }
}
