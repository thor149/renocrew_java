import java.sql.SQLOutput;
import java.util.Scanner;

public class practice_set_1 {
    public static void main(String[] args) {
        //Question 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.print("The Sum of three numbers is: ");
        System.out.println(num1+num2+num3);

        //Question 2
        System.out.println("Enter your marks: ");
        int marks1 = input.nextInt();
        int marks2 = input.nextInt();
        int marks3 = input.nextInt();
        System.out.print("CGPA: ");
        System.out.println((marks1+marks2+marks3)/30);

        //Question 3
        System.out.print("Enter your name: ");
        String nameInput = input.next();
        System.out.println();
        System.out.println("Hello "+ nameInput +", Have a good day!");

        //Question 4
        System.out.print("Enter Distance in KMs: ");
        int kms = input.nextInt();
        System.out.print(kms*0.621371);
        System.out.println(" Miles");

        //Question 5
        System.out.print("Enter a value: ");
        boolean checkInt = input.hasNextInt();
        System.out.println("Is the input value a Integer? "+(checkInt));
    }

}
