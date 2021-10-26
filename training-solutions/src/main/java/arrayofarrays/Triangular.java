package arrayofarrays;

public class Triangular {
    public int[][] triangularMatrix(int size){
        int[][] trMat = new int[size][];
        for (int i=0; i<size; i++){
            trMat[i] = new int[i+1];
            for (int j=0; j<=i; j++){
                trMat[i][j]=i;
            }
        }
        return trMat;
    }

    public void printMatrix(int[][] trMat){
        for (int[] row : trMat){
            for (int cell : row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        int[][] trMat = triangular.triangularMatrix(9);
        triangular.printMatrix(trMat);
    }
}
