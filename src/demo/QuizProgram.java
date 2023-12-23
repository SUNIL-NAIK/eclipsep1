package demo;

import java.util.Scanner;

public class QuizProgram {

	public static void main(String[] args) {
	int n;
	while(true) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("abcd next letter");	
	System.out.println(" 1.f \n 2.g \n 3.e\n 4.z\n 5.exit\n");
	
	System.out.println("Enter your Choice:1 2 3 4");
	n =sc.nextInt();
	
	if(n == 3)
	{
		System.out.println("congrts you chosen correct answer");
		break;
	}
	else if (n == 5){
	 break;
	}
	else {
		System.out.println("wrong answer try next time");
	     }
	}

}
}