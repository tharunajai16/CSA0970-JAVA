import java.util.*;
class Main
{
 
    static int sum = 0;
    static int compositeCount(int arr[], int n)
    {
        int max_val = Arrays.stream(arr).max().getAsInt();
        Vector<Boolean> prime = new Vector<Boolean>(max_val + 1);
        for (int i = 0; i < max_val + 1; i++)
        {
            prime.add(i, Boolean.TRUE);
        }
        prime.add(0, Boolean.TRUE);
        prime.add(1, Boolean.TRUE);
        for (int p = 2; p * p <= max_val; p++)
        {
            if (prime.get(p) == true)
            {

                for (int i = p * 2; i <= max_val; i += p)
                {
                    prime.add(i, Boolean.FALSE);
                }
            }
        }
 
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (!prime.get(arr[i]))
            {
                count++;
                sum = sum + arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size:");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.print("Enter the elements: \n");
        try{
        for(int i=0;i<size;i++){
        array[i] =sc.nextInt() ;}}
        catch(Exception e){
            System.out.println("invalid input");
        }
        int n = array.length;
        System.out.print("Count of Composite Numbers = "
                + compositeCount(array, n));
    }
}