package ex02_1_control_stat;

public class Ex1_if {
	public static void main(String[] args) {
		// ��� : ���α׷��� �����ϴ� ����
		// 1) �б⹮ : if, switch
		// 2) �ݺ��� : for, while
		
		// if��
		// if(���ǽ�) {
		// ���ǽ��� ���� ���� �� �����ϴ� ����
		// }
		
		int i = 50;
		String str = null;
//		if(i<100) {
//			System.out.println("i�� 100���� �۽��ϴ�.");
//		}
//		if(i<100) {
//			str = "i�� 100���� �۽��ϴ�";
//			System.out.println("i�� 100���� �۽��ϴ�");
//		}
//		System.out.println(str);
		
		// if-else
		// if(���ǽ�){
		// ���ǽ��� ���ϋ� �����ϴ� ����
		// } else {
		// ���ǽ��� ���� �ƴ� �� �����ϴ� ����
		// }
		if(i>100) {
			str = "i�� 100���� Ů�ϴ�.";
		}else {
			str = "i�� 100���� �۽��ϴ�.";
		}
		System.out.println(str);
		
		// 4/14 �� �ڵ� ���� �����ڷ� �ٲٱ� 
		String res = i>100? "i�� 100���� Ů�ϴ�" : "i�� 100���� �۽��ϴ�";
		System.out.println(res);
		
		
		if(++i>=50) {
			str = "i�� 50�̻��� ��";
		}else {
			str = "i�� 50 �̸��� ��";
		}
		System.out.println(str);
		
		/*
		 * age��� ������ ����� 30�̶�� �� �ֱ�
		 * ���� age�� 30 �̻��̶�� 30�� �̻��Դϴٸ� ���
		 * �׷��� ������ "30�� �̸��Դϴ�" ��� ���
		 * �������� "�����մϴ�" ���
		 */
		int age=30;
		String end = "�����մϴ�!";
		if(age>=30) {
			str = "30�� �̻��Դϴ�.";
			System.out.println(str+"\n"+end);			
		}else {
			str = "30�� �̸��Դϴ�.";
			System.out.println(str+"\n"+end);
		}
		
		// if, else - if, else
		// if(���ǽ�) {
		// ���ǽ��� ���϶� �����ϴ� ����
		// } else if(���ǽ�){
		// 		if������ �����̰�  else-if�϶��� ���϶� �����ϴ� ����
		// } else {
		// 		if�� else-if�� ��� ������ �� �����ϴ� ����
		// }
		
		int sc = 80;
		if(sc>=90) {
			str="A";
		}else if(sc>=80) {
			str="B";
		}else if(sc>=70) {
			str="C";
		}else if(sc>=60) {
			str="D";
		}else {
			str="F";
		}
		System.out.println(str);
		
		
	}//main
}
