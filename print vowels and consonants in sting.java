import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

   public static void main(String[] args) {

      Scanner scan = null;
      String str = null;
      Set<Character> vowels = null;
      Set<Character> consonants = null; 
      char ch = '\0';


      scan = new Scanner(System.in);


      System.out.print("Enter String :: ");
      str = scan.nextLine();

 
      str = str.toUpperCase();

      vowels = new HashSet<Character>();
      consonants = new HashSet<Character>();

      for(int i=0; i<str.length(); i++) {
         ch = str.charAt(i);

         
         if(ch >= 'A' && ch <= 'Z') {

       
            if( checkVowel(ch) ) {
               vowels.add(ch);
            } else {
               consonants.add(ch);
            }
         }
      }

      System.out.println("Vowels :: " + vowels);
      System.out.println("Consonants :: " + consonants);

      scan.close();
		
   }

   private static boolean checkVowel(char ch) {
      if(ch == 'A' || ch == 'E' || ch == 'I'
            || ch == 'O' || ch == 'U')
      return true;
      return false; 
   }

}