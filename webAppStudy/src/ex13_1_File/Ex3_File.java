package ex13_1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:\\web14_lyr\\aaa"; // 폴더생성
		File f = new File(path); // 폴더인지, 파일인지, 용량은 얼마인지까지는 알 수 있음  >> 파일 안의 내용까지는 알 수 없음
		
		// exists() : 파일 클래스가 path경로로 찾아가는 중
		// 존재하지 않는 폴더나 파일이 없다면  true로 반환 >> 해당 path의 모든 요소가 실제로 모두 존재한다면 true
		if(!f.exists()) { // 해당 경로에 해당하는 폴더가 있는지 판별 >> 현재 aaa폴더가 없으므로 !조건
			System.out.println("폴더 생성");
			f.mkdirs(); //리녹스 관련 개념. 폴더 만드는 메서드(명령어) makeDirectory (자동으로 폴더 생성 메서드)
			// .mkdir() >> 단수 폴더 생성
			// .mkdirs() >> 복수 폴더 생성. 실무에서 더 많이 사용. 단수 폴더 만들때도 사용 가능
		}else {
			System.out.println("폴더가 이미 있습니다.");
		}
	}

}
