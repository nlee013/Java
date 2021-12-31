package com.day9;

//constructor 생성자 property error는 method 문제
class TestC{
	
	private String title;
	protected int area;
	
	public TestC(String title) {
		this.title = title;
	}
	public void print() {
		System.out.println("title: " + area);
	}
}

class RectC extends TestC{
	private int w, h;
	
	public RectC(int w, int h) {
		super("Square"); //super는 1개만 호출가능. 맨위에만 작
						//super는 원래 생략되어있음.super는 숨겨져있는 생성자.
						 //TestC라는 부모
		
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		area = w*h;
	}
}

public class Test46 {

	public static void main(String[] args) {
		
		RectC ob = new RectC(10, 20);
		ob.rectArea();
		ob.print();
		
	}

}
