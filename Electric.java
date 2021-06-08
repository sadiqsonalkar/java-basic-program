import java.util.*;
class Electric
{
	public static void main(String args[])
	{
		double u,ec,fc,st,gst,net;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Units comsumed: ");
		u=sc.nextDouble();
		fc=(u<300)?100:150;
		if(u<=100)
			ec=u*5;
		else if(u<=300)
			ec=500+(7*(u-100));
		else if(u<=500)
			ec=500+1400+(10*(u-300));
		else
			ec=500+1400+2000+(15*(u-500));
		
		st=fc+ec;
		gst=0.12*st;
		net=st+gst;
		System.out.println("*******************************************************************");
		System.out.println("Unit Consumed: "+u);
		System.out.println("Electricity Charge: "+ec);
		System.out.println("Fixed Charge: "+fc);
		System.out.println("Sub-Total: "+st);
		System.out.println("GST: "+gst);
		System.out.println("Net Payment: "+net);
		System.out.println("*******************************************************************");
	}
}


		