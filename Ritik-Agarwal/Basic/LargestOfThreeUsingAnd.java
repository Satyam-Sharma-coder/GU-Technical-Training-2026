import java.util.Scanner;
public class LargestOfThreeUsingAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = sc.nextInt();
        sc.close();
        if(num1>num2 && num1>num3){
            System.out.println("Largest number is: " + num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Largest number is: " + num2);
        }
        else{
            System.out.println("Largest number is: " + num3);
        }
    }
}