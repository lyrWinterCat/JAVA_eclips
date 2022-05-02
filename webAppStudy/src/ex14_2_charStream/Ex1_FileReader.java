package ex14_2_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		//char ����� ��Ʈ���� reader, writer�� �ڽ�Ŭ�������� ���
		//�⺻������ 2byte�� �����ϱ� ������ 2byte ���� ������ ���ϵ� ���� ������� ������
		
		// ������, ���� ���� ���ϵ��� �ٿ���� ����� �籸���� �ؼ� �޾ƾ� �ϱ� ������ 1byte�� ������ �޴� ���� ����.
		
		// char ����� ��Ʈ���� ������ �ְ���� �� �̿��ϸ� ����.
		
		try {
			FileReader fr = new FileReader("C:\\web14_lyr\\fileOut.txt");
			int code=0;
			
			while((code=fr.read())!=-1) {
				System.out.print((char)code+" ");				
			}
			
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
