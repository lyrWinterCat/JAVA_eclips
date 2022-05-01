package ex04_2_continue;

public class Ex3_label_continue {
	public static void main(String[] args) {
		
		happy: for (int i = 1; i <=3; i++) {
			
			for (int j = 1; j <=10; j++) {
				if(j%2==0) {
					// label을 가진 for문에 증감식으로 이동한다.
					continue happy;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}//for
	
	System.out.println("----------------------------------------");
	
	out: for (int i = 1; i <=3; i++) {
		
		for (int j = 1; j <=10; j++) {
			if(j%2==0) {
				// label을 가진 for문에 증감식으로 이동한다.
				break out;
			}
			System.out.print(j+" ");
		}
		System.out.println();
	}//for
		
	}

}
