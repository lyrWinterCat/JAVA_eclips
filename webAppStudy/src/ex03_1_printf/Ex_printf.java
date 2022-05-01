package ex03_1_printf;

public class Ex_printf {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 7;
		
		System.out.println(su1+" + "+su2+" = "+(su1+su2));
		
		System.out.printf("%d + %02d = %d\n", su1, su2, (su1+su2)); // 10 + 07 = 17
		// printf ���� ������ " �տ� \n�� �� �ٿ��־�� �Ѵ�.(�ٹٲ�) 
		
		//printf �� f�� format�̶�� ���̴�.
		// ������ %�� �� ��� �ڿ� , �� �˸°� �� �־�� �Ѵ�(�׷��� ���� �� ����)
		// %d : ������ / %02d >> ��� ������ ���ڸ����� ǥ���� / %03d >> ��� ���� ���ڸ����� ǥ����
		// %s: ������ 
		// %f : �Ǽ��� / %.nf >> �Ҽ��� n��° �ڸ����� ǥ��
		// %c: ���ڿ� 
		// %n: �ٹٲ� 
		// %b : boolean ���
		
		int age = 30;
		
		// ���� ���̴� 30�� �Դϴ�.
		System.out.printf("���� ���̴� %d�� �Դϴ�.\n",age);
		
		// ���� ���̴� 30���̰� Ű�� 170 �Դϴ�.
		System.out.printf("\n���� ���̴� %d�� �̰� Ű�� %d �Դϴ�.\n",age,170);
		
		// ���� �������� AB�� �Դϴ� >> ���ڿ��� ���� ���� ��� %s
		System.out.printf("���� �������� %s�� �Դϴ�.\n", "AB");
		
		// �������� 3.141592�Դϴ�.
		System.out.printf("�������� %.2f �Դϴ�.\n", 3.141592);
		// %.���ϴ��ڸ���f >> �Ҽ��� n��° �ڸ����� ǥ��
		
		System.out.println("-------------------------------------------");
		
		// 01 02 03 04
		// 05 06 07 08
		// 09 10 11 12
		int num=1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%02d ",num++);
			}
			System.out.println();
		}
		
	}

}
