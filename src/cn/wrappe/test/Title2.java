package cn.wrappe.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Title2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String age,score,time;
		System.out.println("请输入年龄： ");
		age = in.nextLine();
		System.out.println("请输入分数:");
		score = in.nextLine();
		System.out.println("请输入入学时间(yyyy-MM-dd):");
		time = in.nextLine();
		Student boy = new Student(age, score, time);
		System.out.println(boy.toString());
	}
}

class Student{
	private int age;
	private double score;
	private Calendar time;
	
	public Student(String age,String score,String time) {
		setAge(age);
		setScore(score);
		setTime(time);
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(String age) {
		int age1 = Integer.parseInt(age);
		this.age = age1;
	}

	public double getScore() {
		return score;
	}

	public void setScore(String score) {
		double score1 = Double.parseDouble(score);
		this.score = score1;
	}

	public Calendar getTime() {
		return time;
	}

	public void setTime(String time) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		Calendar cal = new GregorianCalendar();
		Date date;
		try {
			date = dateFormat.parse(time);
			cal.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		this.time = cal;
	}

	@Override
	public String toString() {
		return "学生年龄： "+getAge()+"学生分数： "+getScore()+"学生入学时间: "+
	getTime().get(Calendar.YEAR)+"年"+(getTime().get(Calendar.MONTH)+1)+"月"
	+getTime().get(Calendar.DATE)+"日";
	}
	
}