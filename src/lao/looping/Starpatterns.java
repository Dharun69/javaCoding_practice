package lao.looping;

import org.testng.annotations.Test;

public class Starpatterns {

	@Test(enabled = false)
	public void square() {
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++) 
			{
				System.out.print("* ");
			}
			System.out.println(" ");	
		}	
	}
	
	@Test (enabled = false)
	public void increasingTriangle()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test(enabled = false)
	public void decreasingTriangle()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=5; j>=i; j--)   //for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test(enabled = false)
	public void rightSidedTriangle()//1.decreasing space 2. increasing star
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");//two space
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* "); //one space
			}
			System.out.println();
		}
		
	}
	
	@Test
	public void rightSided() //1. increasing space 2. decreasing star
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
	}
	
	
	
}
