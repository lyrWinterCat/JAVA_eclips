package ex02_3_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int res;
		
		res=++a >= b || 2 + (a-4) <= b && 13-b >= 0 && (a += b) - (a%b)>10 ? 1:0; //1
		System.out.println(res);
		
		/*
		 *  과수원이 있다.
		 * 배 사과 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5개
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고
		 * 시간당 전체 과일의 평균 생산 개수를 출력하세요.
		 * 
		 * 평균값을 담는 변수는 float.
		 * 
		 */
		int pear=5;
		int apple=7;
		int orange=5;
		int total;
		float avg;
		total = pear + apple + orange;
		avg = (total/24f);
		System.out.println("하루 생산 과일의 총 개수 : "+total+" 시간당 전체 과일의 평균 생산 개수 : "+String.format("%.3f",avg));

	}

}
