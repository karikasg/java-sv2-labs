package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections() {
        int result = 0;
        int degree = 0;
        int degreeIncrement = 0;
        do {
            degreeIncrement+=10;
            degree+=degreeIncrement;
            result++;
        } while (degree % 360 != 0);
        return result;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
