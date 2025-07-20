//largest element in the array.
import java.util.Scanner;
class LoopInJava{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int size = obj.nextInt();
		System.out.println("Enter the size you want to insert in array: ");
		int arr[] = new int[size];
		System.out.println("Enter the elements you want to insert");
		for(int i=0;i<size;i++){
			arr[i] = obj.nextInt(i);
		}
	
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}