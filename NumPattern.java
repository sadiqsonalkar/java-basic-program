
import java.util.*;
class NumPattern
{
	public static void main(String args[])
	{
          int i,j,n;
          System.out.println("enter no. of rows:");
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          for(i=1;i<n;i++)
	  {
           for(j=1;j<=i;j++)
               System.out.print(j);
	       System.out.println("\n");
	   
          }
          
         }
}

          