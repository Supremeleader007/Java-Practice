import java.util.Scanner;

public class Main
{
	//Write a C program to find the sum of all elements of an array
	
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int size = obj.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of tha array: ");
		for(int i=0;i<size;i++){
		    arr[i] = obj.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<size;i++){
		    //System.out.println("Array elements are: "+arr[i]);
		    sum += arr[i];
		}
		System.out.println(sum);
	}
}