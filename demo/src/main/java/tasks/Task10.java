package tasks;


import java.util.Scanner;

public class Task10 extends AbstractTask {

    public Task10(Scanner scanner) {
        super(scanner);
    }
    
    static String rezult = "";

    @Override
    public void execute(){
        System.out.println("Task 10");
        System.out.print("Введите число:");
        int n = scanner.nextInt();
        bin(n);
        hex(n);
        five(n);
    }

    public static void bin(int n){
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
    }

    public static void hex(int n){
        String hex = Integer.toHexString(n);
        System.out.println(hex);
    }
    
    public static void five(int n){
        if (n >= 5){
            int s = n % 5;
            n = n / 5;
            rezult += s;
            five(n);
        }else{
            rezult += n;
            System.out.println(reverse(rezult));
        }
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
