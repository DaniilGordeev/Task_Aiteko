package tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);

        System.out.print("Введите число массива: ");
        int n = str.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            numbers.add(str.nextInt());
        }

        for(int i = 0; i < numbers.size(); i++){
            String nums = Integer.toString(numbers.get(i));
            String str1 = reverse(nums);
            if (str1.equals(nums)) {
                System.out.println(nums);
            }
        }

        str.close();
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
