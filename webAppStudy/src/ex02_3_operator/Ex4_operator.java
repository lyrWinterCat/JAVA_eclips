package ex02_3_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int res;
		
		res=++a >= b || 2 + (a-4) <= b && 13-b >= 0 && (a += b) - (a%b)>10 ? 1:0; //1
		System.out.println(res);
		
		/*
		 *  �������� �ִ�.
		 * �� ��� �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5, 7, 5��
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ����ϰ�
		 * �ð��� ��ü ������ ��� ���� ������ ����ϼ���.
		 * 
		 * ��հ��� ��� ������ float.
		 * 
		 */
		int pear=5;
		int apple=7;
		int orange=5;
		int total;
		float avg;
		total = pear + apple + orange;
		avg = (total/24f);
		System.out.println("�Ϸ� ���� ������ �� ���� : "+total+" �ð��� ��ü ������ ��� ���� ���� : "+String.format("%.3f",avg));

	}

}
