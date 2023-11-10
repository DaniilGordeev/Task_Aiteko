package tasks;



import java.util.ArrayList;
import java.util.Scanner;

public class Task8 extends AbstractTask {

    public Task8(Scanner scanner) {
        super(scanner);
    }
    
    @Override
    public void execute(){
        System.out.println("Task 8");
        System.out.print("Введите длину массива: ");
        int t = scanner.nextInt(); 
        ArrayList<Float> numbers = new ArrayList<Float>();

        for(int i = 0; i < t; i++){
            System.out.print("a[" + i + "] = ");
            numbers.add(scanner.nextFloat());
        }

        for(int i = 1; i < numbers.size(); i++){
            double p = numbers.get(i-1) / numbers.get(i);
            int res = (int)p;
            double rezult = p - res;
            System.out.println(rezult);
        }

    }

}
