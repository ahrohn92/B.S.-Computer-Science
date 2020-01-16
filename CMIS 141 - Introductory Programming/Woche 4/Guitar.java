/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Coles
 */
public class Guitar {

    private int numSides = 4;
    private double sideLength = 10.0;
    private double xCoord = 0.0;
    private double yCoord = 0.0;
    private double apothem = 5.0;
    private double perimeter = 20.0;

    public Polygon() {

    }

    public Polygon(int nSides, double sideL, double x, double y, double ap) {
        setNumSides(nSides);
        setSideLength(sideL);
        setxCoord(x);
        setyCoord(y);
        setApothem(ap);
        setPerimeter(nSides * sideL);
    }

    public double getArea() {
        return 0.5 * apothem * perimeter;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append("numSides = ").append(numSides).append(", ");
        sb.append("sideLength = ").append(sideLength).append(", ");
        sb.append("xcoord = ").append(xCoord).append(", ");
        sb.append("ycoord = ").append(yCoord).append(", ");
        sb.append("apothem = ").append(apothem).append(")");        
        return sb.toString();
    }
}
