//1. Write a C program to print naturalnumbers from 1 to n and also print their sum.
import java.util.Scanner;
import java.util.*;
class PracticeLoop{
	static void naturalNumbers(Scanner obj){
		System.out.println("Enter the number you want to print: ");
		int num1 = obj.nextInt();
		int sum = 0;
		
		for(int i=1;i<=num1;i++){
			sum = sum+i;
			System.out.print(i+" ");	
		}
		System.out.println("\nThe sum is: "+sum);
	}
	
	//2. Write a C program to check whether a number is palindrome or not
	
	static void palindrome(Scanner obj){
		System.out.println("Enter the number: ");
		int num = obj.nextInt();
		int answer=0;
		int copyNumber = num;
		while(num>0){
			int remainder = num%10;
			answer = answer*10+remainder;
			num= num/10;
		}
		if(answer==copyNumber){
			System.out.println("The number is palindrome.");
		}else{
			System.out.println("The number is not palindrome.");
		}
		
	}
	
	static void palindromeInShort(Scanner obj){
		System.out.println("Enter the number: ");
		String num = obj.nextLine();
		
		String answer = "";
		
		for(int i = num.length();i>0;i--){
			answer += num.substring(i-1,i);
		}
		//System.out.println("Answer"+ answer);
		
		
		if(answer.equals(num)){
			System.out.println("The number is palindrome.");
		}else{
			System.out.println("The number is not palindrome.");
		}
	}
	
	//3. Write a C program to find all factors of a number
	
