package ex14_1_OutPutStream;

import java.io.IOException;
import java.io.PrintStream;

public class Ex2_PrintStream {
	public static void main(String[] args) {
		
//		System.out.println();
		
		// ȭ�鿡 �����͸� ����ϵ��� �ϴ� ��ǥ���� Ŭ����
		PrintStream ps = System.out;
		
		ps.write('A');
		ps.write('B');
		ps.write('\n');
		ps.write('C');
		ps.write('\n');
		
		byte [] by = {'J','A','V','A'};
		
		try {
			ps.write(by); // �迭�� �޾ƿ� ��� try_catch �ʿ�
			// �迭�� ���� ����� �������� ������ �� ���ɼ��� �ֱ� ����
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ps.close(); // �ݾ����� ������ ������ ������� ���α׷��� ��.
	}

}
