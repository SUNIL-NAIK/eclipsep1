package demo;

import java.util.Scanner;

public class DisplayingContent {
	
	public static void main(String[] args) {
		
		int n, fac = 1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number ");
		n=sc.nextInt();
	    //using for
		//for(int i=1; i <=n; i++) 
		//{
			//fac = fac*i;
		//}
		int i=1;
		while(i <= n)
		{
		 fac =fac*i;
		 i++;
		 
		}
		System.out.println("factoiral number : "+fac);
		
	}
	
 }
