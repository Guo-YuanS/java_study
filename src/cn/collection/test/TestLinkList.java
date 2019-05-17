package cn.collection.test;

public class TestLinkList {
	private Node first;
	private Node last;
	
	private int size;
	
	public void add(Object obj) {
		if(first==null) {
			Node node = new Node();
			node.setPrevious(null);
			node.setObject(obj);
			node.setNext(null);
			
			first = node;
			last = node;
		}
		else {
			Node node = new Node();
			node.setPrevious(last);
			node.setObject(obj);
			node.setNext(null);
			
			last = node;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index) {
		Node temp =null;
		if(index<0||index>=size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			if(first!=null) {
				temp = first;
				for(int i=0;i<index;i++) {
					temp = temp.next;
				}
			} 
		}
		return temp.object;
	}
	
	public static void main(String[] args) {
		TestLinkList list = new TestLinkList();
		list.add("aaa");
		list.add("bbb");
		System.out.println(list.size);
		System.out.println(list.get(1));
	}
	
	public void remove(int index) {
		Node temp = null;
		if(first!=null) {
			temp = first;
			for(int i=0;i<index;i++) {
				temp = temp.next;
			}
		}
		if(temp!=null) {
			Node pre = temp.previous;
			Node nex = temp.next;
			pre.next = nex;
			pre.previous = temp.next;
		}
	}
}

class Node{
	 Node previous;
	 Object object;
	 Node next;
	
	
	public Node() {
		super();
	}

	public Node(Node previous,Object object,Node next) {
		super();
		this.previous = previous;
		this.object = object;
		this.next = next;
	}
	
	public Object getPrevious() {
		return previous;
	}
	
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}