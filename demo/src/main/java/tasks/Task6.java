package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 extends AbstractTask {
    
    public Task6(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute(){        
        System.out.println("Task 6");
        System.out.print("Введите число массива: ");
        int n = scanner.nextInt();
        n += 2;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);

        for(int i = 2; i < n; i++){
            System.out.printf("a[%d] = ", i);
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);

        for(int i = 2; i < numbers.size(); i++){
            if (numbers.get(i-1) + numbers.get(i-2) == numbers.get(i)) {
                System.out.println(numbers.get(i));
            }
        }
    }

}
