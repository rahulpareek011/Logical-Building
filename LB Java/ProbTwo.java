import java.util.Scanner;

public class ProbTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int count =0;

        while (n>0) {
            count++;
            n=n/10;
        }
        System.out.println("Total digits in n: "+ count);
    }
}