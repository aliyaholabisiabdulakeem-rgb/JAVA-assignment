import java.util.Scanner;
public class Task15{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter distance in miles: ");
    double distance = input.nextDouble();
    double kilometers = distance * 1.60934;
System.out.println("Distance in miles = " + distance);
System.out.println("Kilometers = " + kilometers);
}
}
