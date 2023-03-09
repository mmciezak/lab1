package com.company;
import java.util.Locale;

public class Style {
    final public String fillColor;
    final public String strokeColor;
    final public String strokeWidth;

    Style(String fillColor, String strokeColor, double strokeWidth)
    {
        if(fillColor == null)
        {
            this.fillColor = "transparent";
        }
        else
        {
            this.fillColor = fillColor;
        }

        if(strokeColor == null)
        {
            this.strokeColor = "black";
        }
        else
        {
            this.strokeColor = strokeColor;
        }

        if(strokeWidth == null)
        {
            this.strokeWidth = 1;
        }
        else
        {
            this.strokeWidth = strokeWidth;
        }
    }
}
