package com.day20;

import java.io.Serializable;

//Client:file�� ���� �� fileinputStram file�� ������ fileoutputStream
//Client --upload-->Server
//class�� ���� �Ѹ��� �ƴ� code number, size, data�� ���´�

//1.������ ���� Ŭ���� �����
//2.���� Ŭ������ �����ϱ�
public class FileInfo implements Serializable{//Serializable �ݵ�� ����

	private static final long serialVersionUID = 1L;

	/*
	code
	100: file ����(file name ����)
	110: file ���� ����
	200: file ���� ����(file name ����)
	size: �ѹ��� ���� �� �ִ� file ũ��
	data: ���� data
	*/
	
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	//�����͸� ���� �� �ݵ�� byte�������θ� ���� �� �ִ�
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	
}
