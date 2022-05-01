package ex13_2_FileStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path ="C:\\web14_lyr\\test.txt";
		File f = new File(path);
		
		if(f.exists()){
			try {
				// 파일클래스가 가진 경로로 접근하기 위한 입력 스트림 생성
				FileInputStream fis = new FileInputStream(f);
				
				int code=0;
				
					while((code=fis.read()) != -1) {//.read() 는 1byte씩만 읽을 수 있음 //-1 : 반환값이 없을때 나오는 값 >>wile문 종료
						// read() 메서드는 한번에 1byte씩 읽어오다가
						// 더 이상 읽어올 단어가 없다면 문장의 끝(End of File)인 -1을 가져온다.
						
						System.out.print((char)code); // test.txt의 안녕하세요abc 출력  >>2byte인 한글은 깨짐
						}
					if(fis != null) { //stream 이용 후 닫아주어야 함
						fis.close();
					}

				
				} catch (Exception e) { // 이중 안전장치 (오류가 날 수 있음에 대한 대비)
				// TODO Auto-generated catch block
					e.printStackTrace();
				}

		
			}
		
	}//main

}
