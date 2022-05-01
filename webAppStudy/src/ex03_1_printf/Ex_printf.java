package ex03_1_printf;

public class Ex_printf {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 7;
		
		System.out.println(su1+" + "+su2+" = "+(su1+su2));
		
		System.out.printf("%d + %02d = %d\n", su1, su2, (su1+su2)); // 10 + 07 = 17
		// printf 사용시 마지막 " 앞에 \n을 꼭 붙여주어야 한다.(줄바꿈) 
		
		//printf 에 f는 format이라는 뜻이다.
		// 여러개 %를 쓸 경우 뒤에 , 도 알맞게 써 주어야 한다(그렇지 않을 시 에러)
		// %d : 정수형 / %02d >> 모든 정수를 두자릿수로 표기함 / %03d >> 모든 수를 세자릿수로 표기함
		// %s: 문자형 
		// %f : 실수형 / %.nf >> 소숫점 n번째 자리까지 표기
		// %c: 문자열 
		// %n: 줄바꿈 
		// %b : boolean 출력
		
		int age = 30;
		
		// 저의 나이는 30세 입니다.
		System.out.printf("저의 나이는 %d세 입니다.\n",age);
		
		// 저의 나이는 30세이고 키는 170 입니다.
		System.out.printf("\n저의 나이는 %d세 이고 키는 %d 입니다.\n",age,170);
		
		// 저의 혈액형은 AB형 입니다 >> 문자열을 쓰고 싶은 경우 %s
		System.out.printf("저의 혈액형은 %s형 입니다.\n", "AB");
		
		// 원주율은 3.141592입니다.
		System.out.printf("원주율은 %.2f 입니다.\n", 3.141592);
		// %.원하는자리수f >> 소수점 n번째 자리까지 표기
		
		System.out.println("-------------------------------------------");
		
		// 01 02 03 04
		// 05 06 07 08
		// 09 10 11 12
		int num=1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%02d ",num++);
			}
			System.out.println();
		}
		
	}

}
