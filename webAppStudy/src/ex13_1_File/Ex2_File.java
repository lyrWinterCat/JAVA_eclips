package ex13_1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path="C:\\web14_lyr";
		File f = new File(path);
		
		if(!f.isFile()) {
			String[] names=f.list();
			// f.list�� �ش� path�� ���� �������� ����Ʈ �������� ����
			// >> ���� �ȿ� �ִ� ���� ��ҵ��� �̸��� ��� ������
			// >> ������ ���� ��ҵ��� names �迭�� ����
			// >> ��ȯ�� : String�迭
			// >> ���� �ȿ� �ִ� ���� ��ҵ��� ������ ���� �˾Ƽ� �迭�� �� ���� ����
			// >> ���ĺ� ������ ���� ������ ���ش�.
			for(String s : names) {
				System.out.println(s); // ���ĺ� ������� �ش� path ���� ���� ��ҵ� �̸��� ��µ�
			}
		}
	}

}
