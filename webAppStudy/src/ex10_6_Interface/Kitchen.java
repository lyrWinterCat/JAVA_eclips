package ex10_6_Interface;

//public class Kitchen implements Menu1, Menu2, Menu3{ // Menu1�� Menu2,3�� ��ӹ���
public class Kitchen implements Menu1{

	@Override
	public String jjajang() {
		return "�� + ���� + �ϵ���";
	}

	@Override
	public String jjambbong() {
		return "�� + ȫ�� + ��¡��";
	}

	@Override
	public String tangsuyuck() {
		return "������� + Ƣ��� + ���";
	}

	@Override
	public String bbokembab() {
		return "�� + ��� + ¥��ҽ�";
	}


}
