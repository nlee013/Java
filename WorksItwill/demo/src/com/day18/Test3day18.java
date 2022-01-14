package com.day18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3day18 extends Frame {

	public Test3day18() {
		
		setTitle("Java Window");
		setSize(300, 300);
		setBackground(new Color(170, 227, 227));
		
		//���⼭�� �ٸ� �͵��� �����Ӱ� �������� ������
		//���� ��ư������ �����ڸ� ���̷��� �Ѵ�
		//addWindowListener(new MyWindowAdapter());//������ ����?.�ʿ��� class�� �ȿ� �ִ´�
		
		//WindowAdapter() -> ������ Anonymous class�̹Ƿ� directly�� override �� �� �ִ� method�� ��������
		//�Ʒ����� �ڵ��� ������ ���� �����
		//���� ���� class�� ������ ���� �־��൵ ������ �Ʒ�ó�� �Ἥ �ʿ��� override method�� ������ϸ� ��
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	
	//��ġ�� �� ���� �Ʒ��� ���� ���� �̹��� �߰��� �Ẹ��
	//Window Listener�� ������ �ϰ� �����
	//WindowAdapter���� ����� method�� �����ؼ� override�Ѵ�
	
	/*
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}*/
	
	public static void main(String[] args) {

		new Test3day18();
	}

}
