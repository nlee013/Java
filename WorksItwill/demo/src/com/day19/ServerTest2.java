package com.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket> clients = new ArrayList<>();
	public BufferedReader br;
	
	public void serverStart() {
	
		try {
			
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("Server ����!!");
			
			while(true) {
				
				Socket sc = ss.accept();
				
				//socket�� ���� ������ thread �����ؾ߉�
				WorkThread wt = new WorkThread(sc);//sc�� �����ڿ� �־��ַ��� ������ WorkThread�� �ʼ��̱� ����
				wt.start();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Thread�� �������� ����� class
	class WorkThread extends Thread{
		
		//�����ε� ������ �����
		private Socket sc;
		
		public WorkThread(Socket sc) {
		
			this.sc = sc;
		}
		
		@Override
		public void run() {
			
		//client���� �޾Ƴ� ���̴�
			String ip = null;
			String msg = null;
			
			try {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				
				//���� �ߴ��� �˾ƾߵǹǷ� ip
				ip = sc.getInetAddress().getHostAddress();
				
				//������ socket
				clients.add(sc);
				
				//�ٸ� client���� ���� ������ ����ڰ� ������ ����� �˸�
				msg = ip + "]�� �����߽��ϴ�.";
				
				for(Socket s : clients) {
					//client�� ��Ƶ� socket
					
					//���� s�� ���̸� �̹��� pass(�������ƶ�.���������ƶ�)
					if(s == sc)
						continue;
					
					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					//������ �����͵� ������ ������ �� �ִ� �ְ� true (flush�� �Ȱ��� ����)
					pw.println(msg);
					
				}
				System.out.println(msg);//������ ����
				
				while((msg = br.readLine()) != null) {
					
					for(Socket s : clients) {
						//client�� ��Ƶ� socket
						
						//���� s�� ���̸� �̹��� pass(�������ƶ�.���������ƶ�)
						if(s == sc)
							continue;
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					
					System.out.println(msg);//������ ����
				}
				
			} catch (Exception e) {

				//������ ���� ���
				msg = ip + "]�� �����߽��ϴ�.";
				
				try {
					//���� ������ �ٸ� ����ڿ��� �޼��� ������
					
					for(Socket s : clients) {
						//client�� ��Ƶ� socket
						
						//���� s�� ���̸� �̹��� pass(�������ƶ�.���������ƶ�)
						if(s == sc)
							continue;
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
						
					}
					System.out.println(msg);//������ ����
					sc = null; //�ʱ�ȭ�� û��
					
				} catch (Exception e2) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {

		new ServerTest2().serverStart();
	}

}
