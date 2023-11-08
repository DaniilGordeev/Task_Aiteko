package tasks;

import java.util.Scanner;

public class Task10 {
    
    static String rezult = "";

    public static void main(String[] args){
        Scanner str = new Scanner(System.in);

        System.out.print("Введите число:");
        int n = str.nextInt();
        bin(n);
        hex(n);
        five(n);
        str.close();
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
