import java.util.*;

class DistanceProgram 
    {
    int km;
    int m;

    public DistanceProgram() 
    {
        this.km = 0;
        this.m = 0;
    }

    public DistanceProgram(int x, int y) 
    {
        this.km = x;
        this.m = y;
    }

    public DistanceProgram(int x) 
    {
        this.km = x / 1000;
        this.m = x;
    }

    void display() 
    {
        System.out.println("Km=" + this.km + "\nm=" + this.m + "\n");
    }

    public static void main(String[] arrstring) 
    {
        DistanceProgram d1 = new DistanceProgram();
        DistanceProgram d2 = new DistanceProgram(4, 4800);
        DistanceProgram d3 = new DistanceProgram(6100);
        d1.display();
        d2.display();
        d3.display();
    }
}