package com.day17;

import java.util.Random;
import java.util.Scanner;


public class Day16Assign {
	
	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] name =
			{"�����","��  ��","������","������","������",
			"�ڰ���","������","�缼��","��â��","������",
			"������","������","������","�輺��","ä����",
			"������","������","�̳���","���ȯ","���Ѽ�"};
		
		int inwon = 0;
		//String str;
		
		do {
			System.out.print("�ʰԱ��� ������ ��� �ο���?: ");
			inwon = sc.nextInt();
			
		}while(inwon > name.length || inwon < 1);	
		
		System.out.println("gg");
		
		int n = 0;
		
		while(n < 5) {
		
			name[n] = rd.toString();
			
			for(int i = 0; i < name.length; i ++) {
				
				name[i] = sc.next();
			}
		}
		System.out.print("������");
		System.out.println("�����մϴ�!!, ���Ƽ� �����սô�!"
				+ "\n��ǥ��: " + name);
	}
}


