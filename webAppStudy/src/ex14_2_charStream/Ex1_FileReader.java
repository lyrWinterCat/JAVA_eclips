package ex14_2_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		//char 기반의 스트림은 reader, writer의 자식클래스들을 사용
		//기본적으로 2byte를 지원하기 때문에 2byte 언어로 구성된 파일도 쉽게 입출력이 가능함
		
		// 동영상, 음악 같은 파일들은 다운받은 사람도 재구성을 해서 받아야 하기 때문에 1byte씩 전달을 받는 것이 좋다.
		
		// char 기반의 스트림은 문서를 주고받을 때 이용하면 좋다.
		
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
