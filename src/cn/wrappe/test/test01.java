package cn.wrappe.test;

public class test01 {
	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(i.MAX_VALUE);
		System.out.println(i.toHexString(i));
		
		Integer I2 = i.parseInt("234");
		System.out.println(I2+10);
	}
}
