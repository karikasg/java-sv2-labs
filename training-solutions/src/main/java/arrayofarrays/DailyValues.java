package arrayofarrays;

public class DailyValues {
    public int[][] getValues(){
        int[][] calendar = new int[12][];
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i=0; i<12; i++){
            calendar[i] = new int[daysOfMonth[i]];
        }
        return calendar;
    }

    public void printCalendar(int[][] calendar){
        for (int[] month : calendar ){
            for (int days : month){
                System.out.print(days+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        int[][] calendar = dailyValues.getValues();
        dailyValues.printCalendar(calendar);
    }
}
