package ex14_1_OutPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex1_FileOutPut {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/web14_lyr/fileOut.txt");
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			String msg = "fileOutPut �����Դϴ�.\n";
			String msg2 = "���� �ٵ� �����մϴ�.\n";
			
			//String str = new String(byte�迭); >> ����Ʈ�迭�� ���ڿ��� �ٲٴ� ���
			
			fos.write(msg.getBytes()); // ���ڿ� msg�� byte[]�迭�� �����ϴ� �޼���
			fos.write(msg2.getBytes());
			
			fos.close(); // �׻� �ݾ��־����
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
