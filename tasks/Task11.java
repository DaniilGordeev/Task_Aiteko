package tasks;
import java.util.Scanner;

public class Task11 {
    
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);

        String nums = str.nextLine();
        int num = Integer.parseInt(nums, 8);
        
        String bin = Integer.toBinaryString(num);
        String hex = Integer.toHexString(num);

        System.out.print(bin + "\n" + hex);

        str.close();
    }

}
