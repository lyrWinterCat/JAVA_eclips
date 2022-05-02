package ex14_2_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		//test.txt ������ �о 
		// ���뿡 �빮�ڿ� �ҹ����� ������ ����Ͻÿ�
		
		// �빮�� �ƽ�Ű�ڵ� : 65(A)~90(Z)
		// �ҹ��� �ƽ�Ű�ڵ� : 97(a)~122(z)
		// �빮�� :
		// �ҹ��� :
		
		// �ѱ�, Ư�����ڴ� �Ǵ��� �ʿ䰡 �����ϴ�.
		
		try {
			FileReader fr = new FileReader("C:\\web14_lyr\\test.txt");
			int code=0;
			int bChar=0; //upper
			int sChar=0; //lower
			
			while((code=fr.read())!=-1) {
				System.out.print((char)code+" ");
				
				// �� ���ǽ�
//				for (int i = (int)'A'; i <=(int)'Z'; i++) {
//					if(i==code) {
//						bChar++;
//					}
//				}
//				for (int j = (int)'a'; j <=(int)'z'; j++) {
//					if(j==code) {
//						sChar++;
//					}
//				}
				
				// ���� �Ǻ���
				if(code>='A' && code<='Z') {
					bChar++;
				}else if(code>='a' && code<='z') {
					sChar++;
				}
				
			}//while
			
			System.out.println("\n�빮�� : "+bChar);
			System.out.println("�ҹ��� : "+sChar);
			
			fr.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
		}
	}


