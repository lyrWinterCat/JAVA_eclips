package ex11_2_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex5_Map {
	public static void main(String[] args) {
		// id�� pw�� Ű���忡�� ���� �޴´�
		
		// id : aaaa
		// pw : 1111
		// ���̵� �������� �ʽ��ϴ�.
		
		// id : lee
		// pw : 3333
		// ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		
		// id : park
		// pw : 3333
		// �α��� ����
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		int pw = sc.nextInt();
		
		if(map.containsKey(id)) {
			if(pw==map.get(id)) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		
		//���� �ڵ�
		if(!map.containsKey(id)) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} else {
			if(map.get(id)!=pw) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}else {
				System.out.println("�α��� ����");
			}
		}
	
		
		
		
		
		
	}

}
