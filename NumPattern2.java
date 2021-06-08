import java.util.*;
class NumPattern2
{
	public static void main(String args[])
	{
          int i,j,k=1,n;
          System.out.println("enter no. of rows:");
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          for(i=1;i<n;i++)
	  {
           for(j=1;j<=i;j++,k++)
               System.out.print(k);
	       System.out.println("\n");
	   
          }
          
         }
}