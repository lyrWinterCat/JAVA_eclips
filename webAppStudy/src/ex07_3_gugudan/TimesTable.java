package ex07_3_gugudan;

public class TimesTable {
	// �ǽ�
	// TimesTable�̶�� Ŭ������ ����� showTable()�̶�� �ϴ� �޼��� ����
	// showTable() �޼��� : �������� ����ϴ� �ڵ带 �ۼ�
	// TimesTableMainŬ������ ����� TimesTable��ü�� �����ϰ� ������ ���� ����� ����Ͻÿ�
	
	// Scanner�� ���� �޴� ���� �ݵ�� TimesTableMainŬ�������� �ϵ��� �Ѵ�.
	// ����� ���� �Է� : 5
	// 5 * 1 = 5
	// 5 * 2 = 10
	// ...
	// 5 * 9 = 45
	public void showTable(int dan){
		System.out.println(dan+"��");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d \n",dan,i,(dan*i));
		}		
	}

}
