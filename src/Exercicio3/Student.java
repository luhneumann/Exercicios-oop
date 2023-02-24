package Exercicio3;

public class Student {

    String name;
    double note1;
    double note2;
    double note3;

    public double FinalGrade() {
        return note1 + note2 + note3;
    }
    public String PassOrNot(){
        if (FinalGrade() > 60) {
            return "PASS";
        }else {
            double missing = 60 - FinalGrade();
            return "FAILED"
                    +System.lineSeparator()
                    + "MISSING "
                    + missing
                    + " POINTS";
        }
    }
    public String toString() {
        return "FINAL GRADE = "
                + String.format("%.2f", FinalGrade())
                + System.lineSeparator()
                + PassOrNot();
    }



}
