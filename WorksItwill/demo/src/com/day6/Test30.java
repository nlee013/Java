package com.day6;

public class Test30 {

	public static void main(String[] args) {

		String str = "Seoul Korea"; //String �ڷ��� ���� Ŭ����
		//index�� ������� : 0123456789
		
		System.out.println(str);
		System.out.println(str.substring(0, 3));//��.�� ������ ������ method�� ����
		System.out.println(str.substring(6, 8));//�Ϻκи� ���. ����� index�� ���.
		System.out.println(str.substring(6)); //������
	}

}
