package com.dss.client;
import com.dss.helper.Helper;
public class Client1 extends Helper{
	public void morn(){
		System.out.println("good morning  (from client1)");
	}
	public void even(){
		System.out.println("good evening  (from client1)");
	}
	public static void main(String[] args) {
		Client1 c = new Client1();
		c.morn();
		c.even();
		c.gn();
	}
}

