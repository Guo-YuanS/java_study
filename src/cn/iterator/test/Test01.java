package cn.iterator.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Iterator iter = list.iterator();iter.hasNext();) {
			System.out.println((String)iter.next());
		}
		
		Set set = new HashSet();
		set.add("gys0");
		set.add("gys1");
		set.add("gys2");
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println((String)iterator.next());
		}
	}
}
