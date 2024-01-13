package com.dass.client;
import com.dass.helper.Helper;
public class TestClient2 extends Helper{
	public void morning(){
		System.out.println("Morning from TestClient1");
	}
	public void evening(){
		System.out.println("evening from TestClient1");
	}
	public static void main(String[] args) {
		TestClient2 t = new TestClient2();
		t.morning();
		t.evening();
		t.night();
	}
}