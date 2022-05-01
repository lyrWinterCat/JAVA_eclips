package ex13_1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path="C:\\web14_lyr";
		File f = new File(path);
		
		if(!f.isFile()) {
			String[] names=f.list();
			// f.list가 해당 path로 들어가서 폴더들을 리스트 형식으로 정리
			// >> 폴더 안에 있는 하위 요소들의 이름을 모두 가져옴
			// >> 가져온 하위 요소들을 names 배열에 저장
			// >> 반환형 : String배열
			// >> 폴더 안에 있는 하위 요소들의 개수에 맞춰 알아서 배열의 방 개수 생성
			// >> 알파벳 순서에 따라 정렬을 해준다.
			for(String s : names) {
				System.out.println(s); // 알파벳 순서대로 해당 path 안의 하위 요소들 이름이 출력됨
			}
		}
	}

}
