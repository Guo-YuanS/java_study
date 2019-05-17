package cn.wrappe.test;

import java.util.Random;

public class Title3 {
	public static void main(String[] args) {
		int i = new Random().nextInt(3);
		switch (color.values()[i]) {
		case red:
			System.out.println("红灯停！");
			break;
		case yellow:
			System.out.println("黄灯慢行！");
			break;
		case green:
			System.out.println("绿灯行！");
			break;
		}
	}
	
	enum color{red,yellow,green}
	
}
