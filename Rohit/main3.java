import Extracurricular.*;
import  java.util.Scanner;


public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.printf("Enter the details for %d\n",(i+1));
        int roll_no;
        int no_of_matches;
        String name;
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter roll_no");
        roll_no = sc.nextInt();
        System.out.println("Enter Matches Played");
        no_of_matches = sc.nextInt();
        sports obj = new sports(name,roll_no,no_of_matches);
        System.out.println("Name : " + obj.name);
        System.out.println("Roll_no : " + obj.roll_no);
        System.out.println("Matches Played : " + obj.no_of_matches);            
        }
    }
}
