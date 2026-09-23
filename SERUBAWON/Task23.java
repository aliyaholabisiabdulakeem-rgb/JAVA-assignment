import java.util.Scanner;
public class Task23{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter an integer between 0 to 100; ");
    int score = input.nextInt();

    if(score >= 90 && score <= 100){
System.out.println("A");
}
    else if(score >= 80 && score <= 89){
System.out.println("B");
}
    else if(score >= 70 && score <= 79){
System.out.println("C");
}
    else if(score >= 60 && score <= 69){
System.out.println("D");
}
    else{
System.out.println("F");
}
}
}

