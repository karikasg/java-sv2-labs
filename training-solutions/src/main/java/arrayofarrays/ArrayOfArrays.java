package arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays(int[][] a){
        for (int[] row : a){
            for (int cell : row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] arr = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        arrayOfArrays.printArrayOfArrays(arr);
    }
}
