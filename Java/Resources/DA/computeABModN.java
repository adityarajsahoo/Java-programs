import java.util.Scanner;

class ComputeABModN
{
	public ComputeABModN()
	{
	}
	public int computeABModN(int a, int b, int n)
	{
		boolean bin[]= this.convertToBin(b);

		for (int i=0;i<bin.length;i++)
		{
			System.out.println(bin[i]);
		}
		int c=0,f=1;

		for(int i=bin.length-1 ;i>=0;i--)
		{
			c=2*c;
			f=(f*f)%n;
			if(bin[i] == true)
			{
				c=c+1;
				f=(f*a)%n;
			}
		}
		return f;
	}
	public boolean[] convertToBin(int m)
	{
		boolean array[] = new boolean[3
			
		
		
		];
		int index=0;
		int r,q;

		while(m!=0)
		{
			r=m%2;
			q=m/2;
			if(r==1)
				 array[index++]=true;
			else
				array[index++]=false;
			m=q;
		}
		return array;
	}
}
public class computeABModN
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the values of A,B and N");

	   int a=Integer.parseInt(scan.nextLine());
       
       int b=scan.nextInt();

	   int n=scan.nextInt();
	   scan.close();
       
      computeABModN c = new computeABModN();
       
       int result = c.computeABModN(a,b,n);
       
       System.out.println(a+"^"+b+"Mod"+n+"="+result);
	}
}