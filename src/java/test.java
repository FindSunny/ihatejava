package src.java;

import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {

        var x = "hello";
        var y = 1001;
        
        System.out.println(x + y);

        Circle myCircle = new Circle(10, 20);

        moveCircle(myCircle, 23, 56);

        // print the circle's x and y coordinates
        System.out.println("x: " + myCircle.getX());
        System.out.println("y: " + myCircle.getY());
        
        int money = 10;
        System.out.format("%d%n", money);

        double money1 = 10.526d;
        System.out.println(new DecimalFormat("###.##").format(money1));
        System.out.println(Math.rint(money1));
    }

    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);
            
        // code to assign a new reference to circle
        circle = new Circle(0, 0);
    }

    public boolean equals() {

        return false;
    }
}
