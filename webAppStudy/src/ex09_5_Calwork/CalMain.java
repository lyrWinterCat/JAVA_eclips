package ex09_5_Calwork;

public class CalMain {
	public static void main(String[] args) {
		// Calculator �� getResult() �Լ��� �����ϰ� ��ȯ���� ����
		// ���� �� ��n1, n2)�� �ް� -1�� return�ϰ� ����ϴ�.
		
		//CalPlusŬ�������� �������̵��� ����Ͽ� Calculator�� getResult() �Լ���
		// ���ڷ� ���� n1�� n2�� �����ִ� �Լ��� ����ϴ�.
		// return���� -1�̸� �ȵ�
		
		// CalMinus Ŭ�������� �������̵��� ����Ͽ� Calculator�� getResult() �Լ��� 
		// ���ڷ� ���� n1�� n2�� ���ִ� �Լ��� ����
		
		// Main���� �����Ͽ� �Ʒ��� ���� ����� ������ ����
		// CalPlus : 30;
		// CalMinus : 15;
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		System.out.println("CalPlus : "+cp.getResult(10,20));
		System.out.println("CalMinus : "+cm.getResult(30,15));

	}

}
