/**
 * 测试自动装箱与拆箱
 * @author guoy10
 * 
 */
package cn.wrappe.test;

public class Test02 {
	public static void main(String[] args) {
		//Integer a = new Integer(1000);
		Integer a = 1000;//自动装箱
		Integer b = 1500;
		
		int c = new Integer(1500);//自动拆箱
		//int c= b;
		
		Integer d = 1234;
		Integer d1 = 1234;
		System.out.println(d==d1);//false;不同对象
		System.out.println(d.equals(d1));//true，比较两个对象的值
		
		System.out.println("##################");
		Integer d2 = 123;
		Integer d3 = 123;
		System.out.println(d2==d3);//true，[-128,127]之间的数，仍然当作基本数据类型来处理
		System.out.println(d2.equals(d3));
	}
}
