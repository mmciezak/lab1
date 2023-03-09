package com.company;

public class Main {

    public static void main(String[] args){
        Segment seg = new Segment(new Point(0,0),new Point(0,10));
        Segment arr[] = Segment.perpendicular(seg,new Point(0,5));
        System.out.println(arr[0].getSVG());
    };

    //http://maxima.cesga.es/index.php?c=oow2ohp5eneisanvfgn24&n=2
    // y=ax+b
    // (y-y1)(x2-x1) - (x-x1)(y2-y1) = 0
    // a=(y1-y2)/(x1-x2)

    /*static public Segment[] perpendicular(Segment segment,Point point)
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
    }*/


}
