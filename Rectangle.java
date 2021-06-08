import java.util.*;

class Rectangle 
{
    int length;
    int breath;

    public void display() 
    {
        System.out.println("Length=" + length);
        System.out.println("Breath=" + breath);
    }

    public Rectangle() 
    {
        length = 0;
        breath = 0;
    }

    public Rectangle(int x) 
    {
        length = x;
        breath = x;
    }

    public Rectangle(int x, int x2) 
    {
        length = x;
        breath = x2;
    }

    public static void main(String[] arrstring) 
    {
        Rectangle rect1 = new Rectangle();
        rect1.display();
        Rectangle rect2 = new Rectangle(2);
        rect2.display();
        Rectangle rect3 = new Rectangle(19,43);
        rect3.display();
    }
}