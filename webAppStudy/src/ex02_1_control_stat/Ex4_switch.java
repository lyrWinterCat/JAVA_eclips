package ex02_1_control_stat;

public class Ex4_switch {
	public static void main(String[] args) {
		// switch���� �񱳰����� Ȱ���� ������ �ڷ���
		// 1) ������ (byte, short, int)
		// 2) ������(char)
		// 3) ���ڿ� (String)
		
		String name="ȫ";
		
		switch(name) { //�񱳰�
		case "��": // �񱳸� �� ���ǰ�
			System.out.println("��浿");
			break;
		case "��":
			System.out.println("�̱浿");
			break;
		case "����":
			System.out.println("����浿");
			break;
		case "ȫ":
			System.out.println("ȫ�浿");
			break;
		default :
			System.out.println("���� �����Դϴ�.");
			break;
		
			
		}// switch
		
	}//main

}
