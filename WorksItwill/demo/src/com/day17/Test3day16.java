package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader:1byte Stream을 2byte Stream으로 변환해주는 Stream.
//Bridge Stream이라고도 함 
public class Test3day16 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("Type characters: ");
		
		//혼자 독자적으로 사용X.얘는 어딘가에 넣어줘야됨
		//java도 보급형 저장소가 있음-> Reader: 대충 아무거나 다 넣을수있음
		Reader rd = new InputStreamReader(System.in);//찰떡인 애는 BufferedReader
		
		while((data = rd.read()) != -1) {
			
			char ch = (char) data;
			System.out.print(ch);
		}
	}

}
