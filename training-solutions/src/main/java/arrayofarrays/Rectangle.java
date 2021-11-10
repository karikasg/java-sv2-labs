package arrayofarrays;

public class Rectangle {
    public int[][] rectangularMatrix(int size) {
        int[][] recMat = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                recMat[i][j] = i;
            }
        }
        return recMat;
    }

    public void printMatrix(int[][] recMat){
        for (int[] row : recMat){
            for (int cell : row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int[][] recMat = rectangle.rectangularMatrix(9);
        rectangle.printMatrix(recMat);
    }
}
