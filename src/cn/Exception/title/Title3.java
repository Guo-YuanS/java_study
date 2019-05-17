package cn.Exception.title;

import java.util.Scanner;

public class Title3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生N的值:");
		int n = input.nextInt();
		Students[] students = new Students[n];
		for(int i=0;i<students.length;i++) {
			students[i] = new Students();
		}
		
	}
}

class  Students{
	private int score;
	
	public Students() {
		
	}
	
	public void setScore(int score) throws IllegalInException{
			if(score<0) {
				throw new IllegalInException("分数必须是正数或者0,请再次输入该分数");
			}
			else
				this.score = score;
		}
	
	public int outPrint() {
		return this.score;
	}
}
class IllegalInException extends Exception{
	public IllegalInException() {
		super();
	}
	
	public IllegalInException(String message) {
		super(message);
	}
}
