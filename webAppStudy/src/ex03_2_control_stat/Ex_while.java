package ex03_2_control_stat;

public class Ex_while {
	public static void main(String[] args) {
		// while : for문보다는 간결한 문법을 지닌 반복문(선비교, 후처리)
		
		// while(조건식){
		// 조건식이 참일때 실행되는 영역
		// }
		int num = 3;
		while(num<5) {
			System.out.println('a');
			num++;
		}
		while(true) {// 무한반복
			System.out.println(1);
		}
	}

}
