package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Taks8 {
    
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        
        System.out.print("Введите длину массива: ");
        int t = str.nextInt(); 
        ArrayList<Float> numbers = new ArrayList<Float>();

        for(int i = 0; i < t; i++){
            System.out.print("a[" + i + "] = ");
            numbers.add(str.nextFloat());
        }

        for(int i = 1; i < numbers.size(); i++){
            double p = numbers.get(i-1) / numbers.get(i);
            int res = (int)p;
            double rezult = p - res;
            System.out.println(rezult);
        }

        str.close();
    }

}