	static ArrayList<Integer> findFactors(int num){
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=1;i<=Math.sqrt(num);i++){
			if(num%i==0){
				numbers.add(i);
				if(i!=num/i){
					numbers.add(num/i);
				}
			}
			
		}
		return numbers; 
	}
	
	static void factorial(Scanner obj){
		System.out.println("Enter the number: ");
		int num = obj.nextInt();
		int fact = 1;
		for(int i=num;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("Factorials is: "+fact);

	}
	
	//5. Write a C program to find HCF (GCD) and LCM of two numbers.
	
	static void hcfAndLcm(Scanner obj){
		System.out.println("Enter the number: ");
		int num1 = obj.nextInt();
		
		System.out.println("Enter the number: ");
		int num2 = obj.nextInt();
		
		ArrayList<Integer> num1Factors = findFactors(num1);
		ArrayList<Integer> num2Factors = findFactors(num2);
		
		System.out.println(num1Factors + " :: "+ num2Factors );
	}
	
	//6. Write a C program to check whether a number is Prime number or not.
	
	static void isPrime(Scanner obj){
		System.out.println("Enter the number: ");
		int num = obj.nextInt();
		int count=0;
		
		if(num<=1){
			System.out.println("Not prime.");
		}
		
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				count +=1;
			}
		}
		if(count==0){
			System.out.println("This is prime");
		}else{
			System.out.println("This is not prime");
		}
	}
	
	static boolean isPrimeCheck(int num){
		
		int count=0;
		
		if(num<=1){
			//System.out.println("Not prime.");
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				count +=1;
			}
		}
		if(count==0){
			//System.out.println("This is prime");
			return true;
		}else{
			//System.out.println("This is not prime");
			return false;
		}
	}
	
	//Write a C program to print all Prime numbers between 1 to n.
	
	static void numberOfPrime(Scanner obj){
		System.out.println("Enter the number: ");
		int num = obj.nextInt();
		System.out.println();
		for(int i = 2;i<=num;i++){
			if(isPrimeCheck(i)){
				System.out.print(i + " ");
			}
		}
	}
	/*
	static int prime(int some){
		System.out.println("Enter: ");
        int num = some.nextInt();
		int count = 0;
		
		if(num<=1){
			System.out.println("Not prime.");
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i!=0){
				return i;
			}
		}
		
	}
	*/
	//8. Write a C program to check whether a number is Armstrong number or not.
	
	static void armstrong(Scanner obj){
        System.out.println("Enter: ");
        int num = obj.nextInt();
		String str = Integer.toString(num);
		int size=str.length();
        int copyNum=num;
        int sum=0;
        while(num>0){
            int remainder = num%10;
            sum=sum+calculateSize(remainder,size);
			num=num/10;
        }
        if(copyNum==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }
		
    }
	static int calculateSize(int remainder,int size){		//(5,3)
		int value=1;
		for(int i=0;i<size;i++){
			value = value * remainder;
		}
		return value;
	}
	
	//9. Write a C program to check whether a number is Perfect number or not.

	static void perfectNum(Scanner obj){
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("Enter: ");
		int num = obj.nextInt();
		int i;
		
		for(i=1;i<=num;i++){
			if(num%i==0){
				numbers.add(i);
			}/*if(i!=num/i){
				numbers.add(num/i);
			}*/
		}
		int sum=0;
		for(i=0;i<numbers.size();i++){
			sum=sum+numbers.get(i);
		}
		
	}
	
	/*import java.util.Scanner;
class Main{
    
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter: ");
        int num = obj.nextInt();
        int sum=0;
        int i;
        
        for(i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(i);
            }if(i!=num/i){
                System.out.println(num/i);
            }
        }
         sum=(sum+i+(num/i));
        System.out.println(sum);
        
    }
}*/

	//11.Write a C program to print Fibonacci series up to n terms.
	static void fibonacci(Scanner obj){
		System.out.println("Enter: ");
        int num = obj.nextInt();
		int num1=0,num2=1;
		for(int i=2;i<=num;i++){
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}
	
	//Write a C program to print multiplication table of any number.
	
	static void multiplicationTable(Scanner obj){
		System.out.println("Enter: ");
        int num = obj.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(num*i);
		}
	}
	
	//Write a C program to print all alphabets from a to z
	
	static void alphabetsPrint(){
		char ch;
		for(ch='a';ch<='z';ch++){
			System.out.println(ch);
		}
	}
	
	//Write a C program to print all odd and even numbers between 1 to n and also print their sum.
	
	static void evenOdd(Scanner obj){
		System.out.println("Enter: ");
        int num = obj.nextInt();
		int sum1=0;
		int sum2=0;
		
		for(int i=1;i<=num;i++){
			if(i%2==0){
				sum1 =sum1+i;
			}else{
				sum2=sum2+i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
	
	//1. Write a C program to swap first and last digits of a number.
	
	static void swapFirstAndLast(Scanner obj){
		ArrayList<Integer> numberArr = new ArrayList<>();
		System.out.println("Enter: ");
        int num = obj.nextInt();
		int remainder;
		int answer=0;
		
		while(num>0){
			remainder=num%10;
			numberArr.add(remainder);
			num /= 10;
		}
		
		//[1,3,2,4]
		Collections.reverse(numberArr);
		int swap = numberArr.get(numberArr.size()-1);
		numberArr.set(numberArr.size()-1,numberArr.get(0));
		numberArr.set(0,swap);
		
		for(int i:numberArr){
			
			answer=answer*10+i;
		}
		System.out.println(answer);
		
		//4231
	}
	// Write a C program to count number of digits in a number and also their sum and product.

	static void digits(Scanner obj){
		System.out.println("Enter: ");
        int num = obj.nextInt();
		int sum = 0;
		int product = 1;
		int remainder;
		int i=0;
		while(num>0){
			remainder = num%10;
			sum = sum+remainder;
			product *= remainder;
			num/=10;
			i++;
		}
		System.out.println("sum: "+sum);
		System.out.println("product: "+product);
		System.out.println(i);
	}
	
	static void findSeries(Scanner obj){
		System.out.println("Enter: ");
        int num = obj.nextInt();
		double sum = 1;
		
		for( int i=2;i<=num;i++){
			sum += (double)1/i;
		}
		System.out.println(sum);
	}
	
	static int findFactorials(int num){
		int product = 1;
		for(int i=2;i<=num;i++){
			product *= i;
		}
		return product;
	}
	
	/*static void sinSeries(Scanner obj){
		System.out.println("Enter the value of X:");
        int value1 = obj.nextInt();
		
		System.out.println("Enter the number you want to get sin value: ");
        int value2 = obj.nextInt();
		double y=value1;
		
		boolean flag = true;	//1 //-1
		
		for(int i=3;i<=value2;i+=2){
			/*
			y = y + flag * ((calculateSize(value1,i))/findFactorials(i));
			flag = flag == 1 ? -1 : 1;
			
			double dig = (calculateSize(value1,i))/findFactorials(i);
			System.out.println(dig);
			if(flag){
				y = y + dig;
				
			}else{
				y = y - dig;
			}
			flag = flag ? false: true;
		}
		System.out.println(y);
	}*/

		static void sinSeries(Scanner obj){
			System.out.println("Enter the value of X (in degrees):");
			int value1 = obj.nextInt();
			System.out.println("Enter number of terms in the series (odd number): ");
			int value2 = obj.nextInt();

			double x = Math.toRadians(value1);  
			double y = x;
			boolean flag = false;

			for(int i=3; i<=value2; i+=2){
				double dig = Math.pow(x, i) / findFactorials(i);  // Math.pow gives double result
				y = flag ? y + dig : y - dig;
				flag = !flag;
			}

			System.out.println("Approximate value of sin(" + value1 + ") = " + y);
		}


	
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		ArrayList<Integer> number = new ArrayList<>();
		//naturalNumbers(obj);
		//palindrome(obj);
		//palindromeInShort(obj);
		//number = findFactors(18);
		//factorial(obj);
		//hcfAndLcm(obj);
		//isPrime(obj);
		//numberOfPrime(obj);
		//armstrong(obj);
		//perfectNum(obj);
		//fibonacci(obj);
		//multiplicationTable(obj);
		//alphabetsPrint();
		//evenOdd(obj);
		//swapFirstAndLast(obj);
		//digits(obj);
		//findSeries(obj);
		//sinSeries(obj);
		
	}
}