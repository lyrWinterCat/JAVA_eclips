package ex13_1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:\\web14_lyr\\aaa"; // ��������
		File f = new File(path); // ��������, ��������, �뷮�� ������������ �� �� ����  >> ���� ���� ��������� �� �� ����
		
		// exists() : ���� Ŭ������ path��η� ã�ư��� ��
		// �������� �ʴ� ������ ������ ���ٸ�  true�� ��ȯ >> �ش� path�� ��� ��Ұ� ������ ��� �����Ѵٸ� true
		if(!f.exists()) { // �ش� ��ο� �ش��ϴ� ������ �ִ��� �Ǻ� >> ���� aaa������ �����Ƿ� !����
			System.out.println("���� ����");
			f.mkdirs(); //���콺 ���� ����. ���� ����� �޼���(��ɾ�) makeDirectory (�ڵ����� ���� ���� �޼���)
			// .mkdir() >> �ܼ� ���� ����
			// .mkdirs() >> ���� ���� ����. �ǹ����� �� ���� ���. �ܼ� ���� ���鶧�� ��� ����
		}else {
			System.out.println("������ �̹� �ֽ��ϴ�.");
		}
	}

}
