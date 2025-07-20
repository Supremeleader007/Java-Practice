//1. Write a C program to print naturalnumbers from 1 to n and also print their sum.
import java.util.Scanner;
class PracticeLoop{
	static void naturalNumbers(Scanner obj){
		System.out.println("Enter the number you want to print: ");
		int num1 = new.nextInt();
		
		for(int i=1;i<=num1;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		naturalNumbers(obj);
	}
}