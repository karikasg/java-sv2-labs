package numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
// Tökéletes számnak nevezzük azokat a természetes számokat, amelyek megegyeznek az önmaguknál kisebb osztóik összegével.
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
//                System.out.print(i + ", ");
            }
        }
        return (number == sum);
    }
}
