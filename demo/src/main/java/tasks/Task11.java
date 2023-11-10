package tasks;


import java.util.Scanner;

public class Task11 extends AbstractTask {

    public Task11(Scanner scanner) {
        super(scanner);
    }
    
    @Override
    public void execute(){
        System.out.println("Task 11");
        System.out.print("Введите число: ");
        String nums = scanner.next();
        int num = Integer.parseInt(nums, 8);
        
        String bin = Integer.toBinaryString(num);
        String hex = Integer.toHexString(num);

        System.out.print(bin + "\n" + hex);

    }

}
