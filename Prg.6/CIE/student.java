package CIE;

import java.util.Scanner;

public class student {
    protected String usn = new String();
    protected String name = new String();
    protected int sem;

    public void inputStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the USN");
        usn = sc.nextLine();
        System.out.println("Enter the Name");
        name = sc.nextLine();
        System.out.println("Enter the Sem");
        sem = sc.nextInt();
    }

    public void displayStudentDetails() {
        System.out.println("USN : " + usn);
        System.out.println("Name : " + name);
        System.out.println("SEM : " + sem);
    }
}
