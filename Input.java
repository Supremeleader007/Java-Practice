import java.util.Scanner;
import java.lang.Math;
class PracticeJava{
	//1. Write a C program to enter two numbers and find their sum.
	static void addition(Scanner obj){
		
		System.out.println("Num1: ");
		int n1 = obj.nextInt();
		
		System.out.println("Num2: ");
		int n2 = obj.nextInt();
		
		System.out.println("The sum of two number is: "+ (sum(n1,n2)));
	}
	
	static int sum(int num1,int num2){
		return num1+num2;
	}
	
	//2. Write a C program to enter two numbers and perform all arithmetic operations (+, -, *, / and %)
	static void arithmeticOperation(Scanner obj){
		
		System.out.println("Num1: ");
		int n1 = obj.nextInt();
		
		System.out.println("Num2: ");
		int n2 = obj.nextInt();
		
		System.out.println("The sum of two number is: "+ (n1+n2));

		System.out.println("The subtraction of two number is: "+ (n1-n2));
		
		System.out.println("The multiplication of two number is: "+ (n1*n2));
		
		System.out.println("The division of two number is: "+ (n1/n2));
		
		System.out.println("The modulo of two number is: "+ (n1%n2));
	}
	
	//3. Write a C program to enter length and breadth of a rectangle and radius of a circle. Find
		//perimeter and area of rectangle and circumference and area of circle.
	static void rectangleAndCircle(Scanner obj){
		System.out.println("Enter length of rectangle: ");
		int n1 = obj.nextInt();
		
		System.out.println("Enter breadth of rectangle: ");
		int n2 = obj.nextInt();
		
		System.out.println("Enter radius of circle: ");
		double n3 = obj.nextDouble();
		
		
		System.out.println("The perimeter of rectangle is: "+(2*(n1+n2)));
		
		System.out.println("The area of rectangle is: "+(n1*n2));
		
		System.out.println("The circumference of circle is: "+(roundOff(2*Math.PI*n3)));
		
		System.out.println("The area of circle is: "+(roundOff(Math.PI*n3*n3)));
	}
	
	static double roundOff(double value){
		return Math.round(value*100.0)/100.0;
		
	}
	//4. Write a C program to swap two numbers. (with and without third variable)
	
	static void swap(){
		int a = 5;
		int b = 10;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a: " +a+ "b: "+b);
		
	}
	//5. Write a C program to find maximum between three numbers using nested if-else.
	
	
	static void maxBetweenThree(Scanner obj){
		System.out.println("Enter the first number: ");
		int n1 = obj.nextInt();
		
		System.out.println("Enter the second number: ");
		int n2 = obj.nextInt();
		
		System.out.println("Enter the third number: ");
		int n3 = obj.nextInt();
		int max = n1;
		
		if(n2>max){
			max = n2;
		}if(n3>max){
			max = n3;
		}
		System.out.println("Max is : "+max);
	}
	//6. Write a C program to check whether a number is even or odd using if-else statement.
	static void evenOdd(Scanner obj){
		System.out.println("Enter the number: ");
		int n1 = obj.nextInt();
		
		if(n1%2==0){
			System.out.println("The number is even number.");
		}else{
			System.out.println("The number is odd number.");

		}
	}
	//7. Write a C program to check whether year is leap year or not.
	static void leapYear(Scanner obj){
		System.out.println("Enter the year: ");
		int n1 = obj.nextInt();
		if(n1%4==0){
			if(n1%100!=0 || n1%400==0){
				//System.out.println("The year is leap year.");
				print("leap year");
			}else{
				//System.out.println("The year is not leap year.");
				print("not leap year");
			}
		}else{
			
			//System.out.println("The year is not leap year.");
			print("not leap year");
		}
		
	}
	
	static void print(String leapyear){
			String str = "This year is "+leapyear;
			System.out.println(str);
	}
	
	static void quadraticEquation(Scanner obj){
		System.out.println("Enter the value of a: ");
		int a = obj.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = obj.nextInt();
		
		System.out.println("Enter the value of c: ");
		int c = obj.nextInt();
		
		if(calculate(a,b,c)>0){
			System.out.println("The roots are: "+roundOff(calculateEquation(a,b,c,"plus")) +","+ roundOff(calculateEquation(a,b,c,"minus")));
		}else if(calculate(a,b,c)<0){
			System.out.println("There is no root");
		}else{
			System.out.println("The root is: "+roundOff(calculateEquation(a,b,c,"plus")));
		}
		
	}
	
	static double calculate(int a,int b,int c){		//
		
		return (b*b)-(4*a*c);
	}
	
