package ex02_3_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		// �������� : �񱳿����ڸ� ���ؼ� ������ �� �� �̻� �ʿ��� �� �ۼ��ϴ� ������
		// && , || 
		
		//&&(and)
		// ��&&�� : ��
		// ��&&���� : ����
		// ����&&�� : ����
		// ����&&���� :����
		// ���� ������ �����̸� �ڿ� ������ ���� ����� ����
		int age = 21;
		int limit = 25;
		boolean res;
		res=(limit-age)<=5 && age >20;
		System.out.println(res);
		
		res=(limit-age)<=3 && (age+=2)>20;
		System.out.println(res);
		
		// ||(or) : ���� �����̳� ���� ������ �ϳ��� ���̶�� ���� ������
		// ��||�� = ��
		// ��||���� = ��
		// ����||��=��
		// ����||����=����
		int n1=10;
		int n2=20;
		
		res=(n1-n2)>10 || n2==20;
		System.out.println(res);
		
		// ���������� : 1�� ������ ��Ű�ų� 1�� ���Ҹ� ��Ű�� ������ (++,--)
		//1. ���� ���� ������
		//2. ���� ���� ������

		int a=10;
		int b=12;
		System.out.println("++a : "+ ++a);
		System.out.println("a++ : "+ a++); // ���� ��¶� 1�� ���ؼ� ���ð�
		System.out.println(a);
		
		System.out.println("--b : "+ --b);
		System.out.println("b-- : "+ b--);
		System.out.println(b);
		
		// ���׿����� : �ϳ��� ������ �����ؼ� ���� �� ������ ���̶�� true, �����̶��  false�� �������� ������
		// ? , :
		
		int num1 = 10;
		int num2 = 15;
		boolean result;
		char answer;
		int answer2;
		result = ++num1>=num2? true:false;
		System.out.println(result);
		
		answer = ++num1 >= num2 ? 'O':'X';
		System.out.println(answer);
		
		answer2 = ++num1 >= num2 ? 1:0;
		System.out.println(answer2);
		
		
		
		
		
	}

}
