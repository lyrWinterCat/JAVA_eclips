package ex02_3_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
		// ������
		/*
		 * 1. �ְ� ������ : . , () >> ���� ���� ����(���)��
		 * 2. ���� ������ : ++ , -- (1�� ����/����)
		 * 3. ��� ������ : +,-,*,/,%(��ⷯ, ���� �ƴ� �������� �����´�.)
		 * 4. ����Ʈ ������ : >> , << , >>>
		 * 5. �� ������ : < , > , <= , >= , == , != (!�� �ƴϴ�. �ٸ���. �� ��)
		 * 6. ��Ʈ ������ : & , | , ^ , ~
		 * 7. �� ������ : &&(and) , ||(or) , !(not)
		 * 8. ����(����) ������ : ? , : (���� ? �� : ���� )
		 * 9. ���� ������ : = (�������� ���� ���ʿ� ����) , *= , /= , %= , += , -=
		 */
		
		// ��������� : 4Ģ����� ������ �����ڸ� ���� �ִ� ������
		// + , - , * , / , %
		int n1, n2, n3;
		n1=20;
		n2=7;
		n3=n1+n2;
		System.out.println(n3);
		n3=n1-n2;
		System.out.println(n3);
		n3=n1*n2;
		System.out.println(n3);
		n3=n1/n2;
		System.out.println("n1 / n2 = "+n3+"��");
		n3=n1%n2;
		System.out.println("n1 % n2 = "+n3+"������");
		System.out.println("------------------------");
		
		// ���Կ����� : Ư������ ������ �����ϱ� ���ؼ� ����ų �� ����ϴ� ������
		// = , += , -= , *= , /= , %=
		// a (+=,-=,*=,/=,%=)b = a(+,-,*,/,%)b
		int num1 = 10;
		int num2 = 7;
		System.out.println("= : num1 num2 = "+num1+" "+num2);
		
		//+= ������
		int num3 = 13;
		int num4 = 15;
		// num3+=num4 >> num3 = num3+num4
		num3+=num4;
		System.out.println("+=������ (num3+=num4): "+num3);
		
		int num5=20;
		int num6 = 10;
		num5-=num6;
		System.out.println("-=������ (num5-=num6): "+num5);
		
		int num7=20;
		int num8=7;
		System.out.println("/=������(num7/=num8) : "+(num7/=num8));
		
		int num9=20;
		int num10=7;
		// �ƴϸ� num7,8�� �ٽ� 20,7�̶� ���� �־��൵ ��
		System.out.println("%=������(num9%=num10) : "+(num9%=num10));
		
		int num11=10;
		int num12=15;
		System.out.println("*=������(num11*=num12) : "+(num11*=num12));
		
	}//main
}
