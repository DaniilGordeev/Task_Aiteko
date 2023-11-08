package tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = str.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число массива: ");
            numbers.add(str.nextInt());
        }

        for (int i = 0; i < numbers.size(); i++){
            if (isPrime(numbers.get(i))) System.out.println(numbers.get(i) + " - простое число");
        }
        str.close();
    }
 
    private static boolean isPrime(int n) {
        int temp;
        if (n == 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) return false;
        }
        return true;
    }
}
