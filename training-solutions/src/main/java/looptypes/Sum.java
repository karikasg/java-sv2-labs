package looptypes;

public class Sum {
    public void printSums(int[] numbers){
        for (int i=0; i<numbers.length-1; i++){
            System.out.print(numbers[i]+numbers[i+1] + " ");
        }
    }

    public static void main(String[] args) {
        Sum sums = new Sum();
        int[] numbers = {2, 4, 6, 9, 13, 18};
        sums.printSums(numbers);
    }
}
