import java.util.Scanner;

public class practice_set_2 {
    public static void main(String[] args) {
        //Question1
        float g = 7/4 * 9/2;
        System.out.println(g);

        //Question 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = input.next().charAt(0);
        System.out.println();
        System.out.println("Your encrypted grade: "+(char)(grade+8));

        //Question 3
        int givenNumber = 10;
        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();
        System.out.println("Is your Input greater than the default number? "+(userNumber>givenNumber));

        //Question 4
        System.out.println("Enter the value of v, u, a and s below: ");
        int v = input.nextInt();
        int u = input.nextInt();
        int a = input.nextInt();
        int s = input.nextInt();

        int valueOfExpression = (v-u)*(v-u)/(2*a*s);
        System.out.println("The value of your expression: "+valueOfExpression);

        //Question 5
        int x = 7;
        int ans = 7*49/7 + 35/7;
        System.out.println(ans);
    }
}
