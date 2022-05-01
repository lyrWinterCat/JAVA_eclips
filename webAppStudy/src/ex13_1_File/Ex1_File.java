package ex13_1_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		// IO (Input, Output) : ����� ��Ʈ��
		// ��Ʈ�� : ������ ������� ���� ���
		// JVM�� �������� ������ �������� ���� output / ������ �޴� ���� input
		
		// ���� web14_lyr ���� (�۾��� �ϰ� �ִ� ����)�ȿ� test.txt ���� ����
		// �ȳ��ϼ��� ���� �ٸ��̸����� ���� (���ڵ� ANSI)�ؼ� �����
		
		// String path �����ϱ� >> text ���� ������ ������
		String path = "C:/web14_lyr/test.txt"; //����̵��� �� �� /�� ���ų� \\�� ����
		
		File f = new File(path); // File Ŭ������ �����Ǹ鼭 path ��α��� ��Ʈ���� ����
		
		// isFile() : ���� Ŭ������ ������ ���� �������� ���������� ��� true
		if(f.isFile()) { // !f.isFile();
			System.out.println(f.length()+"byte"); // �ѱ� �ѱ��ڴ� 2byte. , ���ĺ� �ϳ� �Ǵ� �����ȣ�� 1byte
		}
		
	}

}
