package com.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2day19 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Class name[java.lang.String]? ");
		
		String str = br.readLine();
		
		//***�Ʒ� �̰͸� �� ����ϱ�!!!!***
		Class cls = Class.forName(str);
		
		//String�� ������ Constructor ������ ����
		//overloading�Ǵ°� ���� ���� �� �־ �迭�� ����
		System.out.println("Constructor's data");//������ ��
		Constructor<?>[] c = cls.getConstructors();//Constructor<?>�� ? �����ص� ��
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.println(c[i]);
		}
		
		System.out.println("Field data...");//�ʵ� ����
		//java.lang.reflect ������ؼ� �̰ɷ� ����
		Field[] f = cls.getFields();
		
		for (int i = 0; i < f.length; i++) {
			
			System.out.println(f[i]);
		}
		
		
		System.out.println("Method data...");//�ʵ� ����
		//java.lang.reflect ������ؼ� �̰ɷ� ����
		Method[] m = cls.getMethods();
		
		for (int i = 0; i < m.length; i++) {
			
			System.out.println(m[i]);
		}
	}

}
