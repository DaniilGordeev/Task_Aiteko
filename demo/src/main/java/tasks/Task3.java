package tasks;

import java.util.Scanner;

public class Task3 extends AbstractTask {
    
    public Task3(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute(){
        System.out.println("Task 3");
        System.out.print("Введите цифру: ");
        int n = scanner.nextInt();
        if(n == 0){
            System.out.println("Нуль");
        }else if(n == 1){
            System.out.println("Один");
        }else if(n == 2){
            System.out.println("Два");
        }else if(n == 3){
            System.out.println("Три");
        }else if(n == 4){
            System.out.println("Четыре");
        }else if(n == 5){
            System.out.println("Пять");
        }else if(n == 6){
            System.out.println("Шесть");
        }else if(n == 7){
            System.out.println("Семь");
        }else if(n == 8){
            System.out.println("Восемь");
        }else if(n == 9){
            System.out.println("Девять");
        }else{
            System.out.println("Я не знаю такого");
        }
        
    }

}
