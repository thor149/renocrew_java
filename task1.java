import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Percentage Calculator");
        System.out.println("Enter your marks in 5 subject below: ");
        byte marks1 = input.nextByte();
        byte marks2 = input.nextByte();
        byte marks3 = input.nextByte();
        byte marks4 = input.nextByte();
        byte marks5 = input.nextByte();
        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        float percent = ((float) totalMarks /500)*100;
        System.out.println("Parcentage of marks you obtained: "+percent+'%');
    }
}
