package org.vadim.azaza;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public void enterCoordinates(){
        setX(enterDoubleNumber("Enter x: "));
        setY(enterDoubleNumber("Enter y: "));
    }

    private double enterDoubleNumber(String str){
        Scanner sc;
        double n = 0;
        boolean cycle = true;
        do {
            System.out.println(str);
            sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                n = sc.nextDouble();
                cycle = false;
            }
            else
                System.out.println("Invalid data");
        }while(cycle);

        return n;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public boolean collinear(Point a, Point b){
        if(this.getY() == a.getY() && this.getX() == a.getX())
            return true;
        if(this.getY() == b.getY() && this.getX() == b.getX())
            return true;
        double ac = (this.getY() - a.getY()) / (this.getX() - a.getX());
        double bc = (this.getY() - b.getY()) / (this.getX() - b.getX());
        return ac == bc;
    }

}
