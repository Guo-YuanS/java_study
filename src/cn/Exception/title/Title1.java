package cn.Exception.title;

import java.util.Scanner;

public class Title1 {
	public static void main(String[] args) {
		CheckScore aCheckScore = new CheckScore();
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入分数:");
			aCheckScore.setScore(input.nextInt()); 
			System.out.println("请输入姓名：");
			aCheckScore.setName(input.next());
		} catch (IllegalScoreException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		aCheckScore.output();
		
		
	}
	
	static class CheckScore {
		private int score;
		private String name;
		
		
		public void setScore(int score) throws IllegalScoreException{
			if(score<0||score>100) {
				throw new IllegalScoreException("分数应为不大于100的正数！");
			}
			this.score = score;
		}
		
		public void output() {
			System.out.println(name+":"+score);
		}

		public void setName(String name) throws IllegalScoreException {
			boolean flag = false ;
			for(int i=0;i<name.length();i++) {
				if(Character.isDigit(name.charAt(i))) {
					flag = true;
				}
			}
			if(name.length()<2||flag) {
				throw new IllegalScoreException("名字长度不小于2且不能含有数字！");
			}
			this.name = name;
		}

	}
	
	static class IllegalScoreException extends Exception{
		public IllegalScoreException() {
			super();
		}
		
		public IllegalScoreException(String message) {
			super(message);
		}
	}
}
