import java.util.Scanner;
class Function{
	public static void main(String[] args){
		/*int[] num = new int[3];
		num[0]=54;
		num[1]=55;
		num[2]=56;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);*/
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter: ");
		int size = obj.nextInt();
		int num[] = new int[size];
		System.out.println("Enter: ");
		
		for(int i=0;i<size;i++){
			num[i] = obj.nextInt();
		}
		
		int find = obj.nextInt();
		
		for(int i=0;i<num.length;i++){
			if(num[i]==find){
				System.out.println("found at "+i);
			}
			
		}	
	}
}