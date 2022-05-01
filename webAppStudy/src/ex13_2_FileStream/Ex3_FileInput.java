package ex13_2_FileStream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		String path = "C:\\web14_lyr\\test.txt";
		File f = new File(path);
		
		byte[] keyboard = new byte[100];
		
		try {
			System.out.println("값 : ");
			System.in.read(keyboard); // System.in : 시스템에서 값을 입력받기위한 표준 스트림
			
			String s = new String(keyboard).trim();//trim() : 내용 앞뒤로 의미없는 빈칸 삭제
			System.out.println(s); // scanner의 원리
			
			Scanner sc = new Scanner(System.in);
			sc.close(); // 원래는 항상 닫아주어야 함
			// 닫는 순간 다른 클래스에서 쓰던 스캐너가 멈춰버림
			// 굳이 닫아야겠다 >> 스캐너를 다 쓰고 마지막으로 쓴 클래스에서 닫는 것이 맞음
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//main
}
