package ex14_2_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		//test.txt 내용을 읽어서 
		// 내용에 대문자와 소문자의 개수를 출력하시오
		
		// 대문자 아스키코드 : 65(A)~90(Z)
		// 소문자 아스키코드 : 97(a)~122(z)
		// 대문자 :
		// 소문자 :
		
		// 한글, 특수문자는 판단할 필요가 없습니다.
		
		try {
			FileReader fr = new FileReader("C:\\web14_lyr\\test.txt");
			int code=0;
			int bChar=0; //upper
			int sChar=0; //lower
			
			while((code=fr.read())!=-1) {
				System.out.print((char)code+" ");
				
				// 내 조건식
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
				
				// 강사 판별식
				if(code>='A' && code<='Z') {
					bChar++;
				}else if(code>='a' && code<='z') {
					sChar++;
				}
				
			}//while
			
			System.out.println("\n대문자 : "+bChar);
			System.out.println("소문자 : "+sChar);
			
			fr.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
		}
	}


