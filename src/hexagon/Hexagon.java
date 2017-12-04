package hexagon;

public class Hexagon {
    float X;
    float Y;
    float width;
    float height;
    Point A;
    Point B;
    Point C;
    Point D;
    Point F;
    Point E;
    float checkPointsAF;
    float checkPointsCD;
    float checkPointsBC;
    float checkPointsFE;
    float checkFirstAF;
    float checkFirstBC;
    float checkFirstCD;
    float checkFirstFE;
    float checkSecondAF;
    float checkSecondBC;
    float checkSecondCD;
    float checkSecondFE;
    float checkThirdAF;
    float checkThirdBC;
    float checkThirdCD;
    float checkThirdFE;
    float equationAF;
    float equationBC;
    float equationCD;
    float equationFE;


    public Hexagon(float X, float Y, float width, float height) {
        this.X = X;
        this.Y = Y;
        this.width = width;
        this.height = height;
        A = new Point((width * (25 / 108f)) + X, Y + 0);
        B = new Point((width * (83 / 108f)) + X, Y + 0);
        C = new Point(width + X, (height / 2) + Y);
        D = new Point((width * (83 / 108f)) + X, height + Y);
        E = new Point((width * (25 / 108f)) + X, height + Y);
        F = new Point(X + 0, (height / 2) + Y);

    }


    public boolean isPointHexagon(Point point) {
        Rectangle rect = new Rectangle(X, Y, width, height);
        if (!rect.isPointinRect(point.getX(), point.getY())){
            return false;
        }
        float checkFirstAF = (A.getY() - F.getY()) * point.getX();
        float checkFirstBC = (B.getY() - C.getY()) * point.getX();
        float checkFirstCD = (C.getY() - D.getY()) * point.getX();
        float checkFirstFE = (F.getY() - E.getY()) * point.getX();
        float checkSecondAF = (F.getX() - A.getX()) * point.getY();
        float checkSecondBC = (C.getX() - B.getX()) * point.getY();
        float checkSecondCD = (D.getX() - C.getX()) * point.getY();
        float checkSecondFE = (E.getX() - F.getX()) * point.getY();
        float checkThirdAF = (A.getX() * F.getY()) - (F.getX() * A.getY());
        float checkThirdBC = (B.getX() * C.getY()) - (C.getX() * B.getY());
        float checkThirdCD = (C.getX() * D.getY()) - (D.getX() * C.getY());
        float checkThirdFE = (F.getX() * E.getY()) - (E.getX() * F.getY());
        float equationAF = (checkFirstAF + checkSecondAF + checkThirdAF);
        float equationBC = (checkFirstAF + checkSecondAF + checkThirdAF);
        float equationCD = (checkFirstAF + checkSecondAF + checkThirdAF);
        float equationFE = (checkFirstAF + checkSecondAF + checkThirdAF);
        float checkPointsAF =  equationAF;
        float checkPointsBC = equationBC;
        float checkPointsCD = equationCD;
        float checkPointsFE = equationFE;
        if ( checkPointsAF > 0 || checkPointsBC < 0  ||  checkPointsCD < 0  || checkPointsFE > 0 ) {
            return false;
        }
        else {
            return true;
        }
    }
}