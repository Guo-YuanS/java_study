/**
 * 测试时间类的用法
 *@author guoy10
 *
 */
package cn.wrappe.test;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		Date d2 = new Date(1000);
		d2.setDate(2124536464);
		System.out.println(d2.toGMTString());
	}
}
