package BuyPanel;

import java.util.ArrayList;

public class Test {
	public static ArrayList<Menu> menus=new ArrayList<Menu>();
	
	public static void setMenus(ArrayList<Menu> menus) {
		for(Menu menu : menus) {
			Test.menus.add(menu);
		}
//		Test.menus = menus; >>¿¡·¯
	}
	public Test() {}
}
