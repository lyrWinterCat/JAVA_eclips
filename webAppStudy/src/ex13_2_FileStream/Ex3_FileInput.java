package ex13_2_FileStream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		String path = "C:\\web14_lyr\\test.txt";
		File f = new File(path);
		
		byte[] keyboard = new byte[100];
		
		try {
			System.out.println("�� : ");
			System.in.read(keyboard); // System.in : �ý��ۿ��� ���� �Է¹ޱ����� ǥ�� ��Ʈ��
			
			String s = new String(keyboard).trim();//trim() : ���� �յڷ� �ǹ̾��� ��ĭ ����
			System.out.println(s); // scanner�� ����
			
			Scanner sc = new Scanner(System.in);
			sc.close(); // ������ �׻� �ݾ��־�� ��
			// �ݴ� ���� �ٸ� Ŭ�������� ���� ��ĳ�ʰ� �������
			// ���� �ݾƾ߰ڴ� >> ��ĳ�ʸ� �� ���� ���������� �� Ŭ�������� �ݴ� ���� ����
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//main
}
