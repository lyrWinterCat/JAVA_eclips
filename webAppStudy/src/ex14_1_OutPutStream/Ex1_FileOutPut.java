package ex14_1_OutPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex1_FileOutPut {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/web14_lyr/fileOut.txt");
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			String msg = "fileOutPut 예제입니다.\n";
			String msg2 = "여러 줄도 가능합니다.\n";
			
			//String str = new String(byte배열); >> 바이트배열을 문자열로 바꾸는 방법
			
			fos.write(msg.getBytes()); // 문자열 msg를 byte[]배열로 변경하는 메서드
			fos.write(msg2.getBytes());
			
			fos.close(); // 항상 닫아주어야함
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
