import java.util.*;
class Hash
{
	public static void main(String args[])
	{
          int i,j,n;
          System.out.println("enter no. of hash:");
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          for(i=0;i<n;i++)
	  {
           for(j=n;j>i;j--)
               System.out.print("#");
               System.out.println("\n");
	       
	   
          }
          
         }
}