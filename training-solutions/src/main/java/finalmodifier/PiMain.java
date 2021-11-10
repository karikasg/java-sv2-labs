package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class PiMain {
    public static void main(String[] args) {
        double r = 4.5;
        double h = 4;

        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.calculateArea(r));
        System.out.println(circleCalculator.calculatePerimeter(r));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(r, h));
        System.out.println(cylinderCalculator.calculateSurfaceArea(r, h));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(r, h));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(r, h));

        System.out.println(PI);
    }
}
