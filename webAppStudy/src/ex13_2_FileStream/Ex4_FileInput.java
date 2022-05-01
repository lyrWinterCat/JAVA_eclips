package ex13_2_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4_FileInput {
	public static void main(String[] args) {
		// Ư�� ��ο� file.txt ������ �����
		// �������� �ƹ� �����̳� �Է��صд�.
		
		// file.txt�� ������ FileInputStream���� �о�� ��,
		// �� ���� ȸ�������� �ƴ����� �Ǵ��Ͻÿ�.
		
		// ȸ���� : ������ �о , �ڿ��� �о �Ȱ��� ������ ��
		// ��)a�丶��a , 12321, aa121aa 
		String path = "C:\\web14_lyr\\file.txt";
		File f = new File(path);
		String strRead="";
		String strRead2="";
		
		byte [] read = new byte[100];
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read);
				String res = new String(read);
				strRead=res;
				
				String check="";
				for (int i = res.length(); i >0 ; i--) {
					check+=res.charAt(i-1);
				}
				
				if(res.equals(check)) {
					System.out.println(res+" ��(��) ȸ���� �Դϴ�.");
				}else {
					System.out.println(res+" ��(��) ȸ������ �ƴմϴ�.");
				}
				
				
				fis.close();		
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//if
		
		String str = "";
		String str2 = "";
		String path2 = "C:\\web14_lyr\\file.txt";
		
		File f1 = new File(path2);
		try {
			FileInputStream fis2 = new FileInputStream(f1);
			int code = 0;
				while((code = fis2.read())!=-1) {
					str += (char)code;
				}
				
				for (int i =str.length(); i>0; i--) {
					str2+=str.charAt(i-1);
				}
				
				if(str.equals(str2)) {
					System.out.println(str+"��(��) ȸ�����Դϴ�.");
				}else {
					System.out.println(str+"��(��) ȸ������ �ƴմϴ�.");
				}
				
				if(fis2 !=null) {
					fis2.close();
				}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ������� comiit
		
		
		
		
	}//main

}
