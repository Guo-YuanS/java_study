package cn.collection.test;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author guoy10
 *
 */

public class Test01 {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1196526,"Guo-YS","Platform",18000,"2019-03");
		Employee e2 = new Employee(1196519,"Jacky","Platform",18000,"2018-11");
		Employee e3 = new Employee(1196526,"Tao","Platform",18000,"2018-12");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		printEmployeeName(list);
	}
	
	public static void printEmployeeName(List<Employee> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
