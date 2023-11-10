package tasks;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskInterface[] taskArray = {new Task1(scanner), new Task2(scanner), new Task3(scanner), new Task5(scanner), new Task6(scanner), new Task7(scanner), new Task8(scanner), new Task10(scanner), new Task11(scanner)};
        List<TaskInterface> taskList = Arrays.asList(taskArray);

        for( TaskInterface t :  taskList) {
            t.execute();
        }

    }

}