package hexagon;

import java.util.Scanner;
import com.example.Task;
public class CheckPointInHexTask implements Task {


    public  void runTask() {

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the coordinate of point");


        float pointX = sc.nextFloat();
        float pointY = sc.nextFloat();

        Point pointForCheck =  new Point (pointX, pointY);

        Rectangle rect = new Rectangle(0, 0,108,50);
        Hexagon inHexagon = new Hexagon(0, 0, 108, 50 );

        boolean CheckResult = inHexagon.isPointHexagon(pointForCheck);

        System.out.println( CheckResult);
    }

}