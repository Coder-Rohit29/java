package CIE;

import java.util.Scanner;

public class internals extends student {
    protected int marks[] = new int[5];

    public void inputCIEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Marks of the Subject");
        for (int std : marks) {
            std = s.nextInt();
        }
    }
}
