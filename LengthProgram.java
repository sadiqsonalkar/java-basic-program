import java.util.*;

class LengthProgram 
{
    int feet;
    int inch;

    public LengthProgram() 
	{
        this.feet = 0;
        this.inch = 0;
        }

    public LengthProgram(int x, int y) 
	{
        this.feet = x;
        this.inch = y;
        }

    public LengthProgram(int x) 
	{
        this.feet = x / 12;
        this.inch = x;
        }

    void display() 
	{
        System.out.println("feet=" + this.feet + "\ninch=" + this.inch + "\n");
        }

    public static void main(String[] arrstring) 
    {
        LengthProgram l1 = new LengthProgram();
        LengthProgram l2 = new LengthProgram(5, 60);
        LengthProgram l3 = new LengthProgram(120);
        l1.display();
        l2.display();
        l3.display();
    }
}