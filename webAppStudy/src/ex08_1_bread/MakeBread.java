package ex08_1_bread;

public class MakeBread {
	// 메서드 만들기 (각기 다른 기능을 호출하는 세 개의 메서드 작성) , 오버로드 사용
	// 메인 클래스에서 각각의 메서드를 호출했을 때 다음의 결과가 나오는 코드를 작성해보자
	
	// 결과
	// 빵을 만들었습니다. >> 첫번째 메서드 호출결과
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	
	// 빵을 만들었습니다.
	// 빵을 만들었습니다. >> 두번째 메서드 호출 결과
	// 요청하신 n개의 빵을 만들었습니다.
	public void makeBread(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+n+"개의 빵을 만들었습니다.");
	}
	
	
	// 크림빵을 만들었습니다.
	// 크림빵을 만들었습니다.
	// 크림빵을 만들었습니다.
	// 요청하신 oo빵을 n개 만들었습니다. >> 세번째 메서드 호출 결과
	public void makeBread(String breadName, int breadN) {
		for (int i = 0; i < breadN; i++) {
			System.out.println(breadName+"을 만들었습니다.");
		}
		System.out.println("요청하신 "+breadName+"을 "+breadN+"개 만들었습니다.");
	}

}
