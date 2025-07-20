import java.util.Scanner;
class ProbArray_2{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter: ");
		int size = obj.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++){
			arr[i] = obj.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<size;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);
		
	}
}