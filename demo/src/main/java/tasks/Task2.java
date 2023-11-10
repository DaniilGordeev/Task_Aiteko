package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 extends AbstractTask{
    
    public Task2(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        System.out.println("Task 2");
        System.out.print("Введите число массива: ");
        int a = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < a; i++){
            System.out.print("Введите числа массива: ");
            numbers.add(scanner.nextInt());
        }
        int i = (int) (Math.random() * a);
        int j = (int) (Math.random() * a);
        System.out.println("Счастливые числа: " + numbers.get(i) + "," + numbers.get(j) );
    }
    
}
