package SEE;

import CIE.internals;
import java.util.Scanner;


public class Externals extends internals{
    protected int marks[];
    protected int finalMarks[];
    public Externals(){
        marks = new int[5];
        finalMarks = new int[5];
    }

    public void inputSEEmarks(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 see marks\n");

        for(int i=0;i<5;i++){
            System.out.println("SEE mark sin Subject "+ (i+1)+ ":");
            marks[i] = s.nextInt();
        }
    }
    public void calculateFinalMarks(){
        for(int i=0;i<5;i++){
            finalMarks[i] = super.marks[i] + marks[i];
        }
    }
    public void displayFinalMarks(){
        System.out.println("----Final Marks ----");
        this.displayFinalMarks();
        for(int var1 =0;var1 <5;++var1){
            System.out.println("Final Marks in Subject " + (var1 +1) + this.finalMarks[var1]);
        }
    }
}
