package cn.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author guoy10
 *
 */
public class CollectionsDemo1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		test01(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 3));
		//Collections.reverse(list);
		//System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.println(list);
		
		for(int i=0;i<54;i++) {
			list2.add(i);
		}
		
		test02(list2);
		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		List<Integer> p3 = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();
		
		for(int i=0;i<51;i+=3) {
			p1.add(list2.get(i));
			p2.add(list2.get(i+1));
			p3.add(list2.get(i+2));
		}
		
		last.add(list2.get(51));
		last.add(list2.get(52));
		last.add(list2.get(53));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(last);
	}
	
	public static void test01(List<Integer> list) {
		Collections.sort(list);
	}
	
	public static void test02(List<Integer> list) {
		Collections.shuffle(list);
	}
}
