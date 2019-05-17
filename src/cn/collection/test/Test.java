package cn.collection.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map map = new HashMap();
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		map.put("source",list);
		
		//List list2 = new ArrayList();
		//list2 = (List) map.get("source");
		for(int i=0;i<list.size();i++) {
			System.out.println(((List)map.get("source")).get(i));
			//System.out.println(map.get("source"));
		}
		
	}

}
