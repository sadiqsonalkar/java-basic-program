
import java.util.*;

class PointProgram
 {
	

    		int x;
    		int y;
                 
    	        public void display() 
                {
        	System.out.println("x=" + x);
        	System.out.println("y=" + y);
    	        }

    	public PointProgram() 
  	{
        	x = 0;
        	y = 0;
    	}

    	public PointProgram(int n)
	{
        	x = n;
       		y = n;
    	}

    	public PointProgram(int n, int n2) 
	{
        	x = n;
        	y = n2;
        }

    	public static void main(String[] arrstring)
        {
         PointProgram p0 = new PointProgram();
         p0.display();
         PointProgram p = new PointProgram(65,98);
         p.display();
         PointProgram p1 = new PointProgram(43);
         p1.display();
         }   
}