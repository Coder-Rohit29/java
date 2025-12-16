package Extracurricular;
import Academics.student;

public class sports extends student{
    public int no_of_matches;
    public sports(String name,int roll_no,int no_of_matches){
        super(name,roll_no);
        this.no_of_matches= no_of_matches;
    }
}
