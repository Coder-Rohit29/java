
import java.util.Scanner;


class WrongAgeException extends Exception{
    public WrongAgeException(String message){
        super(message);
    }
}

class Father {
    int Fatherage;
    Father(int Fatherage) throws WrongAgeException{
        this.Fatherage = Fatherage;
        if(Fatherage < 0){
            throw new WrongAgeException("Age cannot be Negative");
        }
        System.out.printf("%d is Father age\n",Fatherage);
    }

}

class Son extends  Father{
    int Sonage;

    Son(int Sonage,int Fatherage) throws WrongAgeException{
        super(Fatherage);
        this.Sonage = Sonage;

        if(Fatherage < Sonage){
            throw new WrongAgeException("Father age Cannot be less than Sonage");
        }
        else if(Sonage < 0){
            throw new WrongAgeException("Age cannot be Negative");
        }
        System.out.printf("%d is Son age\n",Sonage);        

    }
}

public  class AgeValidator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fage =0;
        int sage = 0;
        try {
        System.out.println("Enter Father age\n");
        fage = sc.nextInt();
        Father fobj = new Father(fage);
        System.out.println("Enter Son age\n");
        sage = sc.nextInt();
        Son sobj = new Son(sage,fage);            
        } catch (WrongAgeException e) {

            System.err.println("Validation Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {

            System.err.println("Input Error: Please enter a valid integer for the age.");
        } finally {
            sc.close();
        }

    }
}
