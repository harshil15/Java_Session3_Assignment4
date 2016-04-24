package acadgild;

import java.util.Scanner;

public class BasicCalculator {
	int a,b;
	public BasicCalculator(){
		a=1;
		b=1;
	}
	public void add(){
		System.out.println("Addition of two number "+a+" and "+b+" is :: "+(a+b));
	}
	public void substract(){
		System.out.println("Substraction of two number "+a+" and "+b+" is :: "+(a-b));
	}
	public void multiply(){
		System.out.println("Multiplication of two number "+a+" and "+b+" is :: "+(a*b));
	}
	public void division(){
		System.out.println("Division of two number "+a+" and "+b+" is :: "+(a/b));
	}
	public void setValueAB(int x, int y){
		a = x;
		b = y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BasicCalculator b1 = new BasicCalculator();
		System.out.print("Enter first Number ::  ");
		int x = in.nextInt();
		System.out.print("Enter second Number ::  ");
		int y = in.nextInt();
		b1.setValueAB(x,y);
		System.out.print("Enter the operation to perform +-/*  :: ");
		String op = in.next();
		
		switch(op){
			case "+" :
				b1.add();
				break;
			case "-" :
				b1.substract();
				break;
			case "*" :
				b1.multiply();
				break;
			case "/" :
				b1.division();
				break;
			default:
				System.out.println("Enter the correct operation +-/*");
		}
	}

}
