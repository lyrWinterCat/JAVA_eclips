package ex06_String;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		// 입력받은 문자열에 소문자 a가 몇 개 있는지 판별해서 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자와 특수문자를 제외한 알파벳을 무작위로 입력하세요");
		String words=sc.next();
		int cnt=0;
		for (int i = 0; i < words.length(); i++) {
			if(words.charAt(i)=='a') {
				cnt++;
			}
		}
		System.out.println(words+" 의  a 개수 : "+cnt);
		System.out.println("----------------------------------------------------");
		
		// 숫자 한글로 변환하기 (심심해서 혼자 해본것)
		// 1024 >>일공이사
		String [] han = {"공","일","이","삼","사","오","육","칠","팔","구"};
		int num = sc.nextInt();
		String sNum=""+num;
		String hangeul = "";
		for (int i = 0; i < sNum.length(); i++) {
//			hangeul+=han[Character.getNumericValue(sNum.charAt(i))];
			hangeul+=han[sNum.charAt(i)-'0'];
		}
		System.out.println(hangeul);
		
		System.out.println("----------------------------------------------------");
		// 회문수 : 앞으로 읽어도, 뒤로 읽어도 똑같이 읽히는 숫자.
		// 12121
		
		// 키보드에서 세자리 이상의 숫자를 입력받은 후 해당 숫자가 회문수인지 아닌지를 판단하는 코드를 작성하시오
		// 키보드로 입력받은 숫자는 int가 아닌 String으로 받기
		System.out.println("세자리 이상의 숫자를 입력해주세요");
		String sNum2 = sc.next();
		String result="";

		for (int i = sNum2.length(); i>0; i--) {
//			System.out.println(i-1);
			result+=sNum2.charAt(i-1);
		}
		
		if(sNum2.equals(result)) {
			System.out.println(sNum2+" 은(는) 회문수입니다.");
		}else {
			System.out.println(sNum2+" 은(는) 회문수가 아닙니다.");
		}
		
		
		
		
		
	}//main

}
