package cn.wrappe.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 可视化日历
 * @author guoy10
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String date="2019-1-17";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date2 = format.parse(date);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date2);
			
			calendar.set(calendar.DATE, 1);
			System.out.println(calendar.get(calendar.DAY_OF_WEEK));
			int maxDate = calendar.getActualMaximum(calendar.DATE);
			System.out.print("日\t一\t二\t三\t四\t五\t六");
			
			for(int i=0;i<calendar.get(calendar.DAY_OF_WEEK);i++) {
				System.out.print('\t');
			}
			
			
			
			
			
			int tmp=0;
			System.out.println();
			//可视化日历
			for(int i=1;i<=31;i++) {
				System.out.print(i+"\t");
				tmp++;
				if(tmp%7==0) {
					System.out.println();
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
