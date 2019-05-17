package cn.collections.test;

/**
 * 测试自定义堆栈MyStack
 * @author guoy10
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		MyStack<String> WebHistory = new MyStack<String>(4);
		WebHistory.push("www.dell.com");
		WebHistory.push("www.baidu.com");
		WebHistory.push("www.usst.com");
		WebHistory.push("www.google.com");
		WebHistory.push("www.jacky.com");
		
		System.out.println(WebHistory.size());
		//String temp = null;
		//while(null!=(temp=WebHistory.pop())){
			//System.out.println(temp);
		//}
		
		System.out.println(WebHistory.peek());
	}
}
