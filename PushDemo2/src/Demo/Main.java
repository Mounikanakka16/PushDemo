package Demo;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float c1=sc.nextFloat();
		float c2=sc.nextFloat();
		float c3=sc.nextFloat();
		float a=c1+c2+c3;
		float gst=a+(0.18f*a);
		System.out.println(gst);
		
	}

}
