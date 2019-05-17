package cn.collections.test;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 *队列实现自定义堆栈
 * @author guoy10
 *
 */
public class MyStack<E> {
	//创建一个容器
	private Deque<E> container = new ArrayDeque<E>();
	//定义一个容量
	private int cap;
	
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
	
	//压栈操作
	public boolean push(E e) {
		if(container.size()+1>cap) {
			return false;
		}
		return container.offerLast(e);
	}
	
	//弹栈操作
	public E pop() {
		return container.pollLast();
	}
	
	public E peek() {
		return container.peekLast();
	}
	
	public int size() {
		return this.container.size();
	}

}