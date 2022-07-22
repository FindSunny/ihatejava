package src.java;
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

    }

    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);
            
        // code to assign a new reference to circle
        circle = new Circle(0, 0);
    }
}
