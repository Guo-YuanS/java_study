package cn.wrappe.test;

import java.util.Scanner;

/**
 * 第八章第一题
 * @author guoy10
 *
 */
public class Title01 {
	public static void main(String[] args) {
		boolean flag = false;
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名:");
		str = input.nextLine();
		
		if(str==null) {
			System.out.println("该用户名为空！");
		}
		
		if(str.length()<=6) {
			System.out.println("该用户名过短！");
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				flag = true;
			}
		}
		
		if (flag) {
			System.out.println("该用户名不能有数字！");
		}
	}
}
