import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

   // HERE IS STEP 3RD AND 4TH
class Student {
    String name;
    String usn;
    double SGPA;
    Subject[] subject = new Subject[8]; // CREATED ARRAY
    Scanner s;

    // CONSTRUCTOR 
    Student() {
        s = new Scanner(System.in);
        for (int i = 0; i < subject.length; i++) {
            subject[i] = new Subject(); 
        }
    }

    // TAKE STUDENT DETAILS                                                                                                                                                                
    void getStudentDetails() {
        System.out.print("Enter Student Name: ");
        name = s.nextLine();
        System.out.print("Enter Student USN: ");
        usn = s.nextLine();
    }

    // Step 7: Accept marks and credits, compute grade
    void getMarks() {
        for (int i = 0; i < subject.length; i++) {
            System.out.println("Enter details for Subject " + (i + 1));
            System.out.print("Marks (0–100): ");
            subject[i].subjectMarks = s.nextInt();

            System.out.print("Credits: ");
            subject[i].credits = s.nextInt();

            // Compute grade
            subject[i].grade = (subject[i].subjectMarks / 10) + 1;

            if (subject[i].grade > 10)
                subject[i].grade = 10;
            
            if (subject[i].subjectMarks < 4)
                subject[i].grade = 0; 
        }
    }

    
    void computeSGPA() {
        int effectiveScore = 0, totalCredits = 0;

        for (int i = 0; i < subject.length; i++) {
            effectiveScore += subject[i].grade * subject[i].credits;
            totalCredits += subject[i].credits;
        }

        if (totalCredits != 0)
            SGPA = (double) effectiveScore / totalCredits;
        else
            SGPA = 0.0;
    }

    void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("USN : " + usn);
        System.out.println("SGPA: "+SGPA);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.getStudentDetails();
        student.getMarks();
        student.computeSGPA();
        student.displayResult();
    }
}
