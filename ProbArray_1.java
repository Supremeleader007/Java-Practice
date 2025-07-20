import java.util.Scanner;

// Write a C program to calculate the sum of all negative and positive elements in an array.


class ProbArr_1{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter: ");
		int size = obj.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		
		for(int i=0;i<size;i++){
			arr[i] = obj.nextInt();
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<size;i++){
			if(arr[i]>0){
				sum1 += arr[i];
			}else{
				sum2 += arr[i];
			}
		}
			
			System.out.println("The sum of positive numbers are: "+sum1);
			System.out.println("The sum of negative numbers are: "+sum2);
	}
}