package com.day19;

import java.io.IOException;

//class�� class
//Ư�� class�� interface�� ������ �˻� �� �� �ִ� method�� ������ �ִ�

class Test{
	
	public void write() {
		
		System.out.println("Test...");
	}
}

public class Test1day19 {

	public static void main(String[] args) throws Exception {

		//���߿� DB�� �� ��뿹��
		Class c = Class.forName("com.day19.Test");//package�̸��� �� ��ߵȴ�//throws Exception
		//Class<?>->���� �����ߴ�
		//c�ȿ� ��� ������ ����
		//forName�� ���� �о�´�
		
		//����صα�  c.newInstance();
		Object o = c.newInstance();//��ü ����.Object������ ������ downcast�����ض�
		
		Test t = (Test)o;//downcast
		t.write();
		//o.write();�� �ȉ�. �θ�� �ڽĲ��� ������.
		
	}

}
