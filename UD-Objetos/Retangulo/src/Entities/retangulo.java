package Entities;

public class retangulo {
    public double height;
    public double width;

    public double Area(){
        return (height*width);
    }
    public double Perimeter(){
        return ((2*height)+(2*width));
    }
    public double Diagonal(){
        return Math.sqrt((Math.pow(width, 2.00))+(Math.pow(height, 2.00)));
    }
    public String toString(){
        return "AREA = "
        + String.format("%.2f",Area())
        + "\nPERIMETER = "
        + String.format("%.2f",Perimeter())
        + "\nDIAGONAL = "
        + String.format("%.2f",Diagonal());

    }
}
