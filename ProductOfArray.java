
import java.util.*;

class ProductOfArray
 {
    
    public static void main(String[] arrstring)
      {
        int a;
        int b;
        int[][] arraya = new int[3][3];
        int[][] arrayb = new int[3][3];
        int[][] arrayc= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (a = 0; a < 3; ++a) 
	{
            for (b= 0; b < 3; ++b)
	    {
                System.out.println("Enter met1[" + a + "][" + b + "]");
                arraya[a][b] = sc.nextInt();
            }
        }
        for (a= 0; a< 3; ++a)
        {
            for (b = 0; b < 3; ++b) 
            {
                System.out.println("Enter met2[" + a + "][" + b + "]");
                arrayb[a][b] = sc.nextInt();
            }
        }
        for (a= 0; a < 3; ++a)
	 {
            for (b = 0; b < 3; ++b)
	    {
                for (int i = 0; i < 3; ++i) 
	 	{
                    arrayc[a][b] = arrayc[a][b] + arraya[a][b] * arrayb[a][b];
                }
            }
        }
        System.out.println("The Multiplication is::");
        for (a= 0; a < 3; ++a) 
	{
            for (b = 0; b < 3; ++b) {
                System.out.print(arrayc[a][b] + "\t");
            }
            System.out.println();
        }
    }
}