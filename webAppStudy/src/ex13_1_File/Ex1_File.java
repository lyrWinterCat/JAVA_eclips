package ex13_1_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		// IO (Input, Output) : 입출력 스트림
		// 스트림 : 데이터 입출력을 위한 통로
		// JVM을 기준으로 파일을 내보내는 것이 output / 파일을 받는 것이 input
		
		// 각자 web14_lyr 폴더 (작업을 하고 있는 폴더)안에 test.txt 파일 만듦
		// 안녕하세요 적고 다른이름으로 저장 (인코딩 ANSI)해서 덮어쓰기
		
		// String path 변경하기 >> text 파일 생성한 곳으로
		String path = "C:/web14_lyr/test.txt"; //경로이동을 할 때 /로 쓰거나 \\로 쓰기
		
		File f = new File(path); // File 클래스가 생성되면서 path 경로까지 스트림을 생성
		
		// isFile() : 파일 클래스가 접근한 최종 목적지가 파일형식일 경우 true
		if(f.isFile()) { // !f.isFile();
			System.out.println(f.length()+"byte"); // 한글 한글자당 2byte. , 알파벳 하나 또는 문장부호는 1byte
		}
		
	}

}
