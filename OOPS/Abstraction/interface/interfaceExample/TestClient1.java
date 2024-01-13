package com.dass.client;
import com.dass.declarations.Message;
public class TestClient1 implements Message{
	public void morning(){
		System.out.println("Morning from TestClient1");
	}
	public void evening(){
		System.out.println("evening from TestClient1");
	}
	public void night(){
		System.out.println("night from TestClient1");
	}
	public static void main(String[] args) {
		TestClient1 t = new TestClient1();
		t.morning();
		t.evening();
		t.night();
	}
}