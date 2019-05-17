package cn.Exception.title;

import java.util.Scanner;

public class Title2 {
	public static void main(String[] args) {
		isTriangle triangle = new isTriangle();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		
		try {
			triangle.setT(input.nextInt(), input.nextInt(), input.nextInt());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		triangle.output();
	}
}

class isTriangle{
	int a,b,c;

	public  void setT(int a,int b,int c) throws IllegalArgumentException{
		if(a+b<=c||a+c<=b||b+c<=a) {
			throw new IllegalArgumentException("a,b,c不能构成三角形!");
		}
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public void output() {
		System.out.println("a,b,c能够构成三角形");
	}
}
