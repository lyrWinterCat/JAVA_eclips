package ex02_1_control_stat;

public class Ex2_switch {
	public static void main(String[] args) {
		// switch : �񱳰��� ���ǰ��� ���� ����� ����ϴ� ���
		// switch(�񱳰�){
		// case ���ǰ�:
		// 		�񱳰��� ���ǰ��� ��ġ�� �� ����Ǵ� ����
		// break;
		// }
		
		
		int n =3;
		// 1) �񱳰��� ���ǰ��� ������Ÿ���� �׻� ��ġ�ؾ� �Ѵ�.
		// 2) ���ǰ� (case)�� �ߺ��Ǹ�  ������ ����.
		
		
		switch(n) {
		case 1:
			System.out.println("���ӽ���");
			break;
		case 2:
			System.out.println("���� �Ұ�");
			break;
		case 3:
			System.out.println("���� ����");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.\n 1~3�� ������ �����ּ���");
			break;
		}//switch
		
		
		// if�� >> ���ǿ� ������ ������ �� �ִ�.
		int sc = 50;
		if(sc>=90) {
			System.out.println("A");
		}else if(sc>=80) {
			System.out.println("B");
		}else if(sc>=70) {
			System.out.println("C");
		}else if(sc>=60) {
			System.out.println("D");
		}else if(sc>=50) {
			System.out.println("F");
		}else {
			System.out.println("������ �ű� �� �����ϴ�");
		}
		
		
	}//main

}
