package org.vadim.azaza;

public class Triangle {
    Point a;
    Point b;
    Point c;

    Triangle(){
        do {
            a = new Point();
            System.out.println("Enter point A coordinates:");
            a.enterCoordinates();
            b = new Point();
            System.out.println("Enter point B coordinates:");
            b.enterCoordinates();
            c = new Point();
            System.out.println("Enter point C coordinates:");
            c.enterCoordinates();
            if (c.collinear(a, b)) {
                System.out.println("A, B and C is collinear!");
            }
        }while(c.collinear(a, b));
    }

    void print(){
        System.out.println("A(" + a.getX() + ", " + a.getY() + ")");
        System.out.println("B(" + b.getX() + ", " + b.getY() + ")");
        System.out.println("C(" + c.getX() + ", " + c.getY() + ")");
        System.out.println("Perimeter : " + perimeter());
        System.out.println("Area : " + area());
    }

    double area(){
        double s;
        s = Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2;
        return s;
    }

    double perimeter(){
        double p, ab, bc, ac;
        ab = Math.sqrt(Math.pow((a.getX() - b.getX()),2) + Math.pow((a.getY() - b.getY()),2));
        bc = Math.sqrt(Math.pow((b.getX() - c.getX()),2) + Math.pow((b.getY() - c.getY()),2));
        ac = Math.sqrt(Math.pow((a.getX() - c.getX()),2) + Math.pow((a.getY() - c.getY()),2));
        p = ab + bc + ac;
        return p;
    }


}
