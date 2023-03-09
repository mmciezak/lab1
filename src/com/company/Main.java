package com.company;

public class Main {

    public static void main(String[] args){
        Segment seg = new Segment(new Point(0,0),new Point(0,10));
        Segment arr[] = Segment.perpendicular(seg,new Point(0,5));
        System.out.println(arr[0].getSVG());


        Polygon rectsnle=new Polygon(4,new Style("red","blue",2));
        Polygon triagle=new Polygon(3,new Style(null,null,null));
        Ellipse ellipse=new Ellipse(new Point(5,5),5,10,new Style("green","black",2));

        rectangle.setVertices();
    };



}
