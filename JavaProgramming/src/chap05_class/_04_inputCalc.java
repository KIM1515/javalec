package chap05_class;

import java.util.Scanner;

public class _04_inputCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 하나 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("사칙 연산 중 하나 선택(+, -, *, /) : ");
		String op = sc.next();
		
		switch(op) {
		
		case "+" : 
			System.out.println(num1 + " " + op + " " + num2 + " = " + add(num1, num2));
		    break;
		
		case "-" : 
			System.out.println(num1 + " " + op + " " + num2 + " = " + minus(num1, num2));
		     break;
		
		case "*" : 
			System.out.println(num1 + " " + op + " " + num2 + " = " + multi(num1, num2));
		    break;
		
		case "/" : 
			System.out.println(num1 + " " + op + " " + num2 + " = " + divide(num1, num2));
		    break;
		}

	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	public long muliple(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		return(double) a / b;
	}
	
	
}
