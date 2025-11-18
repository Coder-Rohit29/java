import SEE.Externals;

public class main {
    public static void main(String[] args) {
        Externals obj = new Externals();
        obj.inputStudentDetails();
        obj.inputCIEmarks();
        obj.inputSEEmarks();
        obj.calculateFinalMarks();
        obj.displayFinalMarks();
    }
}
