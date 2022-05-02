package ex14_1_OutPutStream;

import java.io.IOException;
import java.io.PrintStream;

public class Ex2_PrintStream {
	public static void main(String[] args) {
		
//		System.out.println();
		
		// 화면에 데이터를 출력하도록 하는 대표적인 클래스
		PrintStream ps = System.out;
		
		ps.write('A');
		ps.write('B');
		ps.write('\n');
		ps.write('C');
		ps.write('\n');
		
		byte [] by = {'J','A','V','A'};
		
		try {
			ps.write(by); // 배열로 받아올 경우 try_catch 필요
			// 배열의 파일 입출력 과정에서 에러가 날 가능성이 있기 때문
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ps.close(); // 닫아주지 않으면 어디까지 출력인지 프로그램이 모름.
	}

}
