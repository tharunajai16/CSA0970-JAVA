import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int a,b,i;
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter nummber ::");
      a= sc.nextInt();
      System.out.println("Enter number of times to be multiplied ::");
      b= sc.nextInt();
      if(a<=0 &&b>0)
      {
          for(i=1;i<=b;i++)
          {
               System.out.println(a +"*" +i +"=" +a*i);
          }
      }
      else
      {
          System.out.println("enter valid details");
      }
    }
}