	static double calculateEquation(int a,int b,int c,String sign){	//
		double x = Math.sqrt(calculate(a,b,c));
		double y = 2*a;
		if(sign == "plus"){
			return (-b+x)/y;
		}else{
			return (-b-x)/y;
		}
	}
	
	
	//1. Write a C program to check whether an alphabet is vowel or consonant using switch case.
	static void vowelOrConsonant(Scanner obj){
		
		System.out.println("Enter your choice: ");
		String str = obj.nextLine();
		str = str.toLowerCase();
		if(str.equals("a")){
			System.out.println("Vowel");
		}else if(str.equals("e")){
			System.out.println("Vowel");
		}
		else if(str.equals("i")){
			System.out.println("Vowel");
		}
		else if(str.equals("o")){
			System.out.println("Vowel");
		}
		else if(str.equals("u")){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");

		}
		
	}
	
	// Write a C program to check whether a number is positive, negative or zero using switch case.
	
	static void positiveOrNegetive(Scanner obj){
		System.out.println("Enter the number: ");
		int num = obj.nextInt();
		
		if(num>0){
			System.out.println("The number is positive.");
		}else if(num<0){
			System.out.println("The number is negetive.");
		}else{
			System.out.println("The number is zero.");
		}
	}
	
	static void calculateValue(Scanner obj){
		System.out.println("Enter the value of n: ");
		int num1 = obj.nextInt();
		
		System.out.println("Enter the value of x: ");
		int x = obj.nextInt();
		
		if(num1==1){
			int val = 1+x*x;
			System.out.println(val);
		}else if(num1==2){
			int val = 1+x/num1;
			System.out.println(val);
		}else if(num1==3){
			int val = 1+2*x;
			System.out.println(val);
		}else{
			if(num1>3 || num1<1){
				int val = 1+num1*x;
				System.out.println(val);
			}
		}
	}
	
	//Write a java program to find maximum between three numbers using logical operator
	
	static void maxBetweenThree1(Scanner obj){
		
		System.out.println("Enter first number: ");
		int num1 = obj.nextInt();
		
		System.out.println("Enter first number: ");
		int num2 = obj.nextInt();
		
		System.out.println("Enter first number: ");
		int num3 = obj.nextInt();
		
		int max;
		
		if(num1>num2 && num1>num3){
			max=num1;
		}else if(num2>num1 && num2>num3){
			max=num2;
		}else{
			max=num3;
		}			
		System.out.println("Max is: "+max);
	}
	
	//Write a java program to find maximum between three numbers using ternary operator.
	
	static void maxBetweenThree2(Scanner obj){
		System.out.println("Enter first number: ");
		int num1 = obj.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = obj.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = obj.nextInt();
		
		int max;
		
		max = (num1>num2 && num1>num3) ? num1 : (num2>num3) ? num2 : num3;
		
		System.out.println("Max is: "+max);
	}
	
	static void amountToBePaid(Scanner obj){
		System.out.println("Enter your unit: ");
		int unit = obj.nextInt();
		double amount;
		
		if(unit<=200){
			amount = unit*0.50;
		}else if(unit>200 && unit<=400){
			amount = 100+(unit*0.65);
		}else if(unit>=401 && unit<=600){
			amount = 250+(unit*0.80);
		}else{
			amount = 425+(unit*1.25);
		}
		System.out.println("Total amount is: "+amount);
	}
	
	static void simpleCalculator(Scanner obj){
		System.out.println("Enter first number: ");
		int num1 = obj.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = obj.nextInt();
		
		System.out.println("Enter your choice: ");
		System.out.println("1 for addition.\n2 for subtraction.");
		System.out.println("3 for multiplication.");
		System.out.println("4 for division");
		System.out.println("5 for remainder");
		int choice = obj.nextInt();
		
		switch(choice){
			case 1:
				int sum = num1+num2;
				System.out.println("The addition of two number is :"+sum);
				break;
			case 2:
				int subtraction = num1-num2;
				System.out.println("The multiplication of two number is :"+subtraction);
				break;
			case 3:
				int multiplication = num1*num2;
				System.out.println("The multiplication of two number is :"+multiplication);
				break;
			case 4:
				if(num2 == 0){
					System.out.println("Something cannot be devided by zero.");
				}else{
					int division = num1/num2;
					System.out.println("The division of two number is :"+division);	
				}
				break;
			case 5:
				int remainder = num1%num2;
				System.out.println("The remainder of two number is :"+remainder);
				break;
			default: 
				System.out.println("Please enter a valid choice.");
		}
		
	}
	
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		//addition(obj);
		//arithmeticOperation(obj);
		//rectangleAndCircle(obj);
		//swap();
		//maxBetweenThree(obj);
		//evenOdd(obj);
		//leapYear(obj);
		//quadraticEquation(obj);
		//vowelOrConsonant(obj);
		//positiveOrNegetive(obj);
		//calculateValue(obj);
		//maxBetweenThree1(obj);
		//maxBetweenThree2(obj);
		//amountToBePaid(obj);
		simpleCalculator(obj);
		
	}
}


