package tasks;

import java.util.Scanner;

public abstract class AbstractTask implements TaskInterface {
    protected Scanner scanner;

    public AbstractTask(Scanner scanner) {
        this.scanner = scanner;
    }
}
