package com.day17;

import java.io.Serializable;

public class MyDataVO implements Serializable{//implements Serializable�� ����� ����ȭ��

	private static final long serialVersionUID = 1L;
	private String name;
	private int score;
	
	//�����ڸ� �����ε��ϱ�
	public MyDataVO(String name, int score) {
		
		this.name = name;
		this.score = score;
	}

	//������ �׻� getter, setter �ؾߵ����� �̹����� ���� �����ڷ� �����ε��ؼ� ���� �Ẹ��!
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		
		return name + ":" + score;
	}
}
