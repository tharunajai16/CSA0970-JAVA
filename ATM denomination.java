import java.util.*;
public class Main 
{
public static void main (String[] args) 
{
 Scanner sc= new Scanner(System.in);    
System.out.print(" Enter the 1st Denomination: ");  
int a= sc.nextInt(); 
Scanner sc1= new Scanner(System.in);    
System.out.print(" Enter the 1st Denomination number of notes:");  
int a1= sc1.nextInt(); 
Scanner sc2= new Scanner(System.in);    
System.out.print("Enter the 2nd Denomination:  ");  
int b= sc2.nextInt(); 
Scanner sc3= new Scanner(System.in);    
System.out.print(" Enter the 2nd  Denomination number of notes: ");  
int b1= sc3.nextInt(); 
Scanner sc4= new Scanner(System.in);    
System.out.print("Enter the 3rd  Denomination:  ");  
int c= sc4.nextInt(); 
Scanner sc5= new Scanner(System.in);    
System.out.print(" Enter the 3rd  Denomination number of notes: ");  
int c1= sc5.nextInt(); 
Scanner sc6= new Scanner(System.in);    
System.out.print("Enter the 4th Denomination:  ");  
int d= sc6.nextInt(); 
Scanner sc7= new Scanner(System.in);    
System.out.print("Enter the 4th Denomination number of notes:  ");  
int d1= sc7.nextInt(); 
int sum=(a*a1)+(b*b1)+(c*c1)+(d*d1);
System.out.println("Total Available Balance in ATM: "+sum);
}
}