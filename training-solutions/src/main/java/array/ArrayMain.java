package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(daysOfWeek[1]);
        System.out.println(daysOfWeek.length);

        int[] involve2 = new int[5];
        involve2[0]=1;
        for (int i=1; i<involve2.length; i++){
            involve2[i]=involve2[i-1]*2;
        }
        for (int nr : involve2){
            System.out.print(nr+" ");
        }
        System.out.println();

        boolean[] trueFalse = new boolean[6];
        trueFalse[0]=false;
        for (int i=1; i<trueFalse.length; i++){
            trueFalse[i]=!trueFalse[i-1];
        }
        for (boolean tf : trueFalse){
            System.out.print(tf+" ");
        }
        System.out.println();
    }
}
