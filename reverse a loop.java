import java.io.*;
import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		char ch;
		String nstr="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str= sc.nextLine();
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}