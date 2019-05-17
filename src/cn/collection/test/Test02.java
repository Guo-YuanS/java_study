package cn.collection.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
		Map map0 = new HashMap();
		map0.put("id", 1196526);
		map0.put("name", "Guo-yuans");
		map0.put("salary", 15000);
		map0.put("hiredate", "2018-12");
		
		Map map1 = new HashMap();
		map1.put("id", 111214);
		map1.put("name", "jacky");
		map1.put("salary", 15000);
		map1.put("hiredate", "2018-11");
		
		Map map2 = new HashMap();
		map2.put("id", 112311);
		map2.put("name", "taoqiu");
		map2.put("salary", 15000);
		map2.put("hiredate", "2018-11");
		
		
		List<Map> list = new ArrayList<Map>();
		list.add(map0);
		list.add(map1);
		list.add(map2);
		
		printId(list);
	}
	
	public static void printId(List<Map> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).get("id"));
		}
	}
}
