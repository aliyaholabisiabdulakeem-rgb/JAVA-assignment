import java.util.Scanner;
public class Task16{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
    int firstnumber = input.nextInt();
System.out.print("Enter second integer: ");
    int secondnumber = input.nextInt();

System.out.println("Before swap");
System.out.println("First number = " + firstnumber);
System.out.println("Second number = " + secondnumber);

System.out.println("After swap");
System.out.println("First number = " + secondnumber);
System.out.println("Second number = " + firstnumber);
}
}
