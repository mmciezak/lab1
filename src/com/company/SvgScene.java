package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SvgScene {
    private List<Polygon> l = new ArrayList<>();
    public void addPolygon(Polygon polygon)
    {
        l.add(polygon);
    }
    public void save(String path){

        try{
            FileWriter file = new FileWriter(path);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



    }
}
