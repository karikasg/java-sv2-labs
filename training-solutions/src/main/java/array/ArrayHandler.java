package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source) {
        for (int i=0; i<source.length; i++) {
            source[i]+=i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strArray = new String[]{"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        arrayHandler.addIndexToNumber(intArray);
        arrayHandler.concatenateIndexToWord(strArray);

        for (int nr : intArray){
            System.out.println(nr);
        }

        System.out.print(intArray[0]);
        for (int i=1; i<intArray.length; i++) {
            System.out.print(", "+intArray[i]);
        }
        System.out.println();

        for (String str : strArray){
            System.out.println(str);
        }

        System.out.print(strArray[0]);
        for (int i=1; i<strArray.length; i++) {
            System.out.print(", "+strArray[i]);
        }
        System.out.println();

    }
}
