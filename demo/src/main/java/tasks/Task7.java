package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 extends AbstractTask {

    public Task7(Scanner scanner) {
        super(scanner);
    }
    
    @Override
    public void execute(){
        System.out.println("Task 7");
        System.out.print("Введите число массива: ");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            numbers.add(scanner.nextInt());
        }

        for(int i = 0; i < numbers.size(); i++){
            String nums = Integer.toString(numbers.get(i));
            String str1 = reverse(nums);
            if (str1.equals(nums)) {
                System.out.println(nums);
            }
        }

    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
