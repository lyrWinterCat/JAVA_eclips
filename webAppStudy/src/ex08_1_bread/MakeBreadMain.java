package ex08_1_bread;

import java.util.Scanner;

public class MakeBreadMain {
	public static void main(String[] args) {
		MakeBread mb = new MakeBread();
		Scanner sc = new Scanner(System.in);
		
		mb.makeBread();
		System.out.println("----------------");
		System.out.println("»§À» ¸¸µé °¹¼ö : ");
		mb.makeBread(sc.nextInt());
		System.out.println("----------------");
		System.out.println("¸¸µé »§ÀÇ Á¾·ù : ");
		String bread=sc.next();
		System.out.println("»§À» ¸¸µé °¹¼ö : ");
		int breadNum=sc.nextInt();
		mb.makeBread(bread, breadNum);
		System.out.println("----------------");
		
	}

}
