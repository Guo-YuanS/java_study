package cn.collectionmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		String string = "Jacky is a dog and i am a man";
		String[] strArrlist = string.split(" ");
		
		Map<String, letter> map = new HashMap<String,letter>();
		for(String temp:strArrlist) {
			letter coLetter = null;
			if((coLetter=map.get(temp))==null) {
				coLetter = new letter();
				coLetter.setCount(1);
				map.put(temp,coLetter);
			}else {
				coLetter.setCount(coLetter.getCount()+1);
			}
		}
		Set<String> set = map.keySet();
		/*Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println("字母："+iterator.next()+" 数量："+map.get(iterator.next()).getCount());
		}*/
		for(String temp:set) {
			letter col = map.get(temp);
			System.out.println("字母:"+temp+" 数量:"+col.getCount());
		}
	}
}
