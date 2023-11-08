package tasks;
import java.util.Scanner;

public class Task5 {
    
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = str.nextInt();
        float rezult = n;

        for(int i = 2; i <= 10000; i++){
            if (i % 2 == 0) {
                rezult -= n/i;
            } else {
                rezult += n/i;
            }
        }
        System.out.printf("Результат: %f", rezult);
        str.close();
    }

}
