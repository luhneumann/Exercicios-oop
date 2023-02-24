package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Student student = new Student();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("Note 1: ");
        student.note1 = sc.nextDouble();
        System.out.println("Note 2: ");
        student.note2 = sc.nextDouble();
        System.out.println("Note 3: ");
        student.note3 = sc.nextDouble();

        student.FinalGrade();
        student.PassOrNot();

        System.out.println(student);

        sc.close();
    }
}
