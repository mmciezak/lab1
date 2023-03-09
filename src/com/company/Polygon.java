package com.company;

import java.util.Locale;

public class Polygon {
    private Point[] vertices;
    Polygon(int numOfVer)
    {
        vertices = new Point[numOfVer];
    }

    public void setVertex(int num,Point vertex){
        vertices[num]=vertex;
    }

    public void setVertices(Point[] vertices)
    {
        this.vertices = vertices;
    }

    //https://www.w3schools.com/graphics/svg_polygon.asp
    public String toSvg(){
        String s="";
        for(Point p:vertices)
        {
            s = s+p.x +","+p.y+" ";
        };
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style=\"fill:lime;stroke:purple;stroke-width:1\" />",s);

    }

    public static Polygon square(Segment segment, Style style)
    {
        Point p = new Point((segment.getX().x+segment.getY().x)/2,(segment.getX().y+segment.getY().y)/2);
        Segment segments[]=Segment.perpendicular(segment,p,segment.length()/2);
        Point a[]=new Point[4];
        a[0]=segment.getX();
        a[1]=segments[0].getY();
        a[2]=segment.getY();
        a[3]=segments[1].getY();

        Polygon p2=new Polygon(4,style);
        p2.setVerticles(a);
        return p2;

    }
}
