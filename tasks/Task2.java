package tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        System.out.print("Введите число массива: ");
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            System.out.print("Введите числа массива: ");
            numbers.add(str.nextInt());
        }
        str.close();
        int i = (int) (Math.random() * n);
        int j = (int) (Math.random() * n);
        System.out.println("Счастливые числа: " + numbers.get(i) + "," + numbers.get(j) );
    }
    
}
