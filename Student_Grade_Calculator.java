import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String args[]) {

        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Marks of Subject : ");
        for (i = 0; i < 6; i++) {
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }

        // Calculating average here
        avg = total / 6;

        System.out.println("Total marks is : " + total);
        System.out.println("Average percentage : " + avg + "%");
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
    }
}