package com.dss.client;
import com.dss.declarations.Message;
public class Client2 implements Message{
	public void gn(){
		System.out.println("good night  (from client2)");
	}
	public void morn(){
		System.out.println("good morning  (from client2)");
	}
	public void even(){
		System.out.println("good evening  (from client2)");
	}
	public static void main(String[] args) {
		Client2 c = new Client2();
		c.morn();
		c.even();
		c.gn();
	}
}