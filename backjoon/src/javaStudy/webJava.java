package javaStudy;

import java.io.File;
import java.io.FileInputStream;

public class webJava {
	
public static void main(String[] args) {
		
		String path = "C:\\web14_lyr\\test.txt";
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		//배열은 int 범위까지 만들 수 있다.22억까지 가능 // 메모리는 넉넉하게 주는 것이 좋음 // 하지만 너무 많다면 메모리낭비
		// 정확하게 메모리를 넣어주는게 제일 좋음
		// f.length() >> long이기 때문에 바로 넣지는 못함 >> int로 형변환 해서 넣어주면 가능
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read);
				
				// 현재 byte[]인 read에넌 test.txt 에서 읽어온 데이터들이 저장되어있다.
				// 이를 문자열 형태로 재조합하여 출력할 수 있다.
				String res = new String(read);
				System.out.println(res);
				
				// 스트림은 열고 사용한 후에는 반드시 닫아주어야 한다.
				fis.close();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}//main

}
