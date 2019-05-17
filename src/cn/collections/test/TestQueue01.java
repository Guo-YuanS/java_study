package cn.collections.test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue01 {
	public static void main(String[] args) {
		Queue<Request> queue = new ArrayDeque<Request>();
		for(int i=0;i<10;i++) {
			final int temp = i;
			queue.offer(new Request() {

				@Override
				public void hanshu() {
					System.out.println("第"+temp+"个人，办理存款业务:"+Math.random()*10000);	
				}
				
			});
		}
		dealwith(queue);
	}
	
	public static void dealwith(Queue<Request> queue) {
		Request request  = null;
		while(null!=(request=queue.poll())) {
			request.hanshu();
		}
	}
	
	interface Request {
		void hanshu();
	}
}
