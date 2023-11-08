package tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {
    
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        
        System.out.print("Введите число массива: ");
        int n = str.nextInt();
        n += 2;
        ArrayList<Integer> numbers = new ArrayList<Integer>(n);
        numbers.set(0, 1);
        numbers.set(1, 1);

        for(int i = 2; i < n; i++){
            System.out.printf("a[%d] = ", i);
            numbers.add(str.nextInt());
        }
        Collections.sort(numbers);
        str.close();

        for(int i = 2; i < numbers.size(); i++){
            if (numbers.get(i-1) + numbers.get(i-2) == numbers.get(i)) {
                System.out.println(numbers.get(i));
            }
        }
    }

}
