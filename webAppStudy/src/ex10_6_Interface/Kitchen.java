package ex10_6_Interface;

//public class Kitchen implements Menu1, Menu2, Menu3{ // Menu1¿¡ Menu2,3À» »ó¼Ó¹ŞÀ½
public class Kitchen implements Menu1{

	@Override
	public String jjajang() {
		return "¸é + ÃáÀå + ¿ÏµÎÄá";
	}

	@Override
	public String jjambbong() {
		return "¸é + È«ÇÕ + ¿ÀÂ¡¾î";
	}

	@Override
	public String tangsuyuck() {
		return "µÅÁö°í±â + Æ¢±è¿Ê + ¾ç³ä";
	}

	@Override
	public String bbokembab() {
		return "¹ä + °è¶õ + Â¥Àå¼Ò½º";
	}


}
