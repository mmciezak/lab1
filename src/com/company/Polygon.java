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
}
