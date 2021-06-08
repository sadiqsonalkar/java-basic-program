import java.io.*;
 
class SumOfDigits 
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value to do the sum :");
        int n = Integer.parseInt(br.readLine());
        int sum = 0, k;
        while (n != 0)
	{
            k = n % 10;
            sum = sum + k;
            n = n / 10;
        }
        System.out.print("\nSum of individual digits : " + sum);
    }
}