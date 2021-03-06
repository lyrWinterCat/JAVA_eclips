package ex13_2_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4_FileInput {
	public static void main(String[] args) {
		// 특정 경로에 file.txt 문서를 만들고
		// 내용으로 아무 문장이나 입력해둔다.
		
		// file.txt의 내용을 FileInputStream으로 읽어온 뒤,
		// 이 값이 회문수인지 아닌지를 판단하시오.
		
		// 회문수 : 앞으로 읽어도 , 뒤에서 읽어도 똑같이 읽히는 값
		// 예)a토마토a , 12321, aa121aa 
		String path = "C:\\web14_lyr\\file.txt";
		File f = new File(path);
		
		byte [] read = new byte[(int)f.length()];
		if(f.exists()) { //파일 경로가 올바른지
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read);//fis가 읽어온 내용을 read배열에 저장
				
				// read 배열에 담긴 내용을 string타입으로 변경
				String res = new String(read);
				
				//string check 를 null로 초기화하면 안됨. heap영역에 메모리 할당 자체가 되지 않음. 가급적이면 ""을 쓰는 것이 좋음
				String check="";
				
				// 회문수 판별 반복문
				for (int i = res.length(); i >0 ; i--) {
					check+=res.charAt(i-1);
				}
				
				if(res.equals(check)) {
					System.out.println(res+" 은(는) 회문수 입니다.");
				}else {
					System.out.println(res+" 은(는) 회문수가 아닙니다.");
				}
				
				
				fis.close();		
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//if
		
		// 여기는 영문자나 숫자일때 (한글이 아닐때 )
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
					System.out.println(str+"은(는) 회문수입니다.");
				}else {
					System.out.println(str+"은(는) 회문수가 아닙니다.");
				}
				
				if(fis2 !=null) {
					fis2.close();
				}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}//main

}
