package ex06_String;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
		// �Է¹��� ���ڿ��� �ҹ��� a�� �� �� �ִ��� �Ǻ��ؼ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է��ϼ���");
		String words=sc.next();
		int cnt=0;
		for (int i = 0; i < words.length(); i++) {
			if(words.charAt(i)=='a') {
				cnt++;
			}
		}
		System.out.println(words+" ��  a ���� : "+cnt);
		System.out.println("----------------------------------------------------");
		
		// ���� �ѱ۷� ��ȯ�ϱ� (�ɽ��ؼ� ȥ�� �غ���)
		// 1024 >>�ϰ��̻�
		String [] han = {"��","��","��","��","��","��","��","ĥ","��","��"};
		int num = sc.nextInt();
		String sNum=""+num;
		String hangeul = "";
		for (int i = 0; i < sNum.length(); i++) {
//			hangeul+=han[Character.getNumericValue(sNum.charAt(i))];
			hangeul+=han[sNum.charAt(i)-'0'];
		}
		System.out.println(hangeul);
		
		System.out.println("----------------------------------------------------");
		// ȸ���� : ������ �о, �ڷ� �о �Ȱ��� ������ ����.
		// 12121
		
		// Ű���忡�� ���ڸ� �̻��� ���ڸ� �Է¹��� �� �ش� ���ڰ� ȸ�������� �ƴ����� �Ǵ��ϴ� �ڵ带 �ۼ��Ͻÿ�
		// Ű����� �Է¹��� ���ڴ� int�� �ƴ� String���� �ޱ�
		System.out.println("���ڸ� �̻��� ���ڸ� �Է����ּ���");
		String sNum2 = sc.next();
		String result="";

		for (int i = sNum2.length(); i>0; i--) {
//			System.out.println(i-1);
			result+=sNum2.charAt(i-1);
		}
		
		if(sNum2.equals(result)) {
			System.out.println(sNum2+" ��(��) ȸ�����Դϴ�.");
		}else {
			System.out.println(sNum2+" ��(��) ȸ������ �ƴմϴ�.");
		}
		
		
		
		
		
	}//main

}
