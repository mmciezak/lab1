package com.company;

import java.util.Locale;

public class Segment {
    private Point x,y;
    public Segment(Point x,Point y){
        this.x=x;
        this.y=y;
    }


    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public double length()
    {
        double l = (x.x-y.x)*(x.x-y.x)+(x.y-x.y)*(x.y-x.y);
        return Math.sqrt(l);
    }

    public String toSvg(Point y) {
        return String.format(Locale.ENGLISH,"<line x1=\"%f\" x2=\"%f\" x3=\"%f\" x4=\"%f\" stroke=\"black\" stroke-width=\"4\"/>",x.x,x.y,y.x,y.y);

    }

    static public Segment[] perpendicular(Segment segment,Point point)
    {
        double a=(segment.getY().y-segment.getX().y)/(segment.getX().x-segment.getY().x);
        double b=point.y - a*point.x;

        double x0,y0,x1,y1, sq,r,x2,y2;
        x0=point.x;
        y0=point.y;
        r=segment.length();

        sq = Math.sqrt((y0*y0)+(2*a*x0+2*b)*y0 - (a*a)*(x0*x0)-2*a*b*x0+(a*a+1)*r*r-b*b);
        x1 = (-(sq)-a*y0-x0+a*b)/a*a+1;
        y1 = -(a*sq+a*a*y0+a*x0+b)/(a*a+1);

        x2 = (sq+a*y0+x0-a*b)/(a*a+1);
        y2 = (a*sq+a*a*y0+a*x0+b)/(a*a+1);

        //return new Segment(point,new Point(x1,y1));
        return new Segment[]{new Segment(point,new Point(x1,y2)),new Segment(point, new Point(x2,y2))};

    }

    static public Segment[] perpendicular(Segment segment,Point point, double r)
    {
        double a=(segment.getY().y-segment.getX().y)/(segment.getX().x-segment.getY().x);
        double b=point.y - a*point.x;

        double x0,y0,x1,y1, sq,x2,y2;
        x0=point.x;
        y0=point.y;
        //r=segment.length();

        sq = Math.sqrt((y0*y0)+(2*a*x0+2*b)*y0 - (a*a)*(x0*x0)-2*a*b*x0+(a*a+1)*r*r-b*b);
        x1 = (-(sq)-a*y0-x0+a*b)/a*a+1;
        y1 = -(a*sq+a*a*y0+a*x0+b)/(a*a+1);

        x2 = (sq+a*y0+x0-a*b)/(a*a+1);
        y2 = (a*sq+a*a*y0+a*x0+b)/(a*a+1);

        //return new Segment(point,new Point(x1,y1));
        return new Segment[]{new Segment(point,new Point(x1,y2)),new Segment(point, new Point(x2,y2))};

    }


}
