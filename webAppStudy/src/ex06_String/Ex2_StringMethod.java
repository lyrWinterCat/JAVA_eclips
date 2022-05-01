package ex06_String;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		// �޼���(���,�Լ�) : � ����� �����ϱ� ���� ��ɹ����� ����
		// �ݺ������� ����ϴ� �ڵ带 �̸� �����صΰ� �ʿ��� ������ �����ٰ� ����� �� �ִ�.
		
		// () �� ���� ���¸� �𸦶� Ŀ���� �ȿ� �ΰ� ctrl+space
		
		String str = "Hong Gil Dong";
		
		// length() : ���ڿ��� ���̸� �� �� ���. int�� ���� �޴´�. ***
		int idx = str.length(); //���鵵 �ϳ��� ���ڷ� �ν�
		System.out.println("str�� ���� : "+idx);
		
		// indexOf() : ()���� ���ڰ� String���� ó�� ������ ��ġ�� index������ int���·� ��ȯ ***
		idx=str.indexOf('o');
		System.out.println("str�� 'o'�� �� ó�� ������ ������ ��ġ : "+idx);
		
		// lastIndexof() : ()���� ���ڰ� String���� ���������� ������ ��ġ�� index������ int���·� ��ȯ
		idx=str.lastIndexOf('o');
		System.out.println("str���� 'o'�� ���� �������� ������ ��ġ : "+idx);
		
		// charAt(index) : String�� index�� �ش��ϴ� ���ڸ� char ���·� ��ȯ ***
		char res=str.charAt(5);
		System.out.println("str���� index�� 5�� ���ڴ� : "+res);
		
		// String �� �� �޼���
		String exam = "apple";
		
		//.contentEquals()
		if(exam.contentEquals("apple")) { // �ٸ� ��ü���� ���ڿ��� �������� Ȯ���Ҷ��� ��� ����
			// StringBuffer, StringBuilder , char Array ��� �� ����
			System.out.println("exam�� apple�Դϴ�.");
		}		
		//.equals()
		if(exam.equals("Apple")) { // �Ϻ��ϰ� ���� ������ ���ٴ� �� ��ȯ ����
			System.out.println("exam�� apple�Դϴ�.");
		}else {
			System.out.println("exam�� apple�� �ƴմϴ�.");
		}
		//.equalsIgnoreCase()
		if(exam.equalsIgnoreCase("Apple")) { // ��ҹ��ڸ� �����ϰ� �� ��
			System.out.println("exam�� apple�Դϴ�.");
		}else {
			System.out.println("exam�� apple�� �ƴմϴ�.");
		}
		
		// .trim() : String�� �ִ� ������ ���ִ� �޼ҵ� / ���ڿ� �յ��� �ǹ̾��� ���� ���� / ���ڿ� ���̻��̿� �ִ� ������ ���� ����>>split���� �������ټ�������
		String id=" abc ";
		if("abc".equals(id.trim())) {
			System.out.println("�α��� ����");
		}
		
		// ���ڿ����� ���� �������� Integer.parseInt(String)
		// ���������� ���ڿ��� ���� ������ �ٲ��ִ� �޼���
		String number = "100";
		int num=Integer.parseInt(number);
		System.out.println(num+5);
		
		// ������ ���ڿ��� �ٲٱ�
		int a = 10;
		String s1 = Integer.toString(a);
		System.out.println(s1);
		
		// �⺻ �ڷ����� wrapper Ŭ����
		// int -> Integer
		// char -> Character
		// boolean -> Boolean
		// byte -> Byte
		// long -> Long
		// float -> Float
		// double -> Double
		
//		int a = 10;
//		Integer a = 10; >> ���� ��������
		
		
		String [] str2 = str.split(" "); // ���ڿ��� .split("")�������� ����� �迭�� ��� �޼���
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}

}
