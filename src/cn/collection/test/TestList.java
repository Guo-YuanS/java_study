package cn.collection.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("aaa");
		list.add(1234);
		list.add(new o());
		list.add(new Date());
		
		System.out.println(list.size());
		
		//list.remove("aaa");
		//System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}
}

class o{
	
}