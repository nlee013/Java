package com.day18;

import java.awt.Color;
import java.awt.Frame;

//�̹������� Event ������ Program�� ��� �����̴� Ȯ���� ���̴�
//EVENT : �巡��, Ŭ�� ���
//��������� c#:â�� form, MFS(C���), java :â�� frame.window�� frame�� �ƹ���

//AWT
public class Test1day18 extends Frame{//interface�� ����

	private static final long serialVersionUID = 1L;
	
	//main���� �ڵ�����
	
	public Test1day18() {
		
		
		setTitle("Java's Window");
		setSize(200, 300);
		setBackground(new Color(170, 227, 227));//RGB
		
		setVisible(true);//�⺻���� false�̹Ƿ� true�� �ٲ���
	}
	public static void main(String[] args) {

		//������ �����Ѵ�
		new Test1day18();
		//�տ� ob�� �ʿ���� ������ �������� event����(Ŭ���ϸ� ��ĥ�����ٰų�) ������ �ʿ����
		
	}

}
