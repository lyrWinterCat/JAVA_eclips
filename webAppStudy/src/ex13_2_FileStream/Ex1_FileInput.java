package ex13_2_FileStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path ="C:\\web14_lyr\\test.txt";
		File f = new File(path);
		
		if(f.exists()){
			try {
				// ����Ŭ������ ���� ��η� �����ϱ� ���� �Է� ��Ʈ�� ����
				FileInputStream fis = new FileInputStream(f);
				
				int code=0;
				
					while((code=fis.read()) != -1) {//.read() �� 1byte���� ���� �� ���� //-1 : ��ȯ���� ������ ������ �� >>wile�� ����
						// read() �޼���� �ѹ��� 1byte�� �о���ٰ�
						// �� �̻� �о�� �ܾ ���ٸ� ������ ��(End of File)�� -1�� �����´�.
						
						System.out.print((char)code); // test.txt�� �ȳ��ϼ���abc ���  >>2byte�� �ѱ��� ����
						}
					if(fis != null) { //stream �̿� �� �ݾ��־�� ��
						fis.close();
					}

				
				} catch (Exception e) { // ���� ������ġ (������ �� �� ������ ���� ���)
				// TODO Auto-generated catch block
					e.printStackTrace();
				}

		
			}
		
	}//main

}
