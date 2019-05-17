/**
 * DateFormat类和SimpleDateFormat类
 * @author guoy10
 * 
 */
package cn.wrappe.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日:hh时mm分ss秒");
		
		Date t = new Date(123111324241L);
		String str = df.format(t);
		System.out.println(str);
		
		System.out.println("##############");
		String str2 = "1994-5-11";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d2=df2.parse(str2);
			System.out.println(d2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
