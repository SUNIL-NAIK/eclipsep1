
package demo;

import java.util.Scanner;

public class basic {

	
	
	public static void main(String[] args) {
		int num1,num2 ;
		Scanner sc = new Scanner(System.in);
		 System.out.println("frist number");
		 num1 = sc.nextInt();
		 System.out.println("second number");
		 num2 = sc.nextInt();

		System.out.println("arithmetic operation are:");
		System.out.println("addition " +(num1+num2));
		System.out.println("multiplication " +(num1*num2));
		System.out.println("substraction" +(num1-num2));
		System.out.println("divison" +(num1/num2));
		System.out.println("modulo" +(num1%num2));
		// TODO Auto-generated method stub

	}

}
