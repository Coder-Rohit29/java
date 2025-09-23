import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;
        double d ,r1 ,r2;

        System.out.println("Enter the value of A");
        a = scanner.nextDouble();

        while(a==0){
            System.out.println("Enter a non-zero no , not a quadratic eq");
            a=scanner.nextDouble();
        }
        
        System.out.println("Enter the value of B");
        b= scanner.nextDouble();

        System.out.println("Enter the value of C");
        c= scanner.nextDouble();

        d=b*b-4*a*c;

        if(d>0){
            r1 = (-b + Math.sqrt(d))/(2*a);
            r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Both the roots are real and different.");
            System.out.println("Root1 = "+ r1);
            System.out.println("Root2 = "+ r2);
        }
        else if(d==0){
            r1 =r2 = -b/(2*a);
            System.out.println("Both the roots are real and equal.");
            System.out.println("Root1 = "+ r1);
            System.out.println("Root2 = "+ r2);
        }
        else{
            double realPart = -b/(2*a);
            double imaginoryPart = Math.sqrt(-d)/(2*a);
            System.out.println("Both the Roots are imginory");
            System.out.println("Root1 = "+ realPart + " + " + imaginoryPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imaginoryPart + "i");


        }
        scanner.close();
    }
}