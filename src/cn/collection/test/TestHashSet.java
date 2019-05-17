package cn.collection.test;

import java.util.HashMap;

public class TestHashSet {
	HashMap map;
	private static final Object PRSENT = new Object();
	int size;
	
	public TestHashSet() {
		map = new HashMap();
	}
	
	public int size() {
		return map.size();
	}
	
	public void add(Object o) {
		map.put(o, PRSENT);
	}
	
	public static void main(String[] args) {
		TestHashSet t = new TestHashSet();
		t.add("aaa");
		t.add(new String("aaa"));
		System.out.println(t.size());
	}
}
