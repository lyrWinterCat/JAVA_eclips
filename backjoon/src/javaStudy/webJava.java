package javaStudy;

import java.io.File;
import java.io.FileInputStream;

public class webJava {
	
public static void main(String[] args) {
		
		String path = "C:\\web14_lyr\\test.txt";
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		//�迭�� int �������� ���� �� �ִ�.22����� ���� // �޸𸮴� �˳��ϰ� �ִ� ���� ���� // ������ �ʹ� ���ٸ� �޸𸮳���
		// ��Ȯ�ϰ� �޸𸮸� �־��ִ°� ���� ����
		// f.length() >> long�̱� ������ �ٷ� ������ ���� >> int�� ����ȯ �ؼ� �־��ָ� ����
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read);
				
				// ���� byte[]�� read���� test.txt ���� �о�� �����͵��� ����Ǿ��ִ�.
				// �̸� ���ڿ� ���·� �������Ͽ� ����� �� �ִ�.
				String res = new String(read);
				System.out.println(res);
				
				// ��Ʈ���� ���� ����� �Ŀ��� �ݵ�� �ݾ��־�� �Ѵ�.
				fis.close();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}//main

}
