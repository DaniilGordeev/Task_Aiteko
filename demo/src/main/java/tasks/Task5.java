package tasks;

import java.util.Scanner;

public class Task5 extends AbstractTask {
    
    public Task5(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute(){
        System.out.println("Task 5");
        System.out.print("Введите n = ");
        int n = scanner.nextInt();
        float rezult = n;

        for(int i = 2; i <= 10000; i++){
            if (i % 2 == 0) {
                rezult -= n/i;
            } else {
                rezult += n/i;
            }
        }
        System.out.printf("Результат: %f\n", rezult);
    }

}
