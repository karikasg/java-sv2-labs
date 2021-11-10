package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size){
        int[][] multiplicationTable = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                multiplicationTable[i][j] = (i+1)*(j+1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        int min = (day.length < anotherDay.length) ? day.length : anotherDay.length;
        return Arrays.equals(Arrays.copyOf(day, min), Arrays.copyOf(anotherDay, min));
    }

    public boolean wonLottery(int[] lottoNumbers1, int[] lottoNumbers2){
        Arrays.sort(lottoNumbers1);
        Arrays.sort(lottoNumbers2);
        return Arrays.equals(lottoNumbers1, lottoNumbers2);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.multiplicationTableAsString(6));

        double[] day1 = new double[]{4.0, 4.9, 6.3, 12.0, 7.1};
        double[] day2 = new double[]{4.0, 4.9, 6.3, 12.0, 7.1, 6.8};
        System.out.println(arraysMain.sameTempValues(day1, day2));
        System.out.println(arraysMain.sameTempValuesDaylight(day1, day2));

        int[] lottoNumbers1 = new int[]{7, 27, 36, 72, 81};
        int[] lottoNumbers2 = new int[]{81, 27, 36, 7, 72};
        System.out.println(Arrays.toString(lottoNumbers1)+Arrays.toString(lottoNumbers2));
        System.out.println(arraysMain.wonLottery(lottoNumbers1.clone(), lottoNumbers2.clone()));
        System.out.println(Arrays.toString(lottoNumbers1)+Arrays.toString(lottoNumbers2));
    }
}
