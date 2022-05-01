package ex04_1_break;

public class Ex3_label_break {
	public static void main(String[] args) {
		//label : 특정 반복문에 이름표를 붙여 두 개 이상의 반복문을
		//		 제어할 수 있도록 하는 키워드
		// label은 항상 쌍으로 존재한다.
		// label의 이름은 자기가 원하는 대로 사용이 가능하다.
		
		// label은 자신을 포함하고 있는 상위 개념에게만 달 수 있다.
		
		out: for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=10; j++) {
				if(j%2==0) {
					break out;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	// 이렇게 사용하는 것은 불가능
	// 내가 속한 곳에서 label을 선언해야함
//	for (int i = 1; i <=3; i++) {
//		happy : for(int k = 1; k<=10; k++) {
//			System.out.print(k+" ");
//		}
//		for (int j = 1; j <=10; j++) {
//			if(j%2==0) {
//				break happy;
//			}
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	// 바깥 for (여기에 label이 있다면 빠져나갈 수 있음)
	// 		안 for (여기에 label을 달게 되면 >>포함하고 있는 개념이 아님. (밑의 for문을 빠져나와서 여기로 들어가겠다?? >>성립 X)
	// 		안 for //break , label (라벨이 달린 곳을 빠져나가겠다!) >> 본인을 포함한 상위 개념으로만 갈 수 있다.
		
	}//main

}
