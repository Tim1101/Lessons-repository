package hexagon;

import java.rmi.activation.ActivationGroup_Stub;

public class Rectangle {
    float X;
    float Y;
    float width;
    float height;



    public Rectangle(float X, float Y, float width, float height) {
        this.X = X;
        this.Y = Y;
        this.width = width;
        this.height = height;

    }

    public boolean isPointinRect(float x, float y) {
        boolean checkXY = x > width || y > height;
        boolean checkY = y > height;
        boolean checkX = x > width;

        if (checkXY || checkY || checkX) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean isPointinRect(Point point){

        return isPointinRect(point.getX(), point.getY());
    }
}