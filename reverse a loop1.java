import java.util.Scanner;
import java.util.InputMismatchException;
public class Main 
{  
public static void main(String[] args)   
{  
int number, reverse = 0; 
    Scanner scanner = new Scanner(System.in);
 try { System.out.print("Enter number to be reversed ");
    number=scanner.nextInt();
    while(number!=0)
    { int remainder = number % 10;  
     reverse = reverse * 10 + remainder;  
     number = number/10; }
    System.out.println("The reverse of the given number is: " + reverse); }
    catch (InputMismatchException e){
    System.out.println(e.getMessage());
}  
}